import java.util.Scanner;

public class Main {

    static Scanner tastiera = new Scanner(System.in);

    public static Punto creaPunto() {

        System.out.print("Inserisci x: ");
        double x = tastiera.nextDouble();

        System.out.print("Inserisci y: ");
        double y = tastiera.nextDouble();

        return new Punto(x, y);
    }

    public static Vettore creaVettore() {

        System.out.println("Inserisci il punto origine");
        Punto origine = creaPunto();

        System.out.println("Inserisci il punto vertice");
        Punto vertice = creaPunto();

        return new Vettore(origine, vertice);
    }

    public static void main(String[] args) {

        Vettore v1 = null;
        Vettore v2 = null;

        int scelta = -1;

        while (scelta != 0) {

            System.out.println("--- MENU ---");
            System.out.println("1. Definisci i vettori");
            System.out.println("2. Visualizza i vettori");
            System.out.println("3. Calcola le lunghezze");
            System.out.println("4. Sposta l'origine di un vettore");
            System.out.println("5. Verifica se le origini sono uguali");
            System.out.println("0. Esci");

            System.out.print("Scelta: ");
            scelta = tastiera.nextInt();

            if (scelta == 1) {

                System.out.println("Creazione Vettore 1");
                v1 = creaVettore();

                System.out.println("Creazione Vettore 2");
                v2 = creaVettore();
            }

            if (scelta == 2) {

                if (v1 != null && v2 != null) {
                    System.out.println("V1 = " + v1);
                    System.out.println("V2 = " + v2);
                } else {
                    System.out.println("Prima crea i vettori.");
                }
            }

            if (scelta == 3) {

                if (v1 != null && v2 != null) {
                    System.out.println("Lunghezza V1 = " + v1.calcolaLunghezza());
                    System.out.println("Lunghezza V2 = " + v2.calcolaLunghezza());

                } else {
                    System.out.println("Prima crea i vettori.");
                }
            }

            if (scelta == 4) {

                if (v1 != null && v2 != null) {

                    System.out.println("1. Sposta origine di V1");
                    System.out.println("2. Sposta origine di V2");

                    int sceltaVettore = tastiera.nextInt();

                    System.out.println("Nuova origine:");

                    Punto p = creaPunto();

                    if (sceltaVettore == 1) {
                        v1.spostaOrigine(p);
                    }

                    if (sceltaVettore == 2) {
                        v2.spostaOrigine(p);
                    }

                } else {
                    System.out.println("Prima crea i vettori.");
                }
            }

            if (scelta == 5) {

                if (v1 != null && v2 != null) {

                    if (v1.verificaOrigine(v2.getOrigine())) {
                        System.out.println("I vettori hanno la stessa origine.");
                    } else {
                        System.out.println("I vettori NON hanno la stessa origine.");
                    }

                } else {
                    System.out.println("Prima crea i vettori.");
                }
            }

            if (scelta == 0) {
                System.out.println("Programma terminato.");
            }
        }
    }
}