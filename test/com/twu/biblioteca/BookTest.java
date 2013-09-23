package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BookTest {

  @Test
  public void shouldCreateANewBook() {
      Book book = new Book(1, "Java", "Khalid Mughal", 500, "available");
      assertEquals(1, book.getId());
      assertEquals("Java", book.getName());
      assertEquals("Khalid Mughal", book.getAuthorName());
      assertEquals(500, book.getNoOfPages());
      assertEquals("available", book.getBookingStatus());
  }
}
