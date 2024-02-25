package org.example;

import java.util.List;

public class Restaurant {
    private String restaurantName;

    private SimpleMenu menu;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public SimpleMenu getMenu() {
        return menu;
    }

    public void setMenu(SimpleMenu menu) {
        this.menu = menu;
    }

    public void displayMenu() {
        List<MenuItem> menuItems = menu.getMenuItems();
        System.out.println("Welcome to the restaurant : "+ restaurantName);
        System.out.println("Here is our menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
        }
    }


}
