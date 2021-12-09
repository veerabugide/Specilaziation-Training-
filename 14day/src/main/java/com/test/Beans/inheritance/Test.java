package com.test.Beans.inheritance;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String a[]){

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("abstract.xml");
                Book mybook = (Book) context.getBean("myBookBean");
        System.out.println(mybook.toString());
    }
}