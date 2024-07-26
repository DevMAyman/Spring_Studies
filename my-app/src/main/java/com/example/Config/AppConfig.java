package com.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.EmailService;

@Configuration
@ComponentScan({"com.example.Bean_Life_Cycle"})
public class AppConfig {

}
