public class Risposta {
    private String testo;
    private boolean corretta;

    public Risposta(String testo, boolean corretta) {
        this.testo = testo;
        this.corretta = corretta;
    }

    public String getTesto() {
        return this.testo;
    }

    public boolean isCorretta() {
        return this.corretta;
    }

    @Override
    public String toString() {
        return this.testo;
    }
}