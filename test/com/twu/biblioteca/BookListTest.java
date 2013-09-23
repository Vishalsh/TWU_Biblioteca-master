package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    @Test
    public void shouldGetTheBookList() {
        List<Book> book_list = new ArrayList<Book>();
        book_list.add(new Book(1, "Java", "Khalid Mughal", 500, "available"));
        book_list.add(new Book(2, "Sql", "Ivan Bayross", 400, "available"));
        book_list.add(new Book(3, "Networking", "Frauzon", 550, "available"));
        book_list.add(new Book(4, "Cpp", "Anshuman", 375, "available"));
        book_list.add(new Book(5, "OS", "Red Book", 550, "available"));
        assertEquals(book_list.get(0).getAuthorName(), new BookList().getBookList().get(0).getAuthorName());
    }
}
