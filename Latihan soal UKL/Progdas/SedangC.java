package Progdas;

import java.util.Random;
import java.util.Scanner;

public class SedangC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepPlaying = true;

        while (keepPlaying) {
            int number1 = random.nextInt(10) + 1;  // Angka acak antara 1 dan 10
            int number2 = random.nextInt(10) + 1;  // Angka acak antara 1 dan 10
            int operator = random.nextInt(3);  // 0: *, 1: /, 2: %

            if (operator != 0 && number1 < number2) {
                // Tukar nilai agar number1 selalu lebih besar atau sama dengan number2
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            String question = "";
            int correctAnswer = 0;

            switch (operator) {
                case 0:
                    question = number1 + " * " + number2 + " = ";
                    correctAnswer = number1 * number2;
                    break;
                case 1:
                    question = number1 + " / " + number2 + " = ";
                    correctAnswer = number1 / number2;
                    break;
                case 2:
                    question = number1 + " % " + number2 + " = ";
                    correctAnswer = number1 % number2;
                    break;
            }

            System.out.print(question);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.print("Ingin melanjutkan kuis? (ya/tidak): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("tidak")) {
                keepPlaying = false;
            }
        }

        scanner.close();
        System.out.println("Terima kasih telah bermain!");
    }
}
