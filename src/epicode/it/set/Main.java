package epicode.it.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante frasi vuoi inserire");
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<String> paroleSingole = new TreeSet<>();
        Set<String> paroleConDuplicati = new TreeSet<>();

        for (int i = 0; i < m; i++) {
            System.out.println("Inserisci una frase");
            String frase = scanner.nextLine();
            String[] parole = frase.split(" ");

            Set<String> paroleNellaFrase = new HashSet<>();


            for(String parola: parole) {
                if(paroleNellaFrase.add(parola)) {
                    paroleSingole.add(parola);
                } else {
                    paroleConDuplicati.add(parola);
                }
            }
        }

        // ciclo il set delle parole duplicate
        System.out.println("Parole duplicate");
        for(String parola: paroleConDuplicati) {
            System.out.println( parola);
        }

        System.out.println("numero di parole singole nella frase: " + paroleSingole.size());
        for (String parola: paroleSingole) {
            System.out.println(parola);
        }



    }
}
