package com.abir.joblisting.model;

public class JWTResponse {
    private String username;
    private String authorities;
    private String token;

    public JWTResponse() {
    }

    public JWTResponse(String username, String authorities, String token) {
        this.username = username;
        this.authorities = authorities;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
