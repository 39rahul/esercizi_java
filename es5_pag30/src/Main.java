public class Main{
    public static void main(){
        Playlist p = new Playlist("Baresi", 37);
        System.out.println("Prova metodi get");
        System.out.println(p.getNome());
        System.out.println(p.getnBrani());

        System.out.println("Metodi sullo stato");
        p.play();
        System.out.println(p);
        p.pause();
        System.out.println(p);
        p.stop();
        System.out.println(p);

        System.out.println("Metodi sui brani");
        p.branoSuccessivo();
        System.out.println(p);
        p.branoPrecedente();
        System.out.println(p);

        for (int i = 0; i < 50; i++) {
            p.branoSuccessivo();
        }
        System.out.println(p);
        p.stop();
        p.stop();
        System.out.println(p);

        for (int i = 0; i < 38; i++) {
            p.branoPrecedente();
        }
        System.out.println(p);
    }
}