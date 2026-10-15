public class LampadinaIntelligente {
    private float potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private boolean accesa;

    // Costruttore con un parametro (potenza)
    public LampadinaIntelligente(float potenza) {
        this.potenza = potenza;
        this.illuminazione = 50;
        this.colore = "bianco";
        this.nome = "";
        this.accesa = false;
    }

    // Costruttore di copia
    public LampadinaIntelligente(LampadinaIntelligente altra) {
        this.potenza = altra.potenza;
        this.illuminazione = altra.illuminazione;
        this.colore = altra.colore;
        this.nome = altra.nome;
        this.accesa = altra.accesa;
    }

    // Metodi get e set per il nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodi get e set per il colore
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    // Metodo accendi
    public void accendi() {
        this.accesa = true;
    }

    // Metodo spegni
    public void spegni() {
        this.accesa = false;
    }

    // Metodo aumentaIlluminazione (+10%)
    public void aumentaIlluminazione() {
        if (this.illuminazione <= 90) {
            this.illuminazione += 10;
        } else {
            this.illuminazione = 100;
        }
    }

    // Metodo diminuisciIlluminazione (-10%)
    public void diminuisciIlluminazione() {
        if (this.illuminazione >= 10) {
            this.illuminazione -= 10;
        } else {
            this.illuminazione = 0;
        }
    }

    // Metodo toString
    @Override
    public String toString() {
        String stato;
        if (this.accesa) {
            stato = "accesa";
        } else {
            stato = "spenta";
        }

        return "Nome: " + this.nome +
                ", Potenza: " + (int)this.potenza + " watt" +
                ", Stato: " + stato +
                ", Qta: " + this.illuminazione + "%" +
                ", Colore: " + this.colore;
    }
}