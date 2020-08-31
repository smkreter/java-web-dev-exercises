package org.launchcode.java.studios.menu;

package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }
    //add and remove items from the menu
    public ArrayList<MenuItem> addItem(MenuItem someMenuItem) {
        items.add(someMenuItem);
        return items;
    }
    public ArrayList<MenuItem> removeItem(MenuItem someMenuItem) {
        if (items.contains(someMenuItem)) {
            items.remove(someMenuItem);
        }
        return items;
    }
}