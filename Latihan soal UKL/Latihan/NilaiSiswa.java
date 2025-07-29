package Latihan;

import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah , nilai;
        double rataNilai=0;
        
        System.out.print("Masukkan jumlah siswa: ");
        jumlah = scanner.nextInt();
        
        int totalNilai = 0;
        
        for (int i = 1; i <= jumlah; i++) {

            System.out.print("Masukkan nilai siswa " + i + ": ");
            nilai = scanner.nextInt();
            totalNilai += nilai;
            rataNilai = totalNilai/jumlah;
        }
        System.out.println("Jumlah siswa : " + jumlah);
        System.out.println("Rata-rata nilai siswa adalah: " + rataNilai);
        
    }
}