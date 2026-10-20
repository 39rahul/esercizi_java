import java.util.Scanner;

public class Main_es1pag70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TazzaPerDadi tazza = null;

        int scelta;
        do {
            System.out.println("\n--- MENU GESTIONE TAZZA PER DADI ---");
            System.out.println("1. Crea tazza con capacità massima");
            System.out.println("2. Crea tazza con N dadi da F facce");
            System.out.println("3. Aggiungi un dado personalizzato");
            System.out.println("4. Visualizza informazioni tazza (toString)");
            System.out.println("5. Lancia tutti i dadi della tazza");
            System.out.println("6. Visualizza statistiche (Minimo, Massimo, Quantità, Capienza)");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = in.nextInt();

            if (scelta == 1) {
                System.out.print("Inserisci la capienza massima della tazza: ");
                int cap = in.nextInt();
                tazza = new TazzaPerDadi(cap);
                System.out.println("Tazza creata con successo!");
            }
            else if (scelta == 2) {
                System.out.print("Inserisci il numero di dadi (N): ");
                int n = in.nextInt();
                System.out.print("Inserisci il numero di facce (F): ");
                int f = in.nextInt();
                tazza = new TazzaPerDadi(n, f);
                System.out.println("Tazza creata con successo!");
            }
            else if (scelta == 3) {
                if (tazza == null) {
                    System.out.println("Prima devi creare una tazza (opzione 1 o 2)!");
                } else {
                    System.out.print("Inserisci il numero di facce del nuovo dado: ");
                    int facceDado = in.nextInt();
                    Dado nuovoDado = new Dado(facceDado);
                    boolean aggiunto = tazza.add(nuovoDado);
                    if (aggiunto) {
                        System.out.println("Dado aggiunto correttamente.");
                    } else {
                        System.out.println("Errore: la tazza è piena!");
                    }
                }
            }
            else if (scelta == 4) {
                if (tazza == null) {
                    System.out.println("Nessuna tazza creata.");
                } else {
                    System.out.println("\n" + tazza.toString());
                }
            }
            else if (scelta == 5) {
                if (tazza == null || tazza.isEmpty()) {
                    System.out.println("La tazza è vuota o non esiste.");
                } else {
                    int risultatoLancio = tazza.lancia();
                    System.out.println("Risultato del lancio di tutti i dadi: " + risultatoLancio);
                }
            }
            else if (scelta == 6) {
                if (tazza == null) {
                    System.out.println("Nessuna tazza creata.");
                } else {
                    System.out.println("Capienza massima (size): " + tazza.size());
                    System.out.println("Dadi contenuti (quanti): " + tazza.quanti());
                    System.out.println("È vuota? " + tazza.isEmpty());
                    if (!tazza.isEmpty()) {
                        System.out.println("Punteggio minimo ottenibile: " + tazza.getMinimo());
                        System.out.println("Punteggio massimo ottenibile: " + tazza.getMassimo());
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