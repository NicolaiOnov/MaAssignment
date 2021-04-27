package ma.noncom.AccountsApi.controllers;

import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.repositories.AccountsRepositoryInterface;
import ma.noncom.AccountsApi.services.DtoMapperInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("accounts")
public class AccountsController {

    private final AccountsRepositoryInterface accountsRepository;
    private final DtoMapperInterface dtoMapper;

    public AccountsController(AccountsRepositoryInterface accountsRepository, DtoMapperInterface dtoMapper) {
        this.accountsRepository = accountsRepository;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping
    public List<AccountDto> get(){
        return accountsRepository
                .readAllAccounts()
                .stream().map(account -> dtoMapper.mapToDto(account))
                .collect(Collectors.toList()) ;
    }
}