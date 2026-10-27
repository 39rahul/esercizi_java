package it.scuola.esercizi;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double x1, double y1, double x2, double y2) {
        this.base = Math.abs(x1 - x2);
        this.altezza = Math.abs(y1 - y2);
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getArea() {
        return base * altezza;
    }

    public double getPerimetro() {
        return 2 * (base + altezza);
    }
}