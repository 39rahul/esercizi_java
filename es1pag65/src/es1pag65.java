import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] v = new int[10];
        Scanner in = new Scanner(System.in);

        int quanti;
        do {
            System.out.print("Quanti valori vuoi inserire (massimo 10)? ");
            quanti = in.nextInt();
        } while (quanti < 1 || quanti > 10);

        System.out.println("Inserisci i " + quanti + " valori:");
        for (int i = 0; i < quanti; i++) {
            v[i] = in.nextInt();
        }

        int numPari = 0;
        int numDispari = 0;
        for (int i = 0; i < quanti; i++) {
            if (v[i] % 2 == 0) {
                numPari++;
            } else {
                numDispari++;
            }
        }

        System.out.print(numPari + " elementi pari: ");
        for (int i = 0; i < quanti; i++) {
            if (v[i] % 2 == 0) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();

        System.out.print(numDispari + " elementi dispari: ");
        for (int i = 0; i < quanti; i++) {
            if (v[i] % 2 != 0) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
}