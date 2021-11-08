package com.ifmo.lesson4;

import java.util.Objects;

public class Shelf {
    private Book book;
    private int quantity;

    public Shelf(Book book, int quantity){
        this.book=book;
        this.quantity=quantity;
    }

    public int changeQuantity(int newQuantity){
        this.quantity=newQuantity;
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shelf shelf = (Shelf) o;
        return quantity == shelf.quantity && Objects.equals(book, shelf.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, quantity);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
