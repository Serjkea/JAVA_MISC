package main.config;

import main.repository.Storage;
import main.repository.UserStorage;
import main.service.Service;
import main.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Storage userStorage() {
        return new UserStorage();
    }

    @Bean
    public Service userService(Storage userStorage) {
        return new UserService(userStorage);
    }

}
