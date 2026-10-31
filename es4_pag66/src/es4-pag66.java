import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci una stringa:");
        String s = in.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i < s.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}