package ma.noncom.AccountsApi.repositories;

import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountsRepositoryInterface {
    List<Account> readAllAccounts();
}