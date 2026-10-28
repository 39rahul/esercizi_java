import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una stringa di testo:");
        String input = in.nextLine();

        int totaleVocali = ContaVocali.contaVocali(input);

        System.out.println("La stringa inserita contiene " + totaleVocali + " vocali.");

        in.close();
    }
}