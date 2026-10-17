public class Semaforo {
    private boolean acceso;
    private String colore; // Può essere "VERDE", "GIALLO" o "ROSSO"

    // Costruttore vuoto: imposta il semaforo nello stato di spento[cite: 40, 41]
    public Semaforo() {
        this.acceso = false;
    }

    // Metodo accendi: accende il semaforo mettendo la luce sul VERDE[cite: 41]
    public void accendi() {
        this.acceso = true;
        this.colore = "VERDE";
    }

    // Metodo spegni: spegne il semaforo[cite: 41]
    public void spegni() {
        this.acceso = false;
    }

    // Metodo toggle: accende se spento, spegne se acceso[cite: 41]
    public void toggle() {
        if (this.acceso) {
            spegni();
        } else {
            accendi();
        }
    }

    // Metodo avanza: sposta le luci verso la successiva (VERDE -> GIALLO -> ROSSA -> VERDE)[cite: 41]
    public void avanza() {
        if (this.acceso) {
            if (this.colore.equals("VERDE")) {
                this.colore = "GIALLO";
            } else if (this.colore.equals("GIALLO")) {
                this.colore = "ROSSO";
            } else if (this.colore.equals("ROSSO")) {
                this.colore = "VERDE";
            }
        }
    }

    // Metodo isAcceso: ritorna un boolean sullo stato del semaforo[cite: 41]
    public boolean isAcceso() {
        return this.acceso;
    }

    // Metodo getColore: ritorna il colore corrente o stringa vuota se spento[cite: 41]
    public String getColore() {
        if (this.acceso) {
            return this.colore;
        } else {
            return "";
        }
    }

    // Metodo toString[cite: 41]
    @Override
    public String toString() {
        if (this.acceso) {
            return "Il semaforo è acceso sul " + this.colore;
        } else {
            return "Il semaforo è spento";
        }
    }
}