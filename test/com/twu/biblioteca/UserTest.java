package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldCreateANewUser() {
        User user = new User("abc", "111-1111", "abc1", "abc@gmail.com", "9858923893", "loggedOff");
        assertEquals("abc", user.getName());
        assertEquals("111-1111", user.getUsername());
        assertEquals("abc1", user.getPassword());
        assertEquals("abc@gmail.com", user.getEmail());
        assertEquals("9858923893", user.getPhoneNumber());
        assertEquals("loggedOff", user.getStatus());
    }

}
