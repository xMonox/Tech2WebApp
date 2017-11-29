package com.springproject.webchat.model;

/**
 * Created by reimert on 09-11-2017.
 */
public class User {
    private int id;
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
