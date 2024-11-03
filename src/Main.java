import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //Creo un hashset vuoto
        HashSet<String> vuoto = new HashSet<>();

        // Inizializza l'oggetto InserisciOggetto con l'HashSet vuoto
        InserisciOggetto inserisciOggetto = new InserisciOggetto(vuoto);

        // Esegue il controllo e l'eventuale aggiunta di stringhe nell'HashSet
        inserisciOggetto.controlloOggetto("Benvenuto");
        inserisciOggetto.controlloOggetto("Benvenuta");
        inserisciOggetto.controlloOggetto("Benvenuto");

       System.out.println("Elementi dell'HashSet:");
       //utilizziamo un for per iterare tutti gli elementi e stamparli
       for (String elemento : inserisciOggetto.getOggetto()) {
           System.out.println(elemento); }

        // Stampa la grandezza
        System.out.println("La grandezza dell'hashset è : " + vuoto.size());
    }
}


//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi