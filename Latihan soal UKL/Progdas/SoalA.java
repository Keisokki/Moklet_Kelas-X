package Progdas;

import java.util.Scanner;

public class SoalA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Berat paket: ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan Lebar paket: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan Tinggi paket: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan panjang paket: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan jarak tempuh paket: ");
        double jarak = scanner.nextDouble();

        double volume = panjang * lebar * tinggi;

        if (jarak <= 10 && volume <= 100) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Harga paket adalah Rp." + (berat*4250));
            System.out.println("Karena volume paket tidak lebih dari 100, nmaka tidak dikenai biaya tambahan");

        } else if (jarak >= 10 && volume <=100) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Harga paket adalah " + (berat*6000));
            System.out.println("Karena volume paket tidak lebih dari 100, nmaka tidak dikenai biaya tambahan");
        } else if (jarak <= 10 && volume >= 100){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Harga paket adalah " + (berat*4250));
            System.out.println("Karena volume paket lebih dari 100, maka dikenai biaya tambahan sebesar Rp.50.000");
            System.out.println("Total harga paket adalah Rp." + ((berat*4250) + 50000));
        } else if (jarak >= 10 && volume >= 100){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Harga paket adalah " + (berat*6000));
            System.out.println("Karena volume paket lebih dari 100, maka dikenai biaya tambahan sebesar Rp.50.000");
            System.out.println("Total harga paket adalah Rp." + ((berat*6000) + 50000));
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Berat paket adalah " + berat);
        System.out.println("Volume paket adalah " + volume);



    }
}