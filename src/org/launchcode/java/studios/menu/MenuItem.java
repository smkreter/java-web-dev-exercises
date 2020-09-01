package org.launchcode.java.studios.menu;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean getNewness() {
        return isNew;
    }

    public String toString() {
        String newNote = " (New)";
        if (this.isNew) {
            return "Item: " + this.description + " || " + this.price + newNote;
        } else return "Item: " + this.description + " || " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 &&
                Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}