package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Before
    @Test
    public void shouldAssertErrorMessageForInvalidOption() {
        Library library = new Library();
        assertEquals("Select A Valid Option!!!", library.getFunctionalityDone(4));
    }

    @Test
    public void shouldGetTheListOfAllBooks() {
        List<Book> book_list = new ArrayList<Book>();
        book_list.add(new Book(1, "Java", "Khalid Mughal", 500, "available"));
        book_list.add(new Book(2, "Sql", "Ivan Bayross", 400, "available"));
        book_list.add(new Book(3, "Networking", "Frauzon", 550, "available"));
        book_list.add(new Book(4, "Cpp", "Anshuman", 375, "available"));
        book_list.add(new Book(5, "OS", "Red Book", 550, "available"));
        assertEquals(book_list.get(0).getAuthorName(), new BookList().getBookList().get(0).getAuthorName());
    }

    @Test
    public void shouldReserveABookIfPresentInTheList() {
        List<Book> book_list = new ArrayList<Book>();
        book_list.add(new Book(1, "Java", "Khalid Mughal", 500, "available"));
        book_list.add(new Book(2, "Sql", "Ivan Bayross", 400, "available"));
        Library library = new Library();
        assertEquals("Thanks You! Enjoy the book.", library.getBookReserved("Java") );
    }

    @Test
    public void shouldAssertErrorMessageIfBookIsNotInTheList() {
        Library library = new Library();
        assertEquals("Sorry we don't have that book yet.", library.getBookReserved("abc") );
    }

    @Test
    public void shouldGetMembershipDetails() {
        Library library = new Library();
        assertEquals("Please talk to a librarian, Thank you", library.getFunctionalityDone(3));
    }
}
