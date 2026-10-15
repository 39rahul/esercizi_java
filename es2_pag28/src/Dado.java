public class Dado {
    private int facce;

    // Costruttore vuoto: istanzia un dado a 6 facce
    public Dado() {
        this.facce = 6;
    }

    // Costruttore con un parametro intero N (gestisce i vincoli richiesti)
    public Dado(int n) {
        if (n < 2 || n == 3) {
            this.facce = 6;
        } else {
            this.facce = n;
        }
    }

    // Costruttore di copia
    public Dado(Dado altro) {
        this.facce = altro.facce;
    }

    // Metodo get per le facce (opzionale ma utile)
    public int getFacce() {
        return this.facce;
    }

    // Metodo lancia: restituisce un numero intero casuale tra 1 e il numero di facce
    public int lancia() {
        return (int) (Math.random() * this.facce) + 1;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Dado a " + this.facce + " facce";
    }
}