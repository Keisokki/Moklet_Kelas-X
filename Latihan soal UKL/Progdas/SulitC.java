package Progdas;

public class SulitC {
    public static void main(String[] args) {
            int[] array = {1, 2, 2, 3, 3, 3, 4};
            int[] frekuensi = new int[100]; // Asumsi elemen array tidak lebih dari 99
            
            // Menghitung frekuensi setiap elemen dalam array
            for (int num : array) {
                frekuensi[num]++;
            }
    
            // Menampilkan hasil
            for (int i = 0; i < frekuensi.length; i++) {
                if (frekuensi[i] > 0) {
                    System.out.println(i + " muncul " + frekuensi[i] + " kali");
                }
            }
   }
}
