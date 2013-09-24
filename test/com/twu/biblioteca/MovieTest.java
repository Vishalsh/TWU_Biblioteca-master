package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void shouldCreateANewMovie() {
        Movie movie = new Movie("Sholey", 1975, "Ramesh Sippi", "5");
        assertEquals("Sholey", movie.getName());
        assertEquals(1975, movie.getYear());
        assertEquals("Ramesh Sippi", movie.getDirector());
        assertEquals("5", movie.getRating());
    }
}
