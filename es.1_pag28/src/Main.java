public class Main {
    public static void main(String[] args) {

        LampadinaIntelligente lamp = new LampadinaIntelligente(60);
        lamp.setNome("Camera");

        System.out.println("Stato iniziale:");
        System.out.println(lamp);

        lamp.accendi();
        System.out.println("\nDopo accensione:");
        System.out.println(lamp);

        lamp.aumentaIlluminazione();
        lamp.aumentaIlluminazione();
        System.out.println("\nDopo due aumenti:");
        System.out.println(lamp);

        lamp.setColore("giallo");
        System.out.println("\nDopo cambio colore:");
        System.out.println(lamp);

        lamp.diminuisciIlluminazione();
        System.out.println("\nDopo diminuzione:");
        System.out.println(lamp);

        LampadinaIntelligente copia = new LampadinaIntelligente(lamp);
        copia.setNome("Copia");

        System.out.println("\nLampadina copiata:");
        System.out.println(copia);
    }
}
