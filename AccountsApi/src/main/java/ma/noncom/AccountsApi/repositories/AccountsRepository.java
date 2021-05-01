package ma.noncom.AccountsApi.repositories;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import ma.noncom.AccountsApi.models.entity.Account;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsRepository implements AccountsRepositoryInterface {

    private final JdbcTemplate jdbcTemplate;
    private final String readAccountsStp = "SelectAllAccounts";

    private final Logger logger = LoggerFactory.getLogger(AccountsRepository.class);

    public AccountsRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public List<Account> readAllAccounts() {
        try {
            return jdbcTemplate.query(
                    String.format("EXEC %s", readAccountsStp),
                    (rs, rowNum) -> new Account(
                            rs.getString("Id"),
                            rs.getString("Number"),
                            rs.getBigDecimal("BalanceInCents"),
                            rs.getString("Currency"),
                            rs.getTimestamp("LastOperation") == null ? null : rs.getTimestamp("LastOperation").toLocalDateTime()));
        }
        catch (DataAccessException ex) {
            logger.error("A data access error occurred during an attempt to read all accounts from database!", ex);
            throw ex;
        }
    }
}
