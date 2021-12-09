package com.test.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    private String message;



    public void setMessage(String message){

        this.message  = message;

    }

    public void getMessage(){

        System.out.println("Your Message : " + message);

    }

}
