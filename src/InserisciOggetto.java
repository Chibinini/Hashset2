import java.util.HashSet;

public class InserisciOggetto {

    //HashSet per memorizzare le stringhe
    private HashSet<String> oggetto;

    //costruttore
    public InserisciOggetto(HashSet<String> oggetto) {
        this.oggetto = oggetto;
    }

    //getter
    public HashSet<String> getOggetto() {
        return oggetto;
    }

    //setter
    public void setOggetto(HashSet<String> oggetto) {
        this.oggetto = oggetto;
    }

    // Metodo per controllare se una stringa è già presente nell'HashSet.
    // Se non è presente, la aggiunge e mostra un messaggio di conferma;
    // altrimenti, segnala che la stringa è già presente.
    public void controlloOggetto(String stringaInIngresso) {
        if (oggetto.contains(stringaInIngresso)) {
            System.out.println("La stringa è già nella lista");
        } else {
            this.oggetto.add(stringaInIngresso);
            System.out.println("La stringa è stata aggiunta");
        }
    }
}

