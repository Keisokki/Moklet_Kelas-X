package Latihan;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = s.nextInt();

        cek(n); 

    }
    
    public static void cek(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan genap");
        } else {
            System.out.println(n + " adalah bilangan ganjil");
        }
    }

    public static boolean cekGenap(int n) {
        if (n % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }

}
