public class Angolo {

    private int gradi;
    private int minuti;
    private int secondi;

    public Angolo(int gradi, int minuti, int secondi) {
        this.gradi = gradi;
        this.minuti = minuti;
        this.secondi = secondi;

        semplifica();
    }

    // Semplificazione dell'angolo
    private void semplifica() {

        minuti = minuti + secondi / 60;
        secondi = secondi % 60;

        gradi = gradi + minuti / 60;
        minuti = minuti % 60;

        gradi = gradi % 360;
    }

    // Somma
    public Angolo sommaAngolo(Angolo a) {

        int nuoviSecondi = secondi + a.secondi;
        int nuoviMinuti = minuti + a.minuti;
        int nuoviGradi = gradi + a.gradi;

        return new Angolo(nuoviGradi, nuoviMinuti, nuoviSecondi);
    }

    // Differenza
    public Angolo sottraiAngolo(Angolo a) {

        int tot1 = gradi * 3600 + minuti * 60 + secondi;
        int tot2 = a.gradi * 3600 + a.minuti * 60 + a.secondi;

        int differenza = tot1 - tot2;

        while (differenza < 0) {
            differenza += 360 * 3600;
        }

        int g = differenza / 3600;
        differenza = differenza % 3600;

        int m = differenza / 60;
        int s = differenza % 60;

        return new Angolo(g, m, s);
    }

    @Override
    public String toString() {
        return gradi + "° " + minuti + "' " + secondi + "\"";
    }
}