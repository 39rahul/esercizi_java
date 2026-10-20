public class TazzaPerDadi {
    private Dado[] dadi;
    private int quantiDadi;

    public TazzaPerDadi(int capienzaMassima) {
        if (capienzaMassima <= 0) {
            capienzaMassima = 1;
        }
        dadi = new Dado[capienzaMassima];
        quantiDadi = 0;
    }

    public TazzaPerDadi(int n, int f) {
        if (n <= 0) {
            n = 1;
        }
        dadi = new Dado[n];
        quantiDadi = 0;
        for (int i = 0; i < n; i++) {
            dadi[i] = new Dado(f);
            quantiDadi++;
        }
    }

    public boolean add(Dado d) {
        if (quantiDadi >= dadi.length) {
            return false;
        }
        dadi[quantiDadi] = d;
        quantiDadi++;
        return true;
    }

    public int quanti() {
        return quantiDadi;
    }

    public int size() {
        return dadi.length;
    }

    public boolean isEmpty() {
        return quantiDadi == 0;
    }

    public int getMassimo() {
        int max = 0;
        for (int i = 0; i < quantiDadi; i++) {
            max += dadi[i].getFacce();
        }
        return max;
    }

    public int getMinimo() {
        return quantiDadi;
    }

    public int lancia() {
        int somma = 0;
        for (int i = 0; i < quantiDadi; i++) {
            somma += dadi[i].lancia();
        }
        return somma;
    }

    @Override
    public String toString() {
        boolean tuttiUguali = true;
        if (quantiDadi > 0) {
            int primeFacce = dadi[0].getFacce();
            for (int i = 1; i < quantiDadi; i++) {
                if (dadi[i].getFacce() != primeFacce) {
                    tuttiUguali = false;
                    break;
                }
            }
            if (tuttiUguali && quantiDadi == dadi.length) {
                return "Questa tazza contiene esattamente " + quantiDadi + " dadi, tutti con " + primeFacce + " facce";
            }
        }

        String risultato = "Questa tazza può contenere al massimo " + dadi.length + " dadi.\n" +
                "Dadi attualmente contenuti: " + quantiDadi + "\n" +
                "Lista dei dadi:";

        for (int i = 0; i < quantiDadi; i++) {
            risultato = risultato + "\n- dado da " + dadi[i].getFacce();
        }

        return risultato;
    }
}