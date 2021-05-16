package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date updated = new Date(2017,01,01);

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getUpdated() {
        return updated;
    }

    public void insertMenuItem(MenuItem item){
        this.menuItems.add(item);
        this.updated = Calendar.getInstance().getTime();
    }

    public void removeMenuItem(MenuItem item){
        this.menuItems.remove(item);
    }

    public String menuDate(){
        String modifiedDate = String.format("Menu was updated on %s",this.updated.toString());
        return modifiedDate;
    }

    public void printMenu(){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

}
