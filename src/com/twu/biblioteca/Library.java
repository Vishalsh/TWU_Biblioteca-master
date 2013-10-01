package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Library {

    BookList bookList = new BookList();

    MovieList movieList = new MovieList();

    UserList userList = new UserList();

    public String getFunctionalityDone(int option) {
        Scanner sc = new Scanner(System.in);
        switch(option) {
            case 1:
                getBookList();
                break;
            case 2:
                System.out.println("Please enter the name of the book");
                return getBookReserved(sc.next());
            case 3:
                return getMembershipDetails();
            case 4:
                getMovieList();
                break;
            case 5:
                System.out.println("Please enter your Username and password");
                return getLoggedIn(sc.next(), sc.next());
            default:
                return getErrorMessage();
        }
        return "";
    }

    private String getMembershipDetails() {
        User user = userList.searchForLoggedInUser();
        if (user == null)
        {
            return "Please talk to a librarian, Thank you";
        }
            System.out.println("Name  Email  PhoneNumber");
            return user.getName()+ "  " + user.getEmail() + "  "  + user.getPhoneNumber();
    }

    public String getBookReserved(String book_name) {
        return bookList.searchBook(book_name);
    }

    private String getErrorMessage() {
        return "Select A Valid Option!!!";
    }

    public String getLoggedIn(String username, String password) {
        User user = userList.searchUser(username, password);
        if(user == null) {
            return "Wrong username or password";
        }
        return "You are logged In now";
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
