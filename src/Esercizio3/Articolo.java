package Esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int disponibilita;

    public Articolo(int codiceArticolo, String descrizione, double prezzo, int disponibilita) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getDisponibilita() {
        return disponibilita;
    }
}