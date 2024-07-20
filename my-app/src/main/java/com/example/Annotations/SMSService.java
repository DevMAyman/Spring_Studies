package com.example.Annotations;

import org.springframework.stereotype.Component;

@Component("myCustomService")
public class SMSService {
    public void sendMessage(String reciever, String message){
        System.out.println(message + "is being" + reciever);
    }
}
