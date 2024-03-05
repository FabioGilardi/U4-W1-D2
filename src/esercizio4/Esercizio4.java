package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int userNum = scanner.nextInt();
        printCountdown(userNum);
        scanner.close();
    }

    public static void printCountdown(int num){
        for (int i = 0; i < num; i++) {
            System.out.println(num - (i + 1));
        }
    }
}
