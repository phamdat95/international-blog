package com.codegym.cms.model;

public class User {
    private String useName;
    private String passWord;

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User() {
    }

    public User(String useName, String passWord) {
        this.useName = useName;
        this.passWord = passWord;
    }
}
