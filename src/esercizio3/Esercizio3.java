package esercizio3;
import java.util.Arrays;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String userWord = scanner.nextLine();
        while (!userWord.equals(":q")) {
            wordSplitter(userWord);
            userWord = scanner.nextLine();
        }
        scanner.close();
    }

    public static void wordSplitter(String word){
        String[] wordsLetters = word.split("");
        System.out.println(Arrays.toString(wordsLetters));
    }
}
