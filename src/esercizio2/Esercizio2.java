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
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> ("Devi inserire un numero tra 0 e 3");
        };
    }
}
