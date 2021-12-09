package com.beans.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("beans.xml");

        ClassObject obj = context.getBean("ClassObject",ClassObject.class);
        System.out.println("Name= " + obj.getName());
        // Closing the context object.
        context.close();
    }}
