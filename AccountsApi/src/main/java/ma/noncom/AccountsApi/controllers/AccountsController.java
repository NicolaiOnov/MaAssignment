package ma.noncom.AccountsApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountsController {

    @GetMapping
    public String get(){
        return "here's you cute lil' list of accounts..";
    }
}