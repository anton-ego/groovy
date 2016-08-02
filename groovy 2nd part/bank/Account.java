package bank;

import java.math.BigDecimal;

/**
 * Created by aegorov on 7/12/2016.
 */
public interface Account {
    double deposit(BigDecimal amount);
    double withdraw(BigDecimal amount);
    double getBalance();
    Integer getId();
}
