package com.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.EmailService;
import com.example.Bean_Life_Cycle.Customer;

@Configuration
@ComponentScan({"com.example.destruction"})
public class AppConfig {
    @Bean(initMethod= "customMethod")
    public Customer customer(){return new Customer();}
}
