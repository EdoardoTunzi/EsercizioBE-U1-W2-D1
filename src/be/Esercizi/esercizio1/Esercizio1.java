package be.Esercizi.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class Esercizio1 {
private static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[5];
        System.out.println("Esercizio avviato. Creo array di partenza");
        for (int i= 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 11);
            System.out.println("Posizione "+ (i) + " : " + intArray[i]);
        }

        System.out.println("Vuoi sostituire un elemento dell'array?");
        System.out.println("1-Si, 0-No");
        int selezione = scanner.nextInt();

        while (selezione !=0) {
            System.out.println("Inserisci il numero da inserire nell'array:");
            int numero1 = scanner.nextInt();
            System.out.println("Inserisci posizione:");
            int posizione = scanner.nextInt();
            addNumToArray(intArray, numero1, posizione);
            System.out.println("Vuoi sostituire un altro elemento dell'array?");
            System.out.println("1-Si, 0-No");
            selezione = scanner.nextInt();
        };
        System.out.println("--- Esercizio terminato ---");
    }

    public static void addNumToArray(int[] intArray, int numero, int posizione){

        try {
            intArray[posizione] = numero;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Errore, Posizione array inserita non valida{} ", e.getMessage());
        }



        System.out.println("Array aggiornato con i seguenti numeri");
        for (int i= 0; i < intArray.length; i++) {
            System.out.println("Posizione "+ (i) + " : " + intArray[i]);
        }

    }
}
