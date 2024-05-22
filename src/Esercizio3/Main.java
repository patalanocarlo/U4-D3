package Esercizio3;

public class Main {
    public static class eCommerceApp {

        static class Articolo {
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
        }

        static class Cliente {
            private int codiceCliente;
            private String nome;
            private String cognome;
            private String email;
            private int dataIscrizione;

            public Cliente(int codiceCliente, String nome, String cognome, String email, int  dataIscrizione) {
                this.codiceCliente = codiceCliente;
                this.nome = nome;
                this.cognome = cognome;
                this.email = email;
                this.dataIscrizione = dataIscrizione;
            }
        }

        static class Carrello {
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
                    totale += articolo.prezzo;
                }
                return totale;
            }
        }
    }
    public static void main(String[] args) {
        eCommerceApp.Articolo articolo1 = new eCommerceApp.Articolo(2356, "Iphone", 600.00, 4);
        eCommerceApp.Articolo articolo2=new eCommerceApp.Articolo(2354, "Samsung" ,320.00,2 );
        eCommerceApp.Cliente cliente1 = new eCommerceApp.Cliente(35464, "Carlo", "Patalano", "Patalanocarlo674@gmail.com" , 22/05/2024);
        eCommerceApp.Articolo[] articoliNelCarrello = {articolo1, articolo2};
        eCommerceApp.Carrello carrelloCliente1 = new eCommerceApp.Carrello(cliente1, articoliNelCarrello);
        System.out.println("Il cliente:" + cliente1.nome + " " + cliente1.cognome + " " + "ha totalizzato una spesa complessiva di:" + " " +carrelloCliente1.totaleCostiArticoli + " euro."  );
    }
}