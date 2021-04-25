package ma.noncom.AccountsApi.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private final String Id;
    private final String Number;
    private final BigDecimal Balance;
    private final String Currency;
    private final LocalDateTime LastOperation;

    public Account(String id, String number, BigDecimal balance, String currency, LocalDateTime lastOperation) {
        Id = id;
        Number = number;
        Balance = balance;
        Currency = currency;
        LastOperation = lastOperation;
    }
}
