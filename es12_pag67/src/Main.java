import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un indirizzo email:");
        String email = in.nextLine();

        int indiceChiocciola = email.indexOf('@');

        String dominio = email.substring(indiceChiocciola + 1);

        System.out.println("Il dominio estratto è: " + dominio);

        in.close();
    }
}
