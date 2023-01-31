package com.magmutual.microservice;
public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(Integer id) {
        super("Could not find user " + id);
    }
}