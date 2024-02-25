package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleMenu {
    private List<MenuItem> menuItems = new ArrayList<>();

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void removeItem(String name) {
        Iterator it = menuItems.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            if (menuItem.getName().equals(name)) {
                menuItems.remove(menuItem);
            }
        }
    }


}
