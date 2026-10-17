public class Main {
    public static void main(String[] args) {
        System.out.println("--- TEST DELLA CLASSE LAMPADINA INTELLIGENTE ---");

        // 1. Test del costruttore con parametro potenza
        LampadinaIntelligente l1 = new LampadinaIntelligente(40);
        System.out.println("\nStato iniziale (dopo costruttore):");
        System.out.println(l1.toString());

        // 2. Test dei metodi set per nome e colore
        l1.setNome("camera");
        l1.setColore("giallo");
        System.out.println("\nDopo aver impostato nome e colore:");
        System.out.println(l1.toString());

        // 3. Test accensione e aumento illuminazione
        l1.accendi();
        l1.aumentaIlluminazione();
        System.out.println("\nDopo l'accensione e un aumento di illuminazione (+10%):");
        System.out.println(l1.toString());

        // 4. Test diminuzione illuminazione (anche da spenta come da richiesta)
        l1.spegni();
        l1.diminuisciIlluminazione();
        l1.diminuisciIlluminazione();
        System.out.println("\nDopo aver spento la lampadina e diminuito due volte l'illuminazione (-20%):");
        System.out.println(l1.toString());

        // 5. Test del costruttore di copia
        LampadinaIntelligente l2 = new LampadinaIntelligente(l1);
        l2.setNome("cucina");
        l2.setColore("blu");
        System.out.println("\nTest costruttore di copia (nuova lampadina l2):");
        System.out.println(l2.toString());
    }
}