package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //! Now we do not need instantite explicitly 
        //! EmailService emailService = new EmailService();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("myBean", EmailService.class);
        emailService.sendEmail("mo@gmail.com", "hello from mo");
    }
}
