public class Studente {
    String nome;
    String cognome;
    int eta;
    double altezza;
    double peso;

    public Studente(String nome, String cognome, int eta, double altezza, double peso){
        this.nome = nome;
        this.cognome=cognome;
        this.eta=eta;
        this.altezza=altezza;
        this.peso = peso;
        if(this.eta <= 0){
            this.eta = 5;
        }
        if(this.altezza <= 0){
            this.altezza = 1.10;
        }
        if(this.peso <= 0){
            peso = 30;
        }
    }

    public Studente(){
        this.nome = "";
        this.cognome = "";
        this.eta = 0;
        this.altezza = 0.0;
        this.peso = 0.0;
    }

}
