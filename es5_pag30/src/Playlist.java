public class Playlist {
    private String nome;
    private int quantiBrani;
    private int branoCorrente;
    private String stato; // Può essere "PLAY", "PAUSE" o "STOP"
    private boolean stopChiamatoDueVolte; // Flag per gestire la doppia chiamata a stop

    // Costruttore con nome e numero di brani[cite: 29]
    public Playlist(String nome, int quantiBrani) {
        this.nome = nome;
        this.quantiBrani = quantiBrani;
        this.branoCorrente = 1;
        this.stato = "STOP";
        this.stopChiamatoDueVolte = false;
    }

    // Costruttore di copia[cite: 29]
    public Playlist(Playlist altra) {
        this.nome = altra.nome;
        this.quantiBrani = altra.quantiBrani;
        this.branoCorrente = altra.branoCorrente;
        this.stato = altra.stato;
        this.stopChiamatoDueVolte = altra.stopChiamatoDueVolte;
    }

    // Metodo getNome[cite: 29]
    public String getNome() {
        return this.nome;
    }

    // Metodo getQuantiBrani[cite: 29]
    public int getQuantiBrani() {
        return this.quantiBrani;
    }

    // Metodo play[cite: 29]
    public void play() {
        this.stato = "PLAY";
        this.stopChiamatoDueVolte = false;
    }

    // Metodo pause[cite: 29]
    public void pause() {
        if (!this.stato.equals("STOP")) {
            this.stato = "PAUSE";
        }
        this.stopChiamatoDueVolte = false;
    }

    // Metodo stop[cite: 29]
    public void stop() {
        if (this.stato.equals("STOP")) {
            this.stopChiamatoDueVolte = true;
            this.branoCorrente = 1;
        } else {
            this.stato = "STOP";
            this.stopChiamatoDueVolte = false;
        }
    }

    // Metodo branoSuccessivo[cite: 29]
    public void branoSuccessivo() {
        if (this.branoCorrente < this.quantiBrani) {
            this.branoCorrente++;
        } else {
            this.branoCorrente = 1;
        }
        this.stopChiamatoDueVolte = false;
    }

    // Metodo branoPrecedente[cite: 29]
    public void branoPrecedente() {
        if (this.branoCorrente > 1) {
            this.branoCorrente--;
        } else {
            this.branoCorrente = this.quantiBrani;
        }
        this.stopChiamatoDueVolte = false;
    }

    // Metodo toString[cite: 29]
    @Override
    public String toString() {
        return "Playlist " + this.nome + ", "
                + this.quantiBrani + " brani, in "
                + this.stato + " sul brano "
                + this.branoCorrente;
    }
}