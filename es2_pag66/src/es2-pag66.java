import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la prima parola:");
        String parola1 = in.next();

        System.out.println("Inserisci la seconda parola:");
        String parola2 = in.next();

        if (parola1.length() > parola2.length()) {
            System.out.println("La parola più lunga è: " + parola1);
        } else if (parola2.length() > parola1.length()) {
            System.out.println("La parola più lunga è: " + parola2);
        } else {
            System.out.println("Le due parole hanno la stessa lunghezza.");
        }
    }
}