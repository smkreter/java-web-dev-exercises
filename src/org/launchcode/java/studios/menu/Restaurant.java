package org.launchcode.java.studios.menu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem eggplantChorizoPasta = new MenuItem(11.00, "Pasta with a ragout of eggplant & soy chorizo. Spicy.", "Dinner", true);
        MenuItem strawberryYogurt = new MenuItem(4.00, "Yogurt with strawberries and honey", "Breakfast", false);
        MenuItem jalapenoPopsicle = new MenuItem(3.00, "Yogurt-based popsicle with jalapeno jam and peaches", "dessert", true);
        ArrayList<MenuItem> shellieFoods = new ArrayList<>();
        shellieFoods.add(eggplantChorizoPasta);
        shellieFoods.add(strawberryYogurt);
        shellieFoods.add(jalapenoPopsicle);
        Date thisYear = new Date(2020);
        Menu shelliesMenu = new Menu(thisYear, shellieFoods);
        //System.out.println(shelliesMenu);
        shelliesMenu.printAll();
    }
}
