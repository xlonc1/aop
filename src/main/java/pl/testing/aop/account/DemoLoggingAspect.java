package pl.testing.aop.account;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Arkadiusz Parzych
 * @since 23.01.18
 */
@Aspect
@Component
public class DemoLoggingAspect {

  @Before("execution(public void addAccount())")
  public void simpleLoggingAdvice(){
    System.out.println("\n====>> Executing @Before advice on addAccount");
  }

}
