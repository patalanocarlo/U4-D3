package Esercizio3;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo(2356, "Iphone", 600.00, 4);
        Articolo articolo2 = new Articolo(2354, "Samsung", 320.00, 2);
        Cliente cliente1 = new Cliente(35464, "Carlo", "Patalano", "Patalanocarlo674@gmail.com", 20240522);
        Articolo[] articoliNelCarrello = {articolo1, articolo2};
        Carrello carrelloCliente1 = new Carrello(cliente1, articoliNelCarrello);

        System.out.println("Il cliente: " + cliente1.getNome() + " " + cliente1.getCognome() +
                " ha totalizzato una spesa complessiva di: " + carrelloCliente1.getTotaleCostiArticoli() + " euro.");

        double totaleConSconto = carrelloCliente1.getTotaleCostiArticoli();
        if (totaleConSconto > 500) {
            totaleConSconto -= 30;
            System.out.println("Complimenti! Dato che lei ha effettuato un ordine superiore a 500 euro, avrà uno sconto di 30 euro.");
            System.out.println("Pagherà in totale: " + totaleConSconto + " euro.");
        }
    }
}