package restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isNew(){
        if (this.newItem){
            return "new";
        } else {
            return "";
        }
    }

    public void printMenuItem(){
        String output = "description: " + this.description + "\ncategory: " + this.category + "\nprice: " + this.price;
        System.out.println(output);
    }

    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || getClass() != toBeCompared.getClass()){
            return false;
        }
        MenuItem menuItem = (MenuItem) toBeCompared;
        return price == menuItem.price && newItem == menuItem.newItem && description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    public String toString(){
        return "description: " + description + "\ncategory: " + category + "\nprice: " + price + "\n";
    }

}
