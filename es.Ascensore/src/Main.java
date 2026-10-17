import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ascensore ascensore = new Ascensore(10); // Istanza di default con 10 piani
        int scelta;

        do {
            System.out.println("\n--- MENU GESTIONE ELEVATOR ---");
            System.out.println("1. Crea nuovo ascensore (specifica piani)");
            System.out.println("2. Mostra stato (toString)");
            System.out.println("3. Apri le porte");
            System.out.println("4. Chiudi le porte");
            System.out.println("5. Sali di un piano (goUp)");
            System.out.println("6. Scendi di un piano (goDown)");
            System.out.println("7. Vai a un piano specifico (goToFloor)");
            System.out.println("0. Esci");
            System.out.print("Seleziona un'opzione: ");

            scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.print("Inserisci il numero di piani serviti: ");
                int p = scanner.nextInt();
                ascensore = new Ascensore(p);
                System.out.println("Ascensore creato con successo!");
            } else if (scelta == 2) {
                System.out.println(ascensore.toString());
            } else if (scelta == 3) {
                ascensore.open();
                System.out.println("Porte aperte.");
            } else if (scelta == 4) {
                ascensore.close();
                System.out.println("Porte chiuse.");
            } else if (scelta == 5) {
                boolean esito = ascensore.goUp();
                if (esito) {
                    System.out.println("Spostamento riuscito. Piano corrente: " + ascensore.getFloor());
                } else {
                    System.out.println("Impossibile salire (porte aperte o ultimo piano raggiunto).");
                }
            } else if (scelta == 6) {
                boolean esito = ascensore.goDown();
                if (esito) {
                    System.out.println("Spostamento riuscito. Piano corrente: " + ascensore.getFloor());
                } else {
                    System.out.println("Impossibile scendere (porte aperte o già al piano terra).");
                }
            } else if (scelta == 7) {
                System.out.print("Inserisci il piano di destinazione (da 0 a " + (ascensore.getFloors() - 1) + "): ");
                int dest = scanner.nextInt();
                boolean esito = ascensore.goToFloor(dest);
                if (esito) {
                    System.out.println("Raggiunto con successo il piano " + dest);
                } else {
                    System.out.println("Operazione fallita (piano non valido o porte aperte).");
                }
            } else if (scelta == 0) {
                System.out.println("Uscita dal programma in corso...");
            } else {
                System.out.println("Scelta non valida, riprova.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}