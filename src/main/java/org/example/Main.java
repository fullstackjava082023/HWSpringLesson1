package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //creation of the container
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);


        Restaurant starksAndSons = (Restaurant) applicationContext.getBean("restaurant");
        starksAndSons.displayMenu();

    }
}