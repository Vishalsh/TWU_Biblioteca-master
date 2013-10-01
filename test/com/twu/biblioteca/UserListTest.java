package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserListTest {

//    @Before
//    public void initialize() {
//        UserList userList = new UserList();
//    }
//
    @Test
    public void shouldSearchForTheUser() {
        UserList userList = new UserList();
        assertEquals(userList.searchUser("111-1111", "vishal111-1111").getUsername(), "111-1111");
        assertEquals(userList.searchUser("111-1111", "vishal111-1111").getPassword(), "vishal111-1111");
        assertEquals(userList.searchUser("111-1116", "vishal111-1116"), null);
        assertEquals(userList.searchUser("111-1116", "vishal111-1116"), null);
    }

    @Test
    public void shouldSearchForTheLoggedInUser() {
        UserList userList = new UserList();
        userList.user_list.get(0).setStatus("loggedIn");
        List<User> user_list = new ArrayList<User>();
        user_list.add(new User("vishal", "111-1111", "vishal111-1111", "vishal@gmail.com", "9878789878", "loggedIn"));
        user_list.add(new User("Riya", "111-1112", "riya111-1112", "riya@gmail.com", "9878789879", "loggedOff"));
        assertEquals(user_list.get(0).getUsername(), userList.searchForLoggedInUser().getUsername());
    }
}
