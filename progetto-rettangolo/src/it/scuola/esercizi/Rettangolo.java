package it.scuola.esercizi;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double x1, double y1, double x2, double y2) {
        if (x1 > x2) {
            this.base = x1 - x2;
        } else {
            this.base = x2 - x1;
        }

        if (y1 > y2) {
            this.altezza = y1 - y2;
        } else {
            this.altezza = y2 - y1;
        }
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