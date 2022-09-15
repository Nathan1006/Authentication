package com.example.demo.Payloads.Response;

import java.util.Set;

public class JwtResponse {
    private String token;
    private Long id;
    private String username;
    private Set<String> roles;

    public JwtResponse(String token, Long id, String username, Set<String> roles) {
        this.token = token;
        this.id = id;
        this.username = username;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Set<String> getRoles() {
        return roles;
    }

}
