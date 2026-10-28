import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci una data nel formato aaaa-mm-gg: ");
        String stringaData = in.nextLine();

        LocalDate dataInserita = LocalDate.parse(stringaData);

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