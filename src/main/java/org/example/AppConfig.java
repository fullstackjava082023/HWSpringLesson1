package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //the method returns Burger bean
    @Bean(name = "burger")
    public MenuItem getBurger() {
        MenuItem burger = new MenuItem();
        burger.setName("Burger");
        burger.setDescription("Juicy beef patty on a sesame seed bun");
        burger.setPrice(8.99);
        return burger;
    }

    //the method returns Pizza bean
    @Bean(name = "pizza")
    public MenuItem getPizza() {
        MenuItem pizza = new MenuItem("Pizza" , "Thin crust pizza with assorted toppings" ,10.99 );
        return pizza;
    }

    //this method returns menu BEAN
    @Bean(name = "simpleMenu")
    public SimpleMenu getSimpleMenu() {
        SimpleMenu simpleMenu = new SimpleMenu();
        simpleMenu.addItem(getPizza());
        simpleMenu.addItem(getBurger());
        return simpleMenu;
    }

    @Bean(name = "restaurant")
    public Restaurant getRestaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setRestaurantName("starksAndSons");
        restaurant.setMenu(getSimpleMenu());
        return restaurant;
    }





}

