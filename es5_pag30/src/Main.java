public class Main {
  public static void main(String[] args) {
    System.out.println("--- TEST DELLA CLASSE PLAYLIST ---");

    // 1. Test del costruttore e dello stato iniziale (STOP sul brano 1)
    Playlist p1 = new Playlist("SuperTramp", 17);
    System.out.println("Creazione playlist:");
    System.out.println(p1.toString());

    // 2. Test del metodo play
    p1.play();
    System.out.println("Dopo play():");
    System.out.println(p1.toString());

    // 3. Test dello spostamento ai brani successivi
    p1.branoSuccessivo();
    p1.branoSuccessivo();
    System.out.println("Dopo due branoSuccessivo():");
    System.out.println(p1.toString());

    // 4. Test del metodo pause
    p1.pause();
    System.out.println("Dopo pause():");
    System.out.println(p1.toString());

    // 5. Test del metodo branoPrecedente
    p1.branoPrecedente();
    System.out.println("Dopo branoPrecedente():");
    System.out.println(p1.toString());

    // 6. Test del metodo stop (porta in STOP mantenendo il brano)
    p1.stop();
    System.out.println("Dopo la prima chiamata a stop():");
    System.out.println(p1.toString());

    // 7. Test della seconda chiamata consecutiva a stop (riporta il brano a 1)
    p1.stop();
    System.out.println("Dopo la seconda chiamata consecutiva a stop():");
    System.out.println(p1.toString());

    // 8. Test del costruttore di copia
    Playlist p2 = new Playlist(p1);
    System.out.println("Test costruttore di copia (nuova playlist p2):");
    System.out.println(p2.toString());
  }
}