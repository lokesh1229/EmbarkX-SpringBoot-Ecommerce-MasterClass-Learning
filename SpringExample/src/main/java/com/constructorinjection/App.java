package com.constructorinjection;

import org.springframework.beans.factory.BeanRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextConstructorInjection.xml");

        Car mycar = (Car) context.getBean("myCar");
        mycar.getDetails();
    }
}
