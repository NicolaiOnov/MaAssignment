package ma.noncom.AccountsApi.repositories;

import ma.noncom.AccountsApi.models.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsRepository {

    private final JdbcTemplate jdbcTemplate;
    private final String ReadAccountsStp = "SelectAllAccounts";

    public AccountsRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public List<Account> ReadAllAccounts() {
        String sql = String.format("EXEC %s", ReadAccountsStp);

        List<Account> result = jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Account(
                        rs.getString("Id"),
                        rs.getString("Number"),
                        rs.getBigDecimal("Balance"),
                        rs.getString("Currency"),
                        rs.getTimestamp("LastOperation") == null ? null : rs.getTimestamp("LastOperation").toLocalDateTime()));

        return result;
    }
}
