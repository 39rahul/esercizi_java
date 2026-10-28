import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un indirizzo email:");
        String email = in.nextLine();

        int ultimoPunto = email.lastIndexOf('.');

        String dominioPrimoLivello = email.substring(ultimoPunto + 1);

        System.out.println("Il dominio di primo livello estratto è: " + dominioPrimoLivello);

        in.close();
    }
}