package ma.noncom.AccountsApi.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private final String id;
    private final String number;
    private final BigDecimal balance;
    private final String currency;
    private final LocalDateTime lastOperation;

    public Account(String id, String number, BigDecimal balance, String currency, LocalDateTime lastOperation) {
        this.id = id;
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

    public String getId() {
        return id;
    }
}
