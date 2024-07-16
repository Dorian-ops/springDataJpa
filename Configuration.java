package https.github.com.Dorian_ops.diamonds_bank_spring.config;

import https.github.com.Dorian_ops.diamonds_bank_spring.repositoryes.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan
public class Configuration {
    @Autowired
    private UserRepository userRepository;

}
