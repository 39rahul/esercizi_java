public class Punto {
    private double x;
    private double y;

    // Costruttore vuoto: imposta le coordinate a (0, 0)
    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Costruttore con due parametri double (x e y)
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Costruttore di copia
    public Punto(Punto altro) {
        this.x = altro.x;
        this.y = altro.y;
    }

    // Metodi get per le coordinate
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Metodo distanza da un altro punto
    public double distanza(Punto altro) {
        return Math.sqrt(Math.pow(altro.x - this.x, 2) + Math.pow(altro.y - this.y, 2));
    }

    // Metodo puntoMedio con un altro punto
    public Punto puntoMedio(Punto altro) {
        double mx = (this.x + altro.x) / 2.0;
        double my = (this.y + altro.y) / 2.0;
        return new Punto(mx, my);
    }

    // Metodo ruota di un angolo alpha (in gradi) rispetto all'origine degli assi
    public void ruota(double alphaGradi) {
        double radianti = Math.toRadians(alphaGradi);
        double nuovoX = this.x * Math.cos(radianti) - this.y * Math.sin(radianti);
        double nuovoY = this.x * Math.sin(radianti) + this.y * Math.cos(radianti);
        this.x = nuovoX;
        this.y = nuovoY;
    }

    // Metodo toString nella forma (x, y)
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}