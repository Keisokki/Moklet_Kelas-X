package Inventory;

public class Product {
    private String name;
    private int number;
    private int quantity;
    private double price;

    public Product () {
        number = 0;
        name = "";
        quantity = 0;
        price = 0;
    }

    public Product (int number, String name, int quantity, double price) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void print() {
        System.out.println("--------------------------------");
        System.out.println("Product Name: " + name);
        System.out.println("Product Number: " + number);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Product Price: " + price);
    }

}