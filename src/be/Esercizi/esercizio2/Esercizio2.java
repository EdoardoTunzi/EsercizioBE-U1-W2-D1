package be.Esercizi.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcolatore km per litro");
        System.out.println("Inserisci km percorsi");
        int km = scanner.nextInt();
        System.out.println("Inserisci litri di carburante consumati");
        int litri = scanner.nextInt();

        try {
            if(litri != 0) {
                calcolaKmLt(km, litri);
            } else {
                throw new IllegalArgumentException("Il valore dei litri deve essere superiore a 0");
            }
        } catch (Exception e) {
            logger.error("Errore durante il calcolo: {} ", e.getMessage());
        }
    }

    public static void calcolaKmLt (int kmPercorsi, int litricarburante) {
        int kmLt = kmPercorsi / litricarburante;
        System.out.println("I km/lt sono: " + kmLt);
    }
}
