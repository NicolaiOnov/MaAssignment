package ma.noncom.AccountsApi.services;

import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.models.entity.Account;

public interface DtoMapperInterface {
    AccountDto mapToDto(Account account);
}