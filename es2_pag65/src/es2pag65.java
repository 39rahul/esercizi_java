import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] v = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il valore minimo a: ");
        int a = in.nextInt();
        System.out.print("Inserisci il valore massimo b (maggiore di a): ");
        int b = in.nextInt();

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (b - a + 1)) + a;
        }

        int m = (a + b) / 2;

        System.out.print("Valori generati nel vettore: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();

        System.out.print("Valori compresi tra " + a + " e " + m + ": ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= a && v[i] <= m) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Valori compresi tra " + (m + 1) + " e " + b + ": ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= m + 1 && v[i] <= b) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
}