package com.example.hw_5;

import org.springframework.stereotype.Service;

@Service
public class ValidatorService {
    private void privateCheck(LoginData loginData) throws WrongLoginException, WrongPasswordException {
        if (!loginData.getLogin().matches("\\w{1,20}")) {
            throw new WrongLoginException("Неверный логин");
        }
//        if (loginData.getLogin().length() > 20) {
//            throw new WrongLoginException();
//        }

        if (!loginData.getPass().matches("\\w{1,19}")) {
            throw new WrongPasswordException("Неверный пароль");
        }
//        if (loginData.getPass().length() > 19) {
//            throw new WrongPasswordException();
//        }

        if (!loginData.getPass().equals(loginData.getConfirmPass())) {
            throw new WrongPasswordException("Неверный пароль");
        }
    }

    public boolean check(LoginData loginData) {
        try {
            privateCheck(loginData);
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }
        return true;
    }
}
