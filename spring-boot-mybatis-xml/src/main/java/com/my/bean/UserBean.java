package com.my.bean;

import java.io.Serializable;

/**
 * Created by dev on 12/28/2017.
 */
public class UserBean implements Serializable {

    private Long id;
    private String userName;
    private String passWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return id+"-"+userName+"-"+passWord;
    }
}
