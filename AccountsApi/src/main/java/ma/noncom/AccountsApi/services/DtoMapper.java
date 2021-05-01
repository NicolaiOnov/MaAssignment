package ma.noncom.AccountsApi.services;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import ma.noncom.AccountsApi.models.dto.AccountDto;
import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class DtoMapper {
    private final Logger logger = LoggerFactory.getLogger(DtoMapper.class);

    public AccountDto mapToDto(Account account) {
        try {
            return new AccountDto(
                    account.getNumber(),
                    account.getBalanceInCents().divide(new BigDecimal("100"), 2, RoundingMode.DOWN),
                    account.getCurrency(),
                    account.getLastOperation());
        }
        catch (ArithmeticException ex) {
            logger.error("A arithmetic error occurred during an attempt to convert balanceInCents to balance!", ex);
            throw ex;
        }
    }
}