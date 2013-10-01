package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.List;

public class UserList {

    List<User> user_list = new ArrayList<User>();

    public UserList() {
        user_list.add(new User("vishal", "111-1111", "vishal111-1111", "vishal@gmail.com", "9878789878", "loggedOff"));
        user_list.add(new User("Riya", "111-1112", "riya111-1112", "riya@gmail.com", "9878789879", "loggedOff"));
        user_list.add(new User("Pulkit", "111-1113", "pulkit111-1113", "pulkit@gmail.com", "9878789870", "loggedOff"));
        user_list.add(new User("Anil", "111-1114", "anil111-1114", "anil@gmail.com", "9878789877", "loggedOff"));
        user_list.add(new User("Gopal", "111-1115", "gopal111-1115", "gopal@gmail.com", "9878789876", "loggedOff"));
    }

    public User searchUser(String username, String password) {

        for(User user : user_list) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user_list.get(user_list.indexOf(user)).setStatus("loggedIn");
                return user;
            }
        }
        return null;
    }

    public User searchForLoggedInUser() {
        for(User user : user_list) {
            if(user.getStatus().equals("loggedIn")) {
                return user;
            }
        }
        return null;
    }
}
