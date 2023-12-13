/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Book implements Serializable{
    private String title;
    private String type;
    private int yOR;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getyOR() {
        return yOR;
    }

    public void setyOR(int yOR) {
        this.yOR = yOR;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String title, String type, int yOR, int price) {
        this.title = title;
        this.type = type;
        this.yOR = yOR;
        this.price = price;
    }

    public void updateInformation(Book updateBook) {
         this.setTitle(updateBook.getTitle());
        this.setType(updateBook.getType());
        this.setyOR(updateBook.getyOR());
        this.setPrice(updateBook.getPrice());
       
    }
    @Override
    public boolean equals(Object obj) {
        Book thisBook = this;
        Book otherBook = (Book) obj;
        return thisBook.getTitle().equalsIgnoreCase(otherBook.getTitle());
    }
}
