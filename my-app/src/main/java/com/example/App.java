package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //!___________________________ XML_________________________________________

        //! Now we do not need instantite explicitly 
        //! EmailService emailService = new EmailService();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("myBean", EmailService.class);
        EmailService emailService3 = context.getBean("myBean", EmailService.class);

        System.out.println(emailService == emailService3);
        emailService.sendEmail("mo@gmail.com", "hello from mo");

        //!___________________________ Annotation__________________________________ 

        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService5 = context2.getBean("emailServiceTwo", EmailService.class);
        EmailService emailService6 = context2.getBean("emailServiceTwo", EmailService.class);
        System.out.println(emailService5 == emailService6);
        //! put the name of the function instead of name of id
        EmailService emailService2 = context2.getBean("emailService",EmailService.class);
        emailService2.sendEmail("ahmed", "My message");
    }
}
