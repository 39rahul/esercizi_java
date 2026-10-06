public class Frazione {

    private int numeratore;
    private int denominatore;

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public int getNumeratore() {
        return numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    // MCD
    private int mcd(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    // Semplificazione
    public void semplificaFrazione() {
        int mcd = mcd(numeratore, denominatore);

        numeratore = numeratore / mcd;
        denominatore = denominatore / mcd;
    }

    // Reciproca
    public Frazione reciprocaFrazione() {
        return new Frazione(denominatore, numeratore);
    }

    // Opposta
    public Frazione oppostaFrazione() {
        return new Frazione(-numeratore, denominatore);
    }

    // Somma
    public Frazione sommaFrazione(Frazione f) {

        int nuovoNum = numeratore * f.denominatore +
                denominatore * f.numeratore;

        int nuovoDen = denominatore * f.denominatore;

        return new Frazione(nuovoNum, nuovoDen);
    }

    // Sottrazione
    public Frazione sottraiFrazione(Frazione f) {

        int nuovoNum = numeratore * f.denominatore -
                denominatore * f.numeratore;

        int nuovoDen = denominatore * f.denominatore;

        return new Frazione(nuovoNum, nuovoDen);
    }

    // Moltiplicazione
    public Frazione moltiplicaFrazione(Frazione f) {

        int nuovoNum = numeratore * f.numeratore;
        int nuovoDen = denominatore * f.denominatore;

        return new Frazione(nuovoNum, nuovoDen);
    }

    // Divisione
    public Frazione dividiFrazione(Frazione f) {

        int nuovoNum = numeratore * f.denominatore;
        int nuovoDen = denominatore * f.numeratore;

        return new Frazione(nuovoNum, nuovoDen);
    }

    // Potenza
    public Frazione potenzaFrazione(int potenza) {

        int nuovoNum = 1;
        int nuovoDen = 1;

        for (int i = 0; i < potenza; i++) {
            nuovoNum *= numeratore;
            nuovoDen *= denominatore;
        }

        return new Frazione(nuovoNum, nuovoDen);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
}