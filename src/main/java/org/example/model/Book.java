package org.example.model;

import java.util.Date;

public abstract class Book {
        private String ISBN;
        private String title;
        private int year;
        private Double price;
        private String author;


        public Book(String ISBN, String title, int year, Double price, String author) {
                this.ISBN = ISBN;
                this.title = title;
                this.year = year;
                this.price = price;
                this.author = author;
        }

        public String getISBN() {
                return ISBN;
        }


        public String getTitle() {
                return title;
        }



        public int getYear() {
                return year;
        }






        public Double getPrice() {
                return price;
        }

        public String getAuthor() {
                return author;
        }


}
