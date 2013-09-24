package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Library {

    BookList bookList = new BookList();

    MovieList movieList = new MovieList();

    public String getFunctionalityDone(int option) {
        switch(option) {
            case 1:
                getBookList();
                break;
            case 2:
                System.out.println("Please enter the name of the book");
                return getBookReserved(new Scanner(System.in).next());
            case 3:
                return getMembershipDetails();
            case 4:
                getMovieList();
                break;
            default:
                return getErrorMessage();
        }
        return "";
    }

    private String getMembershipDetails() {
        return "Please talk to a librarian, Thank you";
    }

    public String getBookReserved(String book_name) {
        return bookList.searchBook(book_name);
    }

    private String getErrorMessage() {
        return "Select A Valid Option!!!";
    }

    public void getMovieList() {
        List<Movie> movie_list = movieList.getMovieList();
        System.out.println("Name  Year  Director  Rating");
        for(Movie movie : movie_list) {
            System.out.println(movie.getName() + "  " + movie.getYear() + "  " + movie.getDirector() + "  " + movie.getRating());
        }
    }

    public void getBookList() {
        List<Book> book_list = bookList.getBookList();
        System.out.println("Id  Name  AuthorName  NoOfPages  BookingStatus");
        for(Book book : book_list) {
          System.out.println(book.getId() + "  " + book.getName() + "  " + book.getAuthorName() + "  " + book.getNoOfPages() + "  " + book.getBookingStatus());
        }
    }
}
