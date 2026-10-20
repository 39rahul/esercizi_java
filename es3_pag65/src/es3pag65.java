public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int i = 0; i < v.length; i++) {
            if (v[i] < 10) {
                System.out.print(v[i] + "   ");
            } else {
                System.out.print(v[i] + "  ");
            }
        }
        System.out.println();
    }
}