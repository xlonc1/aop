package pl.testing.aop.account;

import org.springframework.stereotype.Component;

/**
 * @author Arkadiusz Parzych
 * @since 23.01.18
 */
@Component
public class AccountDAO {

  public void addAccount() {
    System.out.println(getClass() + ": ADD ACCOUNT LOGIC!");
  }
}
