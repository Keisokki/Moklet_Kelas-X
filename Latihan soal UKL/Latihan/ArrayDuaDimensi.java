package Latihan;

import java.util.Scanner;

public class ArrayDuaDimensi{
    public static void main(String[] args){
        int[][] idGol = {{1,2,3,4}, {1,2,3}};
        String[][] namaAlamat = {{"Galuh", "Indro", "Jedi", "Kanu"},
        {"Sawojajar","Blimbing", "Lowokwaru", "Klojen" }};

        Scanner s = new Scanner(System.in);
        System.out.println("Inputkan ID Pelanggan : ");
        int idPelanggan = s.nextInt();
        System.out.println("Inputkan jumlah pemakaian KwH : ");
        int kwH = s.nextInt();
        s.close();

        switch(idPelanggan){
            case 1:
                System.out.println("ID Pelanggan : " + idGol[0][0]);
                System.out.println("Nama : " + namaAlamat[0][0]);
                System.out.println("Golongan : " + idGol[1][0]);
                System.out.println("Alamat : " + namaAlamat[1][0]);
                System.out.println("Jumlah KwH : " + kwH);
                System.out.println("Biaya : " + (kwH * 1000));
                break;
            case 2:
                System.out.println("ID Pelanggan : " + idGol[0][1]);
                System.out.println("Nama : " + namaAlamat[0][1]);
                System.out.println("Golongan : " + idGol[1][2]);
                System.out.println("Alamat : " + namaAlamat[1][1]);
                System.out.println("Jumlah KwH : " + kwH);
                System.out.println("Biaya : " + (kwH * 2000));
                break;
            case 3:
                System.out.println("ID Pelanggan : " + idGol[0][2]);
                System.out.println("Nama : " + namaAlamat[0][2]);
                System.out.println("Golongan : " + idGol[1][1]);
                System.out.println("Alamat : " + namaAlamat[1][2]);
                System.out.println("Jumlah KwH : " + kwH);
                System.out.println("Biaya : " + (kwH * 1500));
                break;
            case 4:
                System.out.println("ID Pelanggan : " + idGol[0][3]);
                System.out.println("Nama : " + namaAlamat[0][3]);
                System.out.println("Golongan : " + idGol[1][2]);
                System.out.println("Alamat : " + namaAlamat[1][3]);
                System.out.println("Jumlah KwH : " + kwH);
                System.out.println("Biaya : " + (kwH * 2000));
                break;
            default :
                System.out.println("ID Pelanggan Tidak Ditemukan");
                break;
        }
    }
}