package com.library.models;

public class EBook extends Book {
    private String downloadLink;
    private String format;
    
    public EBook(String title, String author, String isbn, String downloadLink, String format) {
        super(title, author, isbn);
        this.downloadLink = downloadLink;
        this.format = format;
    }
    
    // Getters and setters
    public String getDownloadLink() {
        return downloadLink;
    }
    
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
    
    public String getFormat() {
        return format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }
    
    @Override
    public String getBookType() {
        return "E-Book";
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Type: E-Book, Format: " + format + ", Download Link: " + downloadLink;
    }
}