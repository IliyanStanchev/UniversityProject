package com.mycompany.universityproject.frames;

import entity.User;

public class UserPage extends javax.swing.JFrame{

    private User user;

    public UserPage(){

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
