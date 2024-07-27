package com.example.destruction;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;
// import javax.annotation.PreDestroy;

@Component
public class CustomerDest implements DisposableBean{

    public CustomerDest() {
        System.out.println("non-args ctor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    // @PreDestroy
    // public void customDestroy(){
    //     System.out.println("Custom Destroy");
    // }
    
}
