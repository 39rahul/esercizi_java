import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("Le capitali europee");

        Risposta[] r1 = {
                new Risposta("Zurigo", false),
                new Risposta("Berna", true),
                new Risposta("Basilea", false),
                new Risposta("Ginevra", false)
        };
        Domanda d1 = new Domanda("Qual e' la capitale della Svizzera?", r1);
        quiz.add(d1);

        Risposta[] r2 = {
                new Risposta("Parigi", true),
                new Risposta("Lione", false),
                new Risposta("Marsiglia", false),
                new Risposta("Nizza", false)
        };
        Domanda d2 = new Domanda("Qual e' la capitale della Francia?", r2);
        d2.setValore(2);
        quiz.add(d2);

        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("=== MENU QUIZ ===");
            System.out.println("1. Visualizza informazioni sul Quiz");
            System.out.println("2. Mostra domande non ancora risposte");
            System.out.println("3. Rispondi a una domanda");
            System.out.println("4. Visualizza punteggio parziale/totale");
            System.out.println("5. Esci e termina");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.println(quiz.toString());
            } else if (scelta == 2) {
                int[] nonDate = quiz.getDomandeNonDate();
                System.out.print("Domande non risposte: ");
                for (int i = 0; i < nonDate.length; i++) {
                    System.out.print(nonDate[i] + " ");
                }
                System.out.println();
            } else if (scelta == 3) {
                System.out.print("Inserisci il numero della domanda da 1 a " + quiz.getQuanteDomande() + ": ");
                int numDomanda = scanner.nextInt();
                Domanda dom = quiz.getDomanda(numDomanda);
                if (dom != null) {
                    System.out.println(dom.toString());
                    System.out.print("Scegli la risposta (1-4): ");
                    int rispUtente = scanner.nextInt();
                    boolean esito = dom.rispondi(rispUtente);
                    if (esito) {
                        System.out.println("Risposta CORRETTA!");
                    } else {
                        System.out.println("Risposta SBAGLIATA.");
                    }
                } else {
                    System.out.println("Numero domanda non valido!");
                }
            } else if (scelta == 4) {
                System.out.println("Punteggio attuale: " + quiz.getPunteggio() + " su " + quiz.getTotale());
            } else if (scelta == 5) {
                continua = false;
                System.out.println("Fine del test. Punteggio finale: " + quiz.getPunteggio() + " / " + quiz.getTotale());
            } else {
                System.out.println("Scelta non valida.");
            }
        }
        scanner.close();
    }
}