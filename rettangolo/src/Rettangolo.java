public class Rettangolo {
    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b) {
        this.a = new Punto(a);
        this.b = new Punto(b);
    }

    public Punto getA() {
        return new Punto(a);
    }

    public Punto getB() {
        return new Punto(b);
    }

    public double getLarghezza() {
        return Math.abs(b.getX() - a.getX());
    }

    public double getAltezza() {
        return Math.abs(b.getY() - a.getY());
    }

    public double calcolaPerimetro() {
        return 2 * (getLarghezza() + getAltezza());
    }

    public double calcolaArea() {
        return getLarghezza() * getAltezza();
    }

    public void effettuatrasla(double dx, double dy) {
        a.trasla(dx, dy);
        b.trasla(dx, dy);
    }

    public boolean contenuto(Rettangolo r) {
        double minX1 = Math.min(this.a.getX(), this.b.getX());
        double maxX1 = Math.max(this.a.getX(), this.b.getX());
        double minY1 = Math.min(this.a.getY(), this.b.getY());
        double maxY1 = Math.max(this.a.getY(), this.b.getY());

        double minX2 = Math.min(r.a.getX(), r.b.getX());
        double maxX2 = Math.max(r.a.getX(), r.b.getX());
        double minY2 = Math.min(r.a.getY(), r.b.getY());
        double maxY2 = Math.max(r.a.getY(), r.b.getY());

        return (minX2 >= minX1 && maxX2 <= maxX1 && minY2 >= minY1 && maxY2 <= maxY1);
    }

    @Override
    public String toString() {
        return "Rettangolo [Vertice A: " + a + ", Vertice B: " + b + "]";
    }
}