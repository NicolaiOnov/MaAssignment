package ma.noncom.AccountsApi.models.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {

    private final String id;
    private final String number;
    private final BigDecimal balanceInCents;
    private final String currency;
    private final LocalDateTime lastOperation;

    public Account(String id, String number, BigDecimal balanceInCents, String currency, LocalDateTime lastOperation) {
        this.id = id;
        this.number = number;
        this.balanceInCents = balanceInCents;
        this.currency = currency;
        this.lastOperation = lastOperation;
    }

    public LocalDateTime getLastOperation() {
        return lastOperation;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getBalanceInCents() {
        return balanceInCents;
    }

    public String getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }
}
