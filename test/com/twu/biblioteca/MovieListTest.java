package com.twu.biblioteca;


import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class MovieListTest {

    @Test
    public void shouldCreateANewMovieList() {
        List<Movie> movie_list = new ArrayList<Movie>();
        movie_list.add(new Movie("Veer Zara", 2004, "Yash Chopra", "5"));
        assertEquals(movie_list.get(0).getName(), new MovieList().getMovieList().get(0).getName());
    }
}
