package org.example.model;

import java.util.Date;

public class Ebook extends Book implements isBuyable {
    private String filetype;
    public Ebook(String isbn, String title, int year, Double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }
    public String getFiletype() {
        return filetype;
    }
    @Override
    public boolean isBuyable(){
        return true;
    }
}
