package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public Hamburger(double price) {
        this.price = price;
    }
    public void addHamburgerAddition1(String name, double price){
       addition1Name=name;
       addition1Price=price;
    }
    public void addHamburgerAddition2(String name, double price){
        addition2Name=name;
        addition2Price=price;
    }
    public void addHamburgerAddition3(String name, double price){
        addition3Name=name;
        addition3Price=price;
    }
    public void addHamburgerAddition4(String name, double price){
        addition4Name=name;
        addition4Price=price;
    }

    public double itemizeHamburger(){
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);

        double totalPrice = price;
        if (addition1Name != null) {
            System.out.println("Addition1: " + addition1Name);
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            System.out.println("Addition2: " + addition2Name);
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("Addition3: " + addition3Name);
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            System.out.println("Addition4: " + addition4Name);
            totalPrice += addition4Price;
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
