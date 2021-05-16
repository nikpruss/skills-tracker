package restaurant;

import java.util.ArrayList;
import java.util.Calendar;

public class Restaurant {
    public static void main(String[] args){
        Menu myMenu = new Menu();
        System.out.println(myMenu.getUpdated());

        MenuItem soup = new MenuItem();
        soup.setDescription("onion soup");
        soup.setCategory("main course");
        soup.setPrice(3.99);

        MenuItem chips = new MenuItem();
        chips.setDescription("taco chips");
        chips.setCategory("appetizer");
        chips.setPrice(1.89);

        MenuItem cake = new MenuItem();
        cake.setDescription("cheese cake");
        cake.setCategory("desert");
        cake.setPrice(4.59);

        myMenu.insertMenuItem(soup);
        myMenu.insertMenuItem(chips);
        myMenu.insertMenuItem(cake);
        soup.printMenuItem();
        myMenu.printMenu();
        soup.printMenuItem();
        myMenu.removeMenuItem(cake);
        myMenu.printMenu();

    }
}
