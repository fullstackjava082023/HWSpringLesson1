package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //creation of the container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        Restaurant starksAndSons = (Restaurant) applicationContext.getBean("restaurant");
        starksAndSons.displayMenu();

    }
}