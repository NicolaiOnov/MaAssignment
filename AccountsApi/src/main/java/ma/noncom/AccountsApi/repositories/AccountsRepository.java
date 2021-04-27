package ma.noncom.AccountsApi.repositories;

import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsRepository implements AccountsRepositoryInterface {

    private final JdbcTemplate jdbcTemplate;
    private final String readAccountsStp = "SelectAllAccounts";

    public AccountsRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public List<Account> readAllAccounts() {
        return jdbcTemplate.query(
                String.format("EXEC %s", readAccountsStp),
                (rs, rowNum) -> new Account(
                        rs.getString("Id"),
                        rs.getString("Number"),
                        rs.getBigDecimal("BalanceInCents"),
                        rs.getString("Currency"),
                        rs.getTimestamp("LastOperation") == null ? null : rs.getTimestamp("LastOperation").toLocalDateTime()));
    }
}
