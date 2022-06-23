package com.example.hw_5;

public class WrongPasswordException extends Exception {
    WrongPasswordException(String str) {
        super(str);
    }
}
