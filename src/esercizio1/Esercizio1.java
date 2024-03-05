package esercizio1;

public class Esercizio1 {

    public static void main(String[] args) {
        System.out.println(stringaPariDispari("Ciaoo"));
        System.out.println(annoBisestile(1400));
    }

    public static boolean stringaPariDispari(String word){
        return word.length() % 2 == 0;
    }

    public static boolean annoBisestile(int year){
        return year % 4 == 0;
    }
}
