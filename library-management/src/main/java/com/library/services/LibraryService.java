package com.library.services;

import com.library.models.Book;
import com.library.models.EBook;
import com.library.models.PrintedBook;
import com.library.exceptions.BookNotFoundException;
import com.library.exceptions.DuplicateBookException;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books;
    
    public LibraryService() {
        this.books = new ArrayList<>();
    }
    
    // Add a new book
    public void addBook(Book book) throws DuplicateBookException {
        // Check if book with same ISBN already exists
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                throw new DuplicateBookException("A book with ISBN " + book.getIsbn() + " already exists.");
            }
        }
        books.add(book);
    }
    
    // Remove a book by ISBN
    public void removeBook(String isbn) throws BookNotFoundException {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        
        if (bookToRemove != null) {
            books.remove(bookToRemove);
        } else {
            throw new BookNotFoundException("Book with ISBN " + isbn + " not found.");
        }
    }
    
    // Search books by title
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }
    
    // Search books by author
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }
    
    // Get all books
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
    
    // Get book by ISBN
    public Book getBookByIsbn(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn + " not found.");
    }
}