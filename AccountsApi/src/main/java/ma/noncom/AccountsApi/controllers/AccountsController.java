package ma.noncom.AccountsApi.controllers;

import ma.noncom.AccountsApi.models.Account;
import ma.noncom.AccountsApi.repositories.AccountsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountsController {

    private final AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) { this.accountsRepository = accountsRepository; }

    @GetMapping
    public List<Account> get(){
        return accountsRepository.readAllAccounts() ;
    }
}