public class Dado {
    private int facce;

    public Dado() {
        this.facce = 6;
    }

    public Dado(int n) {
        if (n < 2 || n == 3) {
            this.facce = 6;
        } else {
            this.facce = n;
        }
    }

    public Dado(Dado d) {
        this.facce = d.facce;
    }

    public int lancia() {
        return (int) (Math.random() * this.facce) + 1;
    }

    public int getFacce() {
        return this.facce;
    }

    @Override
    public String toString() {
        return "Dado da " + this.facce + " facce";
    }
}