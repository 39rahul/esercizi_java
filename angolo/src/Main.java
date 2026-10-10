import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static Angolo creaAngolo() {

        System.out.print("Gradi: ");
        int g = sc.nextInt();

        System.out.print("Minuti: ");
        int m = sc.nextInt();

        System.out.print("Secondi: ");
        int s = sc.nextInt();

        return new Angolo(g, m, s);
    }

    public static void main(String[] args) {

        int scelta;

        do {

            System.out.println("--- MENU ---");
            System.out.println("1. Inserisci due angoli");
            System.out.println("2. Somma due angoli");
            System.out.println("3. Differenza tra due angoli");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();

            switch (scelta) {

                case 1:

                    System.out.println("Primo angolo:");
                    Angolo a1 = creaAngolo();

                    System.out.println("Secondo angolo:");
                    Angolo a2 = creaAngolo();

                    System.out.println("Angolo 1 = " + a1);
                    System.out.println("Angolo 2 = " + a2);

                    break;

                case 2:

                    System.out.println("Primo angolo:");
                    Angolo s1 = creaAngolo();

                    System.out.println("Secondo angolo:");
                    Angolo s2 = creaAngolo();

                    Angolo somma = s1.sommaAngolo(s2);

                    System.out.println("Somma = " + somma);

                    break;

                case 3:

                    System.out.println("Primo angolo:");
                    Angolo d1 = creaAngolo();

                    System.out.println("Secondo angolo:");
                    Angolo d2 = creaAngolo();

                    Angolo diff = d1.sottraiAngolo(d2);

                    System.out.println("Differenza = " + diff);

                    break;

                case 0:
                    System.out.println("Programma terminato.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        sc.close();
    }
}