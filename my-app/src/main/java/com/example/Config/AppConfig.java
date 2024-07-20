package com.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.EmailService;

@Configuration
public class AppConfig {
    

    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

     @Bean
        @Scope("prototype")
    public EmailService emailServiceTwo(){
        return new EmailService();
    }

}
