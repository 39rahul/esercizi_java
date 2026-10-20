import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        Scanner in = new Scanner(System.in);

        int conta = 0;

        System.out.println("Inserisci fino a 10 numeri interi (un numero negativo interrompe l'inserimento):");

        while (conta < 10) {
            System.out.print("Inserisci il numero in posizione " + conta + ": ");
            int num = in.nextInt();

            if (num < 0) {
                break;
            }

            v[conta] = num;
            conta++;
        }

        System.out.println("I numeri inseriti in ordine inverso sono:");
        for (int i = conta - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}