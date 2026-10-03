public class Rettangolo {

    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public double base() {
        if (b.getX() > a.getX()) {
            return b.getX() - a.getX();
        } else {
            return a.getX() - b.getX();
        }
    }

    public double altezza() {
        if (b.getY() > a.getY()) {
            return b.getY() - a.getY();
        } else {
            return a.getY() - b.getY();
        }
    }

    public double perimetro() {
        return 2 * (base() + altezza());
    }

    public double area() {
        return base() * altezza();
    }

    @Override
    public String toString() {
        return "Rettangolo con vertici A(" + a.getX() + "," + a.getY() +
                ") e B(" + b.getX() + "," + b.getY() + ")";
    }
}
