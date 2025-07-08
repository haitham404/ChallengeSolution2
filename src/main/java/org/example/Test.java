package org.example;

import org.example.model.*;
import org.example.exceptions.*;
import org.example.services.*;

import java.awt.print.Paper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        // Add books
        PaperBook paperBook = new PaperBook("1", "Java Basics", 2019, 100.0, "Alice", 10);
        Ebook ebook = new Ebook("2", "Quantum Computing", 2020,  50.0, "Bob", "PDF");
        Demobook demoBook = new Demobook("3", "Demo Book", 2000,  0.0, "Carol");
        PaperBook paperbook2 = new PaperBook("4","yarabgetaccptedinTheinternship",2024,1.0,"haytham",12);



        store.addBook(paperBook);
        store.addBook(ebook);
        store.addBook(demoBook);
        System.out.println("Added books to inventory");


        System.out.println("-------------------------------------------------------------------------------------");

        // Remove outdated books
        List<Book> outdated = store.removeBooksOutDated(10);
        System.out.println("Outdated books (older than 10 years):");
        for (Book b : outdated) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }

        System.out.println("-------------------------------------------------------------------------------------");

        // Buy PaperBook
        try {
            double paid = store.BuyASingleBook(paperBook.getISBN(), 2, "", "123 Main St");
            System.out.println(paid);
            System.out.println("-------------------------------------------------------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("-------------------------------------------------------------------------------------");

        }


//   //try to buy paper product out of the stock
//        try {
//            double paid = store.BuyASingleBook(paperBook.getISBN(), 21, "", "123 Main St");
//            System.out.println(paid);
//            System.out.println("-------------------------------------------------------------------------------------");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("-------------------------------------------------------------------------------------");
//
//        }







      //Not found

       try {
           double paid = store.BuyASingleBook(paperbook2.getISBN(), 1, "", "123 Main St");
           System.out.println(paid);
           System.out.println("-------------------------------------------------------------------------------------");

       } catch (Exception e) {
           System.out.println(e.getMessage());
           System.out.println("-------------------------------------------------------------------------------------");

       }





//       //try to buy paperbook with empty address
//
//         try {
//            double paid = store.BuyASingleBook(paperBook.getISBN(), 1, "", "");
//            System.out.println(paid);
//            System.out.println("-------------------------------------------------------------------------------------");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("-------------------------------------------------------------------------------------");
//
//        }




        // Buy Ebook
        try {
            double paid = store.BuyASingleBook(ebook.getISBN(), 1, "haythamahmed2001@gmail.com", "");
            System.out.println(paid);
            System.out.println("-------------------------------------------------------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




////         try to buy Buy Ebook with quantity more than 1
//
//        try {
//            double paid = store.BuyASingleBook(ebook.getISBN(), 2, "user@example.com", "");
//            System.out.println(paid);
//            System.out.println("-------------------------------------------------------------------------------------");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("-------------------------------------------------------------------------------------");
//        }




//        //try to buy ebook with empty email
//        try {
//            double paid = store.BuyASingleBook(ebook.getISBN(), 1, "", "");
//            System.out.println(paid);
//            System.out.println("-------------------------------------------------------------------------------------");
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println("-------------------------------------------------------------------------------------");
//
//
//        }





        // buy a DemoBook  (Not able to buy)
        try {
            double paid = store.BuyASingleBook(demoBook.getISBN(), 1, "", "");
            System.out.println(paid);
            System.out.println("-------------------------------------------------------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("-------------------------------------------------------------------------------------");
        }

    }
} 