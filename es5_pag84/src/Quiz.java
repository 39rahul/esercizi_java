public class Quiz {
    private String titolo;
    private Domanda[] domande;
    private int quanteDomande;

    public Quiz(String titolo) {
        this.titolo = titolo;
        this.domande = new Domanda[100];
        this.quanteDomande = 0;
    }

    public Quiz(Quiz q) {
        this.titolo = q.titolo;
        this.domande = new Domanda[100];
        this.quanteDomande = q.quanteDomande;
        for (int i = 0; i < q.quanteDomande; i++) {
            this.domande[i] = new Domanda(q.domande[i]);
        }
    }

    public boolean add(Domanda d) {
        if (this.quanteDomande < 100) {
            this.domande[this.quanteDomande] = d;
            this.quanteDomande++;
            return true;
        }
        return false;
    }

    public int getQuanteDomande() {
        return this.quanteDomande;
    }

    public int getQuanteRisposte() {
        int conteggio = 0;
        for (int i = 0; i < this.quanteDomande; i++) {
            if (this.domande[i].completata()) {
                conteggio++;
            }
        }
        return conteggio;
    }

    public int[] getDomandeNonDate() {
        int nonRisposteCount = this.quanteDomande - getQuanteRisposte();
        int[] indici = new int[nonRisposteCount];
        int j = 0;
        for (int i = 0; i < this.quanteDomande; i++) {
            if (!this.domande[i].completata()) {
                indici[j] = i + 1;
                j++;
            }
        }
        return indici;
    }

    public Domanda getDomanda(int indice) {
        if (indice >= 1 && indice <= this.quanteDomande) {
            return this.domande[indice - 1];
        }
        return null;
    }

    public int getTotale() {
        int totale = 0;
        for (int i = 0; i < this.quanteDomande; i++) {
            totale += this.domande[i].getValore();
        }
        return totale;
    }

    public int getPunteggio() {
        int punteggioOttenuto = 0;
        for (int i = 0; i < this.quanteDomande; i++) {
            int p = this.domande[i].getPunteggio();
            if (p > 0) {
                punteggioOttenuto += p;
            }
        }
        return punteggioOttenuto;
    }

    @Override
    public String toString() {
        return "Quiz: " + this.titolo +
                " Numero domande: " + this.quanteDomande +
                " Punteggio totale: " + getTotale();
    }
}