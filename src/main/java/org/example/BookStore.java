package org.example;

import org.example.exceptions.*;
import org.example.model.Ebook;
import org.example.model.PaperBook;
import org.example.model.isBuyable;
import org.example.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookStore {
    public void addBook (Book book) {
        if(book instanceof PaperBook) {
            PaperBook paperBook = (PaperBook) book;
            Inventory.add(paperBook);
        }
        else if(book instanceof Ebook) {
            Ebook ebook = (Ebook) book;
            Inventory.add(ebook);
        }
        else {
            Demobook demobook = (Demobook) book;
            Inventory.add(demobook);
        }
    }

    public List<Book> removeBooksOutDated(int year) {
        List<Book> books = Inventory.getBooks();
        List<Book> outdatedBooks = new ArrayList<>();

        for (Book b : books) {
            int age = LocalDate.now().getYear() - b.getYear();
            if (age > year) {
                outdatedBooks.add(b);
            }
        }
        return outdatedBooks;
    }

    public Double BuyASingleBook(String isbn, int quantity, String email, String address) {
        List<Book> books = Inventory.getBooks();
        Book foundBook = null;
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                foundBook = book;
                break;
            }
        }
        //Not found
        if (foundBook == null) {throw new NotFoundException("the product is not in the inventory");}
        //PaperBook
        if (foundBook instanceof PaperBook) {
            if (address == null || address.trim().isEmpty()) {throw new RequierdAdreesException("address is required for PaperBook");}
            PaperBook paperBook = (PaperBook) foundBook;
            if (paperBook.getStock() < quantity) {throw new OutOfstockException("the product is out of stock");}
            paperBook.setStock(paperBook.getStock() - quantity);
            System.out.println("Shipping PaperBook to address: " + address);
        }
        //Ebook
        else if (foundBook instanceof Ebook) {
            if (email == null || email.trim().isEmpty()) {throw new RequierdEmailException("Email is required for  Ebook");}
            if(quantity>1)throw new QuantityNotAllowedException("Ebook cannot have more than 1 quantity");
            System.out.println("Sending Ebook to email: " + email);
        }
        //DemoBook
        else if (!(foundBook instanceof isBuyable)) {throw new NotAbleToBuyException("the product is not buyable");}
        return foundBook.getPrice() * quantity;
    }


}

