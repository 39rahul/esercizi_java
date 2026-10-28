public class ContaVocali {

    // Versione iniziale: assume che la stringa contenga solo caratteri minuscoli
    public static int contaVocaliMinuscole(String s) {
        int contatore = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contatore++;
            }
        }
        return contatore;
    }

    // Versione generalizzata: gestisce anche le maiuscole
    public static int contaVocali(String s) {
        int contatore = 0;
        String sMinuscola = s.toLowerCase();

        for (int i = 0; i < sMinuscola.length(); i++) {
            char c = sMinuscola.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contatore++;
            }
        }
        return contatore;
    }
}