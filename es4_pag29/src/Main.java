public class Main {
    public static void main(String[] args) {

        GeneratoreAutoIncrementale gen = new GeneratoreAutoIncrementale("ABC", 4);

        System.out.println("Primi codici generati:");
        System.out.println(gen.genera());
        System.out.println(gen.genera());
        System.out.println(gen.genera());

        System.out.println("\nStato attuale del generatore:");
        System.out.println(gen);

        System.out.println("\nAltri codici:");
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.genera());
        }

        System.out.println("\nStato finale:");
        System.out.println(gen);
    }
}
