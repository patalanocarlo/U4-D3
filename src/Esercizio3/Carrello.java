package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;
    private double totaleCostiArticoli;

    public Carrello(Cliente cliente, Articolo[] elencoArticoli) {
        this.cliente = cliente;
        this.elencoArticoli = elencoArticoli;
        this.totaleCostiArticoli = calcolaTotaleCostoArticoli();
    }

    private double calcolaTotaleCostoArticoli() {
        double totale = 0;
        for (Articolo articolo : elencoArticoli) {
            totale += articolo.getPrezzo();
        }
        return totale;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public double getTotaleCostiArticoli() {
        return totaleCostiArticoli;
    }
}