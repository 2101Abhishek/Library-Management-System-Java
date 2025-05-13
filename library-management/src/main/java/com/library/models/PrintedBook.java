package com.library.models;

public class PrintedBook extends Book {
    private int numberOfPages;
    private double weight;
    
    public PrintedBook(String title, String author, String isbn, int numberOfPages, double weight) {
        super(title, author, isbn);
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }
    
    // Getters and setters
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String getBookType() {
        return "Printed Book";
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Type: Printed Book, Pages: " + numberOfPages + ", Weight: " + weight + "g";
    }
}