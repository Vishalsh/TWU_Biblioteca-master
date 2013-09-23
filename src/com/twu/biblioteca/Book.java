package com.twu.biblioteca;

public class Book {

    private int id;

    private String name;

    private String author_name;

    private int no_of_pages;

    private String booking_status;

    public Book(int id,String name, String author_name, int no_of_pages, String booking_status ) {

        this.id = id;
        this.name = name;
        this.author_name = author_name;
        this.no_of_pages = no_of_pages;
        this.booking_status = booking_status;

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthorName() {
        return this.author_name;
    }

    public int getNoOfPages() {
        return this.no_of_pages;
    }

    public String getBookingStatus() {
        return this.booking_status;
    }

    public void setBookingStatus(String status) {
        this.booking_status = status;
    }
}
