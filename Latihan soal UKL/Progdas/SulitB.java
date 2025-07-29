package Progdas;

public class SulitB {   
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 2, 5};
            boolean duplikat = false;
    
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        duplikat = true;
                        System.out.println("Array memiliki elemen duplikat: " + array[i]);
                        break;
                    }
                }
                if (duplikat) {
                    break;
                }
            }
    
            if (!duplikat) {
                System.out.println("Array tidak memiliki elemen duplikat.");
            }
        }
}
