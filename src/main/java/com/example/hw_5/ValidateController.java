package com.example.hw_5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateController {
    private final ValidatorService validatorService;

    public ValidateController(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }
@GetMapping
    public boolean Proverka(@RequestParam String login, String pass, String confirmPass) {
        LoginData loginData = new LoginData(login, pass, confirmPass);
        return validatorService.check(loginData);


    }

}
