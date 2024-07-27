package com.example.Bean_Life_Cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Customer implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    private String firstName;

    public Customer() {
        System.out.println("non-args ctor");
    }

    public Customer(String firstName) {
        System.out.println("First Name Ctor");
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Set First Name: " + firstName);
        this.firstName = firstName;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.firstName = "Ayman after property set";
        System.out.println("afterPropertiesSet");
    }

    
    public void customInit  (){
            System.out.println("Customer init........");
    }
}
