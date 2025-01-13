import be.Esercizi.esercizio3.BancaException;
import be.Esercizi.esercizio3.ContoCorrente;
import be.Esercizi.esercizio3.ContoOnLine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto1 = new ContoCorrente("Edoardo", 300);
        ContoOnLine contoOnline = new ContoOnLine("Marco", 350, 100);
        System.out.println("Da che conto vuoi prelevare?");
        System.out.println("1- Conto corrente, 2- Conto OnLine");
        int selezione = scanner.nextInt();



        try {
            conto1.preleva(50);
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }

        try {
            contoOnline.preleva(50);
            contoOnline.restituisciSaldo();
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }

    }
}