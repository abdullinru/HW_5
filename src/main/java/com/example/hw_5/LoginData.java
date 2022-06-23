package com.example.hw_5;

public class LoginData {
    private String login;
    private String pass;
    private String confirmPass;


    public LoginData(String login, String pass, String confirmPass) {
        this.login = login;
        this.pass = pass;
        this.confirmPass = confirmPass;
    }




    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getConfirmPass() {
        return confirmPass;
    }
}
