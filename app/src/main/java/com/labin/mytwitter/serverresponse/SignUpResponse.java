package com.labin.mytwitter.serverresponse;

public class SignUpResponse {
    String status, username, usertoken;

    public SignUpResponse(String status, String username, String usertoken) {
        this.status = status;
        this.username = username;
        this.usertoken = usertoken;


    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertoken() {
        return usertoken;
    }

    public void setUsertoken(String usertoken) {
        this.usertoken = usertoken;
    }
}