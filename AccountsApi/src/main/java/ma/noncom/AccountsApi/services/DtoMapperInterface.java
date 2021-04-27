package ma.noncom.AccountsApi.services;

import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface DtoMapperInterface {
    AccountDto mapToDto(Account account);
}
