package Inventory;

import java.util.Scanner;

public class Tessar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //array project
        System.out.println("masukkan jumlah object");
        int object = s.nextInt();
        Product[] p = new Product[object];
        //loop
        for (int i = 0; i < p.length; i++) {
            System.out.println("nama");
            String nama = s.next();

            System.out.println("number");
            int number = s.nextInt();
            System.out.println("quantity");
            int quantity =s.nextInt();
            System.out.println("price");
            double price =s.nextDouble();
            p[i] = new Product(number, nama, quantity, price);
            p[i].print();
        }
        p[1] = new Product();
        
        CD[] c = new CD[5];
        c[4] = new CD();

    }

}