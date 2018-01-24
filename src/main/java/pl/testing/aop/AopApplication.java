package pl.testing.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.testing.aop.account.AccountDAO;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			AccountDAO theAccountDao = ctx.getBean("accountDAO", AccountDAO.class);
			theAccountDao.addAccount();
			theAccountDao.addAccount();
		};
	}
}
