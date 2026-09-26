public class Main {
    static double calcolaIndice(Studente a){
        double BMI = 0;
        BMI = a.peso / (a.altezza * a.altezza);
        return BMI;
    }
    public static void main(String[] args) {
        Studente s;
        double BMI = 0;
        s = new Studente("Rahul", "Shibba", 17, 1.80, 75.);
        System.out.printf("Lo studente " + s.cognome +" " + s.nome + " di "
                + s.eta + " anni e alto " + s.altezza +
                " m che pesa " + s.peso + " kg ");
        BMI = calcolaIndice(s);
        if(BMI < 18.5){
            System.out.println(" è sottopeso e il suo indice corporeo è " + BMI);
        }else if(BMI > 18.5 && BMI <=24.9){
            System.out.println(" è normopeso e il suo indice corporeo è " + BMI);
        }else if(BMI > 24.9 && BMI <= 29.9){
            System.out.println(" è sovrappeso e il suo indice corporeo è "  + BMI);
        }else{
            System.out.println(" è obeso e il suo indice corporeo è " + BMI);
        }
    }
}