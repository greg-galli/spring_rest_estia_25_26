package fr.miage.estia.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRestEstia2526Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestEstia2526Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        return args ->
        {
            UserDTO userDTO = UserDTO
                                    .builder()
                                    .firstname("Bob")
                                    .lastname("Dylan")
                                    .build();
            userService.saveUser(userDTO);
        };
    }

}
