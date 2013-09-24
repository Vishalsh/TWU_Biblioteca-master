package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class MovieList {

    List<Movie> movie_list = new ArrayList<Movie>();

    public MovieList() {
        movie_list.add(new Movie("Veer Zara", 2004, "Yash Chopra", "5"));
        movie_list.add(new Movie("LOC Kargil", 2001, "JP Datta", "4"));
        movie_list.add(new Movie("Gadar", 2002, "Sunny Deol", "3"));
        movie_list.add(new Movie("Dhadkan", 2005, "Shilpa Shetty", "5"));
        movie_list.add(new Movie("Lagan", 2002, "Ashutosh Gavarear", "N/A"));
    }

    public List<Movie> getMovieList() {
        return this.movie_list;
    }
}
