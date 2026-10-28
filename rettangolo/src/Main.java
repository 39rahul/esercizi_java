import java.util.Scanner;

public class Main {

    public static Punto creaPunto(Scanner in) {
        System.out.print("Inserisci la coordinata x: ");
        double x = in.nextDouble();
        System.out.print("Inserisci la coordinata y: ");
        double y = in.nextDouble();
        return new Punto(x, y);
    }

    public static Rettangolo creaRettangolo(Scanner in) {
        System.out.println("Inserimento del primo punto (a):");
        Punto a = creaPunto(in);
        System.out.println("Inserimento del secondo punto opposto (b):");
        Punto b = creaPunto(in);
        return new Rettangolo(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rettangolo r1 = null;
        Rettangolo r2 = null;

        int scelta;
        do {
            System.out.println("\n--- MENU GESTIONE RETTANGOLI ---");
            System.out.println("1. Definire i rettangoli r1 e r2");
            System.out.println("2. Visualizzare le coordinate dei rettangoli");
            System.out.println("3. Calcolare i perimetri");
            System.out.println("4. Calcolare le aree");
            System.out.println("5. Traslare i rettangoli");
            System.out.println("6. Verificare se r2 è completamente contenuto in r1");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = in.nextInt();

            if (scelta == 1) {
                System.out.println("\n--- Definizione del Rettangolo r1 ---");
                r1 = creaRettangolo(in);
                System.out.println("\n--- Definizione del Rettangolo r2 ---");
                r2 = creaRettangolo(in);
                System.out.println("Rettangoli definiti con successo!");
            }
            else if (scelta == 2) {
                if (r1 == null || r2 == null) {
                    System.out.println("Prima devi definire entrambi i rettangoli (opzione 1).");
                } else {
                    System.out.println("r1: " + r1);
                    System.out.println("r2: " + r2);
                }
            }
            else if (scelta == 3) {
                if (r1 == null || r2 == null) {
                    System.out.println("Prima devi definire entrambi i rettangoli (opzione 1).");
                } else {
                    System.out.println("Perimetro di r1: " + r1.calcolaPerimetro());
                    System.out.println("Perimetro di r2: " + r2.calcolaPerimetro());
                }
            }
            else if (scelta == 4) {
                if (r1 == null || r2 == null) {
                    System.out.println("Prima devi definire entrambi i rettangoli (opzione 1).");
                } else {
                    System.out.println("Area di r1: " + r1.calcolaArea());
                    System.out.println("Area di r2: " + r2.calcolaArea());
                }
            }
            else if (scelta == 5) {
                if (r1 == null || r2 == null) {
                    System.out.println("Prima devi definire entrambi i rettangoli (opzione 1).");
                } else {
                    System.out.print("Inserisci lo spostamento dx: ");
                    double dx = in.nextDouble();
                    System.out.print("Inserisci lo spostamento dy: ");
                    double dy = in.nextDouble();

                    r1.effettuatrasla(dx, dy);
                    r2.effettuatrasla(dx, dy);
                    System.out.println("Traslazione completata con successo!");
                }
            }
            else if (scelta == 6) {
                if (r1 == null || r2 == null) {
                    System.out.println("Prima devi definire entrambi i rettangoli (opzione 1).");
                } else {
                    boolean incluso = r1.contenuto(r2);
                    if (incluso) {
                        System.out.println("Esito: Il rettangolo r2 è COMPLETAMENTE contenuto in r1.");
                    } else {
                        System.out.println("Esito: Il rettangolo r2 NON è completamente contenuto in r1.");
                    }
                }
            }
            else if (scelta == 0) {
                System.out.println("Uscita dal programma.");
            }
            else {
                System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);

        in.close();
    }
}