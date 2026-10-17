public class Main {
    public static void main(String[] args) {
        System.out.println("--- TEST DELLA CLASSE DADO ---");

        // 1. Test del costruttore vuoto (dado a 6 facce)
        Dado d1 = new Dado();
        System.out.println("\nCreato d1 con costruttore vuoto: " + d1.toString());
        System.out.println("Lancio di d1: " + d1.lancia());

        // 2. Test del costruttore con parametro valido (es. 20 facce)
        Dado d2 = new Dado(20);
        System.out.println("\nCreato d2 con 20 facce: " + d2.toString());
        System.out.println("Lancio di d2: " + d2.lancia());

        // 3. Test del costruttore con parametro non valido (es. 3 facce -> deve impostarsi a 6)
        Dado d3 = new Dado(3);
        System.out.println("\nCreato d3 con 3 facce (parametro non valido): " + d3.toString());

        // 4. Test del costruttore di copia
        Dado d4 = new Dado(d2);
        System.out.println("\nCreato d4 copiando d2: " + d4.toString());
        System.out.println("Lancio di d4: " + d4.lancia());
    }
}