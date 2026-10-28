import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un indirizzo email:");
        String email = in.nextLine();

        // Trova l'indice dell'ultimo punto nella stringa
        int ultimoPunto = email.lastIndexOf('.');

        // Estrae la parte successiva all'ultimo punto salvandola in una stringa
        String dominioPrimoLivello = email.substring(ultimoPunto + 1);

        // Stampa il dominio di primo livello a video
        System.out.println("Il dominio di primo livello estratto è: " + dominioPrimoLivello);

        in.close();
    }
}