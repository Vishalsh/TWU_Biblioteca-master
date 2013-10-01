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
        assertEquals("Select A Valid Option!!!", library.getFunctionalityDone(6));
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
    public void shouldGetTheListOfAllMovies() {
        List<Movie> movie_list = new ArrayList<Movie>();
        movie_list.add(new Movie("Veer Zara", 2004, "Yash Chopra", "5"));
        movie_list.add(new Movie("LOC Kargil", 2001, "JP Datta", "4"));
        assertEquals(movie_list.get(0).getName(), new MovieList().getMovieList().get(0).getName());
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
    public void shouldGetMembershipDetailsIfLoggedIn() {
        Library library = new Library();
        library.userList.user_list.get(0).setStatus("loggedIn");
        assertEquals("vishal  vishal@gmail.com  9878789878", library.getFunctionalityDone(3));
    }

    @Test
    public void shouldNotGetMembershipDetailsIfNotLoggedIn() {
        Library library = new Library();
        assertEquals("Please talk to a librarian, Thank you", library.getFunctionalityDone(3));
    }

    @Test
    public void shouldLogInIfRightCredentialsAreProvided() {
        Library library = new Library();
        assertEquals("You are logged In now", library.getLoggedIn("111-1111", "vishal111-1111"));
    }

    @Test
    public void shouldNotLogInIfWrongCredentialsAreProvided() {
        Library library = new Library();
        assertEquals("Wrong username or password", library.getLoggedIn("111-1119", "vishal111-1111"));
    }
}
