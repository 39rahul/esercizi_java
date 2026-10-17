public class Main {
    public static void main(String[] args) {
        System.out.println("--- TEST DELLA CLASSE CONTOCORRENTE ---");

        // Creazione del conto corrente
        ContoCorrente conto = new ContoCorrente("Mario", "Rossi", "CC12345");
        System.out.println("Conto creato:");
        System.out.println(conto.toString());

        // Test del metodo deposita con importo valido
        System.out.println("Deposito 500.0 euro...");
        conto.deposita(500.0);
        System.out.println("Saldo dopo deposito: " + conto.getSaldo());

        // Test del metodo deposita con importo negativo (non deve variare il saldo)[cite: 29]
        System.out.println("Tentativo di deposito negativo (-100.0 euro)...");
        conto.deposita(-100.0);
        System.out.println("Saldo invariato: " + conto.getSaldo());

        // Test del metodo preleva con importo valido
        System.out.println("Prelevo 200.0 euro...");
        conto.preleva(200.0);
        System.out.println("Saldo dopo prelievo: " + conto.getSaldo());

        // Test del metodo preleva con importo maggiore del saldo (non deve variare il saldo)[cite: 29]
        System.out.println("Tentativo di prelievo superiore al saldo (1000.0 euro)...");
        conto.preleva(1000.0);
        System.out.println("Saldo invariato: " + conto.getSaldo());

        // Test dei metodi get
        System.out.println("Nominativo del correntista: " + conto.getNominativo());
        System.out.println("Codice del conto: " + conto.getCodice());
        System.out.println("Stato finale del conto: " + conto.toString());
    }
}