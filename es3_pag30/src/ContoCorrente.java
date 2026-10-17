public class ContoCorrente {
    private String nome;
    private String cognome;
    private String codice;
    private double saldo;

    // Costruttore con tre parametri
    public ContoCorrente(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.saldo = 0.0;
    }

    // Metodo preleva
    public double preleva(double quantita) {
        if (quantita >= 0 && this.saldo >= quantita) {
            this.saldo -= quantita;
        }
        return this.saldo;
    }

    // Metodo deposita
    public double deposita(double quantita) {
        if (quantita >= 0) {
            this.saldo += quantita;
        }
        return this.saldo;
    }

    // Metodo getSaldo
    public double getSaldo() {
        return this.saldo;
    }

    // Metodo getCodice
    public String getCodice() {
        return this.codice;
    }

    // Metodo getNominativo
    public String getNominativo() {
        return this.nome + " " + this.cognome;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Conto: " + this.codice + ", Correntista: " + getNominativo() + ", Saldo: " + this.saldo + " euro";
    }
}