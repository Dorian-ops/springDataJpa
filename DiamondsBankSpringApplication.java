package https.github.com.Dorian_ops.diamonds_bank_spring;

import https.github.com.Dorian_ops.diamonds_bank_spring.models.UserModel;
import https.github.com.Dorian_ops.diamonds_bank_spring.repositoryes.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiamondsBankSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiamondsBankSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return args -> {

			UserModel userModel = new UserModel();
			userModel.setName("Dorian");
			userModel.setRole("Admin");
			userModel.setBalance(0);

			UserModel userModel1 = new UserModel();
			userModel1.setName("darkviel");
			userModel1.setRole("Admin");
			userModel1.setBalance(0);
			repository.save(userModel);
			repository.save(userModel1);
			System.out.println(userModel + ", " + userModel1);
		};
	}
}
