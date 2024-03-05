package esercizio2;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int userNumber = scanner.nextInt();
        System.out.println(between(userNumber));
        scanner.close();
    }

    public static String between(int num){
        switch (num) {
            case 0: {
                return "Zero";
            }case 1: {
                return "Uno";
            }case 2: {
                return "Due";
            }case 3: {
                return "Tre";
            }
            default: {
                return ("Devi inserire un numero tra 0 e 3");
            }
        }
    }
}
