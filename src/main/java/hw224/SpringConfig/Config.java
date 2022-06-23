package hw224.SpringConfig;

import hw224.Service.IUserService;
import hw224.Service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public IUserService userService(){
        return new UserService();
    }
}