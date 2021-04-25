package ma.noncom.AccountsApi.controllers;

import ma.noncom.AccountsApi.models.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountsController {

    @GetMapping
    public List<Account> get(){
        return Arrays.asList(
                new Account("1", "DK1230812038", new BigDecimal("123.2811"), "DKK", LocalDateTime.now()),
                new Account("2", "MD1230812038", new BigDecimal(300), "MDL", null),
                new Account("3", "GB1230812038", new BigDecimal("0.0004"), "GBP", LocalDateTime.now()));
    }
}