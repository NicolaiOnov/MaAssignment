package ma.noncom.AccountsApi.models.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AccountDto {

    private final String number;
    private final BigDecimal balance;
    private final String currency;
    private final LocalDateTime lastOperation;

    public AccountDto(String number, BigDecimal balance, String currency, LocalDateTime lastOperation) {
        this.number = number;
        this.balance = balance;
        this.currency = currency;
        this.lastOperation = lastOperation;
    }

    public LocalDateTime getLastOperation() {
        return lastOperation;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }
}
