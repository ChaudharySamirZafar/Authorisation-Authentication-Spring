package codenemy.api;

import codenemy.api.model.Role;
import codenemy.api.model.User;
import codenemy.api.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
    
//    @Bean
//    CommandLineRunner run(UserService userService)
//    {
//        return args -> {
//            userService.saveRole(new Role(0, "ROLE_USER"));
//            userService.saveRole(new Role(0, "ROLE_MANAGER"));
//            userService.saveRole(new Role(0, "ROLE_ADMIN"));
//            userService.saveRole(new Role(0, "ROLE_SUPER_ADMIN"));
//
//            userService.saveUser(new User(0, "John Travolta", "John", "1234", new ArrayList<>()));
//            userService.saveUser(new User(0, "Will Smith", "Will", "1234", new ArrayList<>()));
//            userService.saveUser(new User(0, "Jim Carry", "Jim", "1234", new ArrayList<>()));
//            userService.saveUser(new User(0, "Arnold", "Arnold", "1234", new ArrayList<>()));
//
//            userService.addRoleToUser("John", "ROLE_USER");
//            userService.addRoleToUser("John", "ROLE_MANAGER");
//            userService.addRoleToUser("Will", "ROLE_MANAGER");
//            userService.addRoleToUser("Jim", "ROLE_ADMIN");
//            userService.addRoleToUser("Arnold", "ROLE_SUPER_ADMIN");
//            userService.addRoleToUser("Arnold", "ROLE_ADMIN");
//            userService.addRoleToUser("Arnold", "ROLE_USER");
//        };
//    }
}
