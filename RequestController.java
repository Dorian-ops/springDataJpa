package https.github.com.Dorian_ops.diamonds_bank_spring.controllers;

import https.github.com.Dorian_ops.diamonds_bank_spring.models.UserModel;
import https.github.com.Dorian_ops.diamonds_bank_spring.repositoryes.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@ComponentScan
public class RequestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/welcome")
    public String welcomePage(){
        return "Welcome Page!";
    }

    @GetMapping("/{id}")
    public UserModel getUserModel(@PathVariable Long id) {
        Optional<UserModel> optionalUserModel = userRepository.findById(id);
        UserModel userModel = optionalUserModel.get();
        return userModel;
    }


}
