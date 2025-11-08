/**
 * FactorResolver
 * Scompone un numero intero positivo n in fattori primi. n è letto da standard input.
 */
import java.util.Scanner;

public class FactorResolver {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("*** Programma che scompone un numero intero ***");
        System.out.println("*** positivo n in fattori primi             ***");
        System.out.println("***********************************************");
        System.out.println();

        System.out.print("n?: ");
        
        // Apertura del flusso di ingresso
        Scanner in = new Scanner(System.in);
        
        // Acquisizione del numero da standard input
        int n = in.nextInt();
        
        // Chiusura del flusso di ingresso
        in.close();

        // Preparazione della stringa di output
        String output = "";

        // Gestione del caso non ammesso n <= 0
        if (n <= 0)
        {
            output = n + ": ingresso non ammesso";
        }
        else if (n == 1)
        {
            // Gestione del caso particolare n = 1
            output = n + " = 1";
        }
        else
        {
            // Fattorizzazione del numero n
            String factorString = "1";  // Stringa per memorizzare i fattori
            int remainingValue = n;     // Variabile temporanea per non modificare n
            int factor = 2;             // Primo possibile fattore primo

            while (factor * factor <= remainingValue)
            {
                // Aggiunge il fattore alla stringa finché è divisore di remainingValue
                while (remainingValue % factor == 0)
                {
                    factorString += " * " + factor;
                    remainingValue /= factor;  // Aggiorna il valore rimanente
                }
                factor++;  // Passa al prossimo possibile fattore
            }

            // Se rimane un valore maggiore di 1, è un fattore primo residuo
            if (remainingValue > 1)
            {
                factorString += " * " + remainingValue;
            }

            // Costruisce l'output finale con il risultato della fattorizzazione
            output = n + " = " + factorString;
        }

        // Invio a standard output
        System.out.println(output);
    }
}