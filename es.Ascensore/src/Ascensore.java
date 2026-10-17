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
    public boolean open() {
        return this.porteAperte = true;
    }

    // Metodo close[cite: 1]
    public boolean close() {
        return this.porteAperte = false;
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

    @Override
    public String toString() {
        String statoPorte;

        if (this.porteAperte) {
            statoPorte = "open";
        } else {
            statoPorte = "closed";
        }

        if (this.pianoCorrente == 0) {
            return "The elevator serves " + this.numeroPiani + " floors, it is currently at ground floor and the doors are " + statoPorte + ".";
        } else {
            return "The elevator serves " + this.numeroPiani + " floors, it is currently at " + this.pianoCorrente + " and the doors are " + statoPorte + ".";
        }
    }
}