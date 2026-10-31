public class Domanda {
    private String testo;
    private int valore;
    private Risposta[] risposte;
    private int rispostaData;

    public Domanda(String testo, Risposta[] risposte) {
        this.testo = testo;
        this.valore = 1;
        this.risposte = risposte;
        this.rispostaData = 0;
    }

    public Domanda(Domanda d) {
        this.testo = d.testo;
        this.valore = d.valore;
        this.rispostaData = 0;
        this.risposte = new Risposta[d.risposte.length];
        for (int i = 0; i < d.risposte.length; i++) {
            this.risposte[i] = new Risposta(d.risposte[i].getTesto(), d.risposte[i].isCorretta());
        }
    }

    public boolean rispondi(int scelta) {
        if (scelta >= 1 && scelta <= 4) {
            this.rispostaData = scelta;
            return this.risposte[scelta - 1].isCorretta();
        }
        return false;
    }

    public void setValore(int valore) {
        if (valore >= 0) {
            this.valore = valore;
        }
    }

    public int getValore() {
        return this.valore;
    }

    public int getPunteggio() {
        if (!completata()) {
            return -1;
        }
        if (this.risposte[this.rispostaData - 1].isCorretta()) {
            return this.valore;
        } else {
            return 0;
        }
    }

    public boolean completata() {
        return this.rispostaData != 0;
    }

    public String getRispostaCorretta() {
        for (int i = 0; i < this.risposte.length; i++) {
            if (this.risposte[i].isCorretta()) {
                return this.risposte[i].getTesto();
            }
        }
        return null;
    }

    public String getRispostaData() {
        if (!completata()) {
            return null;
        }
        return this.risposte[this.rispostaData - 1].getTesto();
    }

    @Override
    public String toString() {
        String s = this.testo + " ";
        for (int i = 0; i < this.risposte.length; i++) {
            s = s + (i + 1) + ") " + this.risposte[i].getTesto() + " ";
        }
        return s;
    }
}