package ma.noncom.AccountsApi.services;

import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class DtoMapper {
    public AccountDto mapToDto(Account account) {
        return new AccountDto(
                account.getNumber(),
                account.getBalanceInCents().divide(new BigDecimal("100"), 2, RoundingMode.UNNECESSARY),
                account.getCurrency(),
                account.getLastOperation());
    }
}
