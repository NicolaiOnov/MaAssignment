package ma.noncom.AccountsApi.controllers;

import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.repositories.AccountsRepository;
import ma.noncom.AccountsApi.services.DtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("accounts")
public class AccountsController {

    private final AccountsRepository accountsRepository;
    private final DtoMapper dtoMapper;

    public AccountsController(AccountsRepository accountsRepository, DtoMapper dtoMapper) {
        this.accountsRepository = accountsRepository;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> get(){
            return new ResponseEntity<>(accountsRepository
                    .readAllAccounts()
                    .stream().map(account -> dtoMapper.mapToDto(account))
                    .collect(Collectors.toList()), HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception exception) {
        String errorMessageForClient = "Service is temporarily unavailable. Please try the operation later.";
        return ResponseEntity
                .status(500)
                .body(errorMessageForClient);
    }
}