package org.example.model;

import java.util.Date;

public class PaperBook extends Book implements isBuyable {

    private int stock;
    public PaperBook(String ISBN, String title, int year,Double price, String author, int stock) {
        super(ISBN, title, year,price, author);
        this.stock = stock;
    }
    @Override
    public boolean isBuyable() {
        return true;
    }
    public int getStock()    {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
