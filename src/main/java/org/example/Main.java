package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //creation of the container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        Restaurant starksAndSons = (Restaurant) applicationContext.getBean("restaurant");
        SimpleMenu simpleMenu = (SimpleMenu) applicationContext.getBean("simpleMenu");
        MenuItem burger = (MenuItem) applicationContext.getBean("burger");
        MenuItem pizza = (MenuItem) applicationContext.getBean("pizza");
        //Restaurant starksAndSons = new Restaurant();
       // SimpleMenu simpleMenu = new SimpleMenu();
       // MenuItem burger = new MenuItem("Burger", "Juicy beef patty on a sesame seed bun", 8.99);
      //  MenuItem pizza = new MenuItem("Pizza", "Thin crust pizza with assorted toppings", 10.99);

        //connecting everything
        simpleMenu.addItem(burger);
        simpleMenu.addItem(pizza);
       // starksAndSons.setMenu(simpleMenu);
      //  starksAndSons.setName("starksAndSons");

        starksAndSons.displayMenu();

    }
}