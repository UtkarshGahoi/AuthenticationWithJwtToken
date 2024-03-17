package org.example;

import io.jsonwebtoken.Claims;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String token = JwtUtil.generateToken("user1", "admin");
        System.out.println("Generated token: " + token);

        if (JwtUtil.validateToken(token)) {
            Claims claims = JwtUtil.parseToken(token);
            System.out.println("Username: " + claims.get("username"));
            System.out.println("Role: " + claims.get("role"));
        } else {
            System.out.println("Invalid token");
        }
    }

}