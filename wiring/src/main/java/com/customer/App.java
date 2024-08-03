package com.customer;

import com.customer.AppConfig;
import com.customer.CustomerDao;
import com.customer.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean( CustomerService.class);
        System.out.println(customerService.getCustomerDao());
    }
}
