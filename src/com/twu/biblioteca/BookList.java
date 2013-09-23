package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {

   List<Book> book_list = new ArrayList<Book>();

   public BookList() {
       this.book_list.add(new Book(1, "Java", "Khalid Mughal", 500, "available"));
       this.book_list.add(new Book(2, "Sql", "Ivan Bayross", 400, "available"));
       this.book_list.add(new Book(3, "Networking", "Frauzon", 550, "available"));
       this.book_list.add(new Book(4, "Cpp", "Anshuman", 375, "available"));
       this.book_list.add(new Book(5, "OS", "Red Book", 550, "available"));
   }


   public List<Book> getBookList() {
       return book_list;
   }

   public String searchBook(String book_name) {
       for(Book book : book_list) {
           if(book.getName().equals(book_name) && book.getBookingStatus().equals("available")) {
             book_list.get(book_list.indexOf(book)).setBookingStatus("reserved");
             return "Thanks You! Enjoy the book.";
           }
       }
       return "Sorry we don't have that book yet.";
   }
}
