public class Vettore {
    private Punto origine;
    private Punto vertice;

    public Vettore(Punto origine, Punto vertice) {
        this.origine = new Punto(origine);
        this.vertice = new Punto(vertice);
    }

    public Vettore(Vettore altro) {
        this.origine = new Punto(altro.origine);
        this.vertice = new Punto(altro.vertice);
    }

    public Punto getOrigine() {
        return new Punto(this.origine);
    }

    public void setOrigine(Punto origine) {
        this.origine = new Punto(origine);
    }

    public Punto getVertice() {
        return new Punto(this.vertice);
    }

    public void setVertice(Punto vertice) {
        this.vertice = new Punto(vertice);
    }

    public double calcolaLunghezza() {
        double dx = this.vertice.getX() - this.origine.getX();
        double dy = this.vertice.getY() - this.origine.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public void spostaOrigine(Punto p) {
        this.origine = new Punto(p);
    }

    public boolean verificaOrigine(Punto p) {
        return this.origine.getX() == p.getX() && this.origine.getY() == p.getY();
    }

    @Override
    public String toString() {
        return "Origine: " + this.origine.toString() + ", Vertice: " + this.vertice.toString();
    }
}