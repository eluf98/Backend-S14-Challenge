package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super(19.10);
        cips= "CURVY";
        drink="COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("nDeluxe Burger için yeni malzeme eklenemez.");
    }
    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + "Deluxe Burger");
        System.out.println("Meat: " + "Double");
        System.out.println("BreadRollType: " + "Double Sandwich");
        System.out.println("Price: " + 19.10);
        return 19.10;
    }
}
