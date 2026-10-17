import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Punto p1 = new Punto();
        int scelta;

        do {
            System.out.println("\n--- MENU GESTIONE PUNTO GEOMETRICO ---");
            System.out.println("1. Crea punto con coordinate personalizzate");
            System.out.println("2. Mostra coordinate (toString)");
            System.out.println("3. Calcola distanza da un altro punto");
            System.out.println("4. Calcola punto medio con un altro punto");
            System.out.println("5. Ruota il punto rispetto all'origine");
            System.out.println("6. Crea copia del punto");
            System.out.println("0. Esci");
            System.out.print("Seleziona un'opzione: ");

            scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.print("Inserisci la coordinata x: ");
                double x = scanner.nextDouble();
                System.out.print("Inserisci la coordinata y: ");
                double y = scanner.nextDouble();
                p1 = new Punto(x, y);
                System.out.println("Punto aggiornato a: " + p1.toString());
            } else if (scelta == 2) {
                System.out.println("Coordinate attuali: " + p1.toString());
            } else if (scelta == 3) {
                System.out.print("Inserisci la x del secondo punto: ");
                double x2 = scanner.nextDouble();
                System.out.print("Inserisci la y del secondo punto: ");
                double y2 = scanner.nextDouble();
                Punto p2 = new Punto(x2, y2);
                double d = p1.distanza(p2);
                System.out.println("La distanza tra " + p1.toString() + " e " + p2.toString() + " e': " + d);
            } else if (scelta == 4) {
                System.out.print("Inserisci la x del secondo punto: ");
                double x2 = scanner.nextDouble();
                System.out.print("Inserisci la y del secondo punto: ");
                double y2 = scanner.nextDouble();
                Punto p2 = new Punto(x2, y2);
                Punto medio = p1.puntoMedio(p2);
                System.out.println("Il punto medio e': " + medio.toString());
            } else if (scelta == 5) {
                System.out.print("Inserisci l'angolo di rotazione in gradi (es. 90): ");
                double angolo = scanner.nextDouble();
                p1.ruota(angolo);
                System.out.println("Punto dopo la rotazione: " + p1.toString());
            } else if (scelta == 6) {
                Punto pCopia = new Punto(p1);
                System.out.println("Punto copiato con successo: " + pCopia.toString());
            } else if (scelta == 0) {
                System.out.println("Uscita dal programma in corso...");
            } else {
                System.out.println("Scelta non valida, riprova.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}