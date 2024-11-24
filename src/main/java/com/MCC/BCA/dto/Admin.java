package com.MCC.BCA.dto;

public class Admin {
    private String userId;
    private String password;

    public Admin(){}
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
