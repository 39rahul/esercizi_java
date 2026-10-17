public class Main {
    public static void main(String[] args) {
        System.out.println("--- TEST DELLA CLASSE SEMAFORO ---");

        // 1. Test del costruttore vuoto (stato spento)[cite: 40, 41]
        Semaforo s = new Semaforo();
        System.out.println("Stato iniziale:");
        System.out.println(s.toString());

        // 2. Test del metodo avanza a semaforo spento (non deve modificare nulla)[cite: 41]
        s.avanza();
        System.out.println("Dopo avanza() da spento:");
        System.out.println(s.toString());

        // 3. Test del metodo accendi (va sul VERDE)[cite: 41]
        s.accendi();
        System.out.println("Dopo accendi():");
        System.out.println(s.toString());

        // 4. Test del ciclo di avanzamento delle luci (VERDE -> GIALLO -> ROSSO -> VERDE)[cite: 41]
        s.avanza();
        System.out.println("Dopo avanza() (dovrebbe essere GIALLO): " + s.toString());
        s.avanza();
        System.out.println("Dopo avanza() (dovrebbe essere ROSSO): " + s.toString());
        s.avanza();
        System.out.println("Dopo avanza() (dovrebbe tornare VERDE): " + s.toString());

        // 5. Test del metodo spegni[cite: 41]
        s.spegni();
        System.out.println("Dopo spegni():");
        System.out.println(s.toString());

        // 6. Test del metodo toggle[cite: 41]
        s.toggle();
        System.out.println("Dopo il primo toggle() (accensione): " + s.toString());
        s.toggle();
        System.out.println("Dopo il secondo toggle() (spegnimento): " + s.toString());
    }
}