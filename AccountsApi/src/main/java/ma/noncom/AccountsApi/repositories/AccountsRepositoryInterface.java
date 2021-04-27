package ma.noncom.AccountsApi.repositories;

import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountsRepositoryInterface {
    List<Account> readAllAccounts();
}