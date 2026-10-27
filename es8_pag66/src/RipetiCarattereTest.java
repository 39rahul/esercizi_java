import java.util.Scanner;

public class RipetiCarattereTest {

    // Metodo statico che restituisce una stringa con il carattere c ripetuto n volte
    public static String ripetiCarattere(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un carattere:");
        char carattere = in.next().charAt(0);

        System.out.println("Inserisci il numero di volte (n):");
        int n = in.nextInt();

        String risultato = ripetiCarattere(carattere, n);

        System.out.println("Stringa generata: " + risultato);

        in.close();
    }
}