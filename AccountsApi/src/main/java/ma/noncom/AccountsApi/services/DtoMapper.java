package ma.noncom.AccountsApi.services;

import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class DtoMapper {
    public AccountDto mapToDto(Account account) {
        return new AccountDto(account.getNumber(), account.getBalance(), account.getCurrency(), account.getLastOperation());
    }
}
