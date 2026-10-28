import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il giorno: ");
        int giorno = in.nextInt();

        System.out.print("Inserisci il mese: ");
        int mese = in.nextInt();

        System.out.print("Inserisci l'anno: ");
        int anno = in.nextInt();

        LocalDate dataInserita = LocalDate.of(anno, mese, giorno);

        LocalDate traUnGiorno = dataInserita.plusDays(1);
        LocalDate traUnMese = dataInserita.plusMonths(1);
        LocalDate traUnAnno = dataInserita.plusYears(1);

        System.out.println("Data inserita: " + dataInserita);
        System.out.println("Tra un giorno sarà: " + traUnGiorno);
        System.out.println("Tra un mese sarà: " + traUnMese);
        System.out.println("Tra un anno sarà: " + traUnAnno);

        in.close();
    }
}