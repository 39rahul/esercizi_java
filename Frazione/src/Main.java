import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numeratore: ");
        int n = sc.nextInt();

        System.out.print("Denominatore: ");
        int d = sc.nextInt();

        Frazione f1 = new Frazione(n, d);

        int scelta;

        do {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Visualizza frazione");
            System.out.println("2. Semplifica");
            System.out.println("3. Reciproca");
            System.out.println("4. Opposta");
            System.out.println("5. Somma");
            System.out.println("6. Sottrazione");
            System.out.println("7. Moltiplicazione");
            System.out.println("8. Divisione");
            System.out.println("9. Potenza");
            System.out.println("0. Esci");

            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {

                case 1:
                    System.out.println("Frazione: " + f1);
                    break;

                case 2:
                    f1.semplificaFrazione();
                    System.out.println("Frazione semplificata: " + f1);
                    break;

                case 3:
                    System.out.println("Reciproca: " + f1.reciprocaFrazione());
                    break;

                case 4:
                    System.out.println("Opposta: " + f1.oppostaFrazione());
                    break;

                case 5:
                    System.out.print("Numeratore seconda frazione: ");
                    int n2 = sc.nextInt();

                    System.out.print("Denominatore seconda frazione: ");
                    int d2 = sc.nextInt();

                    Frazione f2 = new Frazione(n2, d2);

                    System.out.println("Somma: " + f1.sommaFrazione(f2));
                    break;

                case 6:
                    System.out.print("Numeratore seconda frazione: ");
                    int n3 = sc.nextInt();

                    System.out.print("Denominatore seconda frazione: ");
                    int d3 = sc.nextInt();

                    Frazione f3 = new Frazione(n3, d3);

                    System.out.println("Differenza: " + f1.sottraiFrazione(f3));
                    break;

                case 7:
                    System.out.print("Numeratore seconda frazione: ");
                    int n4 = sc.nextInt();

                    System.out.print("Denominatore seconda frazione: ");
                    int d4 = sc.nextInt();

                    Frazione f4 = new Frazione(n4, d4);

                    System.out.println("Prodotto: " + f1.moltiplicaFrazione(f4));
                    break;

                case 8:
                    System.out.print("Numeratore seconda frazione: ");
                    int n5 = sc.nextInt();

                    System.out.print("Denominatore seconda frazione: ");
                    int d5 = sc.nextInt();

                    Frazione f5 = new Frazione(n5, d5);

                    System.out.println("Quoziente: " + f1.dividiFrazione(f5));
                    break;

                case 9:
                    System.out.print("Potenza: ");
                    int p = sc.nextInt();

                    System.out.println("Risultato: " + f1.potenzaFrazione(p));
                    break;

                case 0:
                    System.out.println("Fine programma");
                    break;

                default:
                    System.out.println("Scelta non valida");
            }

        } while (scelta != 0);

        sc.close();
    }
}