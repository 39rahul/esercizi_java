import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();
        System.out.println("Data odierna: " + oggi);

        LocalDate traUnGiorno = oggi.plusDays(1);
        System.out.println("Tra un giorno sarà il: " + traUnGiorno);

        LocalDate traUnMese = oggi.plusMonths(1);
        System.out.println("Tra un mese sarà il: " + traUnMese);

        LocalDate traUnAnno = oggi.plusYears(1);
        System.out.println("Tra un anno sarà il: " + traUnAnno);
    }
}
