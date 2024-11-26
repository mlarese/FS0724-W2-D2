package epicode.it.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // genero la lista di numeri casuali punto 1 esercizio 2
    public static List<Integer> generaListaCasuale(int k) {
        // uso una LinkedList perchè la traccia richiede una lista ordinata
        List<Integer> lista = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            // aggiungo numeri random alla lista
            lista.add( random.nextInt(50)  );
        }
        return lista;
    }

    // rimuove da una lista i numeri multipli del parametro n punto 3 esercizio 2
    private static void rimuoviMultipli(List<Integer> lista, int n) {
       // Un oggetto di tipo List ha un metodo removeIf//
       // tale metod accetta come parametro una funzione scritta come in angular parametro -> codice da eseguire (n == 0)
        // nota bene angular usa => mentre Java usa ->
        // se il controllo 'booleano' restituisce true l'elemento viene rimosso dalla lista
       lista.removeIf(numero -> numero % n == 0);
    }

    // questa funzione  altera il contenuto di lista1 perchè la modifca in base agli elementi presentoi o no
    // cancellando quelli non inseriti in entrambe le liste
    public static List<Integer> intersezioneLista(List<Integer> lista1, List<Integer> lista2) {
        // Un oggetto List ha a disposizione un metodo retainAll a cui passare una seconda List.
        // Il metodo elimina dalla prima lista gli elementi che non son nella seconda (Intersezione)
        // nota bene che il parametro lista1 viene modificato
        lista1.retainAll(lista2);

        return  lista1;
    }

    // questa funzione non altera il contenuto di lista1 perchè
    // List<Integer> intersezione = new LinkedList<>(lista1); ne crea un clone punto 2 esercizio 2
    public static List<Integer> intersezioneConservativaLista(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> intersezione = new LinkedList<>(lista1);
        intersezione.retainAll(lista2);
        return  intersezione;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la dimensione della lista");
        int k = scanner.nextInt();



        List<Integer> lista1 = generaListaCasuale(k);
        List<Integer> lista2 = generaListaCasuale(k);
        // uso la funzione intersezioneConservativaLista
        List<Integer> daIntersezioneConservativaLista = intersezioneConservativaLista(lista1,lista2);
        System.out.println("lista 1");
        for(Integer i: lista1) {
            System.out.println(i);
        }

        System.out.println("lista 2");
        for(Integer i: lista2) {
            System.out.println(i);
        }

        int n = 20;
        // uso la seconda funzione rimuoviMultipli
        rimuoviMultipli(lista1, n);

        System.out.println("Intersezione liste");

        // stampo la lista intersecata
        for(Integer num: daIntersezioneConservativaLista) {
            System.out.println( num);
        }

        System.out.println("rimuovo multipli da lista 1");
        // stampo la lista senza i multipli
        for(Integer num: lista1) {
            System.out.println(num);
        }





    }
}
