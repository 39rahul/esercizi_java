public class Ascensore {
    private int numeroPiani;
    private int pianoCorrente;
    private boolean porteAperte; // true se aperte, false se chiuse

    // Costruttore con un parametro intero (numero di piani serviti)[cite: 1]
    public Ascensore(int piani) {
        if (piani < 2) {
            this.numeroPiani = 2;
        } else {
            this.numeroPiani = piani;
        }
        this.pianoCorrente = 0;
        this.porteAperte = false; // Le porte devono essere chiuse alla creazione[cite: 1]
    }

    // Metodo getFloor[cite: 1]
    public int getFloor() {
        return this.pianoCorrente;
    }

    // Metodo getFloors[cite: 1]
    public int getFloors() {
        return this.numeroPiani;
    }

    // Metodo open[cite: 1]
    public void open() {
        this.porteAperte = true;
    }

    // Metodo close[cite: 1]
    public void close() {
        this.porteAperte = false;
    }

    // Metodo goUp[cite: 1]
    public boolean goUp() {
        // L'ultimo piano valido è numeroPiani - 1 (partendo da 0)
        if (!this.porteAperte && this.pianoCorrente < this.numeroPiani - 1) {
            this.pianoCorrente++;
            return true;
        }
        return false;
    }

    // Metodo goDown[cite: 1]
    public boolean goDown() {
        if (!this.porteAperte && this.pianoCorrente > 0) {
            this.pianoCorrente--;
            return true;
        }
        return false;
    }

    // Metodo goToFloor[cite: 1]
    public boolean goToFloor(int pianoDestinazione) {
        // Verifica se le porte sono chiuse e se il piano è compreso tra 0 e numeroPiani - 1
        if (!this.porteAperte && pianoDestinazione >= 0 && pianoDestinazione < this.numeroPiani) {
            this.pianoCorrente = pianoDestinazione;
            return true;
        }
        return false;
    }

    // Metodo toString[cite: 1]
    @Override
    public String toString() {
        String statoPorte = this.porteAperte ? "open" : "closed";
        String descrizionePiano;
        if (this.pianoCorrente == 0) {
            descrizionePiano = "ground floor";
        } else {
            descrizionePiano = String.valueOf(this.pianoCorrente);
        }
        return "The elevator serves " + this.numeroPiani + " floors, it is currently at " + descrizionePiano + " and the doors are " + statoPorte + ".";
    }
}