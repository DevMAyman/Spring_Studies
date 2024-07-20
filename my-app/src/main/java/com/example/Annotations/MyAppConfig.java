package com.example.Annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//! Component Scan take array of packages to scan them and when find @Component there it will instanciate this class
//! It helps spring not to scan all packages
@ComponentScan({"com.example.Annotations"})
public class MyAppConfig {
    
}
