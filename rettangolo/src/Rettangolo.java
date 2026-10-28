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
        double xMin1, xMax1, yMin1, yMax1;
        if (this.a.getX() < this.b.getX()) {
            xMin1 = this.a.getX();
            xMax1 = this.b.getX();
        } else {
            xMin1 = this.b.getX();
            xMax1 = this.a.getX();
        }

        if (this.a.getY() < this.b.getY()) {
            yMin1 = this.a.getY();
            yMax1 = this.b.getY();
        } else {
            yMin1 = this.b.getY();
            yMax1 = this.a.getY();
        }

        double xMin2, xMax2, yMin2, yMax2;
        if (r.a.getX() < r.b.getX()) {
            xMin2 = r.a.getX();
            xMax2 = r.b.getX();
        } else {
            xMin2 = r.b.getX();
            xMax2 = r.a.getX();
        }

        if (r.a.getY() < r.b.getY()) {
            yMin2 = r.a.getY();
            yMax2 = r.b.getY();
        } else {
            yMin2 = r.b.getY();
            yMax2 = r.a.getY();
        }

        boolean xContenuta = (xMin2 >= xMin1) && (xMax2 <= xMax1);
        boolean yContenuta = (yMin2 >= yMin1) && (yMax2 <= yMax1);

        return xContenuta && yContenuta;
    }

    @Override
    public String toString() {
        return "Rettangolo [Vertice A: " + a + ", Vertice B: " + b + "]";
    }
}