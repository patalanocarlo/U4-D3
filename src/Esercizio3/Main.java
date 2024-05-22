package Esercizio3;
import java.util.Date;
public class Main {
    public class e-CommerceApp(){

        static class articolo(){

            private int codiceArticolo;

            private String descrizione;

            private double prezzo;

            private int disponibilità;

            public articolo(int codiceArticolo , String descrizione , double prezzo,  int disponibilità ){
                this.codiceArticolo= codiceArticolo;
                this.descrizione= descrizione;
                this.prezzo= prezzo;
                this.disponibilità=disponibilità;
            }
        }
static class Cliente (){
            private int codiceCliente;
                    private String nome;
                    private String cognome;
                    private  String email;
                    private Date dataIscrizione;

                    public  Cliente( int codiceCliente , String nome , String cognome , String email ,Date dataIscrizione){
                        this.codiceCliente= codiceCliente;
                        this.nome=nome;
                        this.cognome= cognome;
                        this.email=email;
                        this.dataIscrizione=dataIscrizione;
                    }
}
static class Carrello(){
            private Cliente cliente;
            private articolo[] elencoArticoli;
            private  double totaleCostiArticoli;

    public Carrello(Cliente cliente, articolo[] elencoArticoli) {
        this.cliente = cliente;
        this.elencoArticoli = elencoArticoli;
        this.totaleCostiArticoli = calcolaTotaleCostoArticoli();
}
private double calcolaTotaleCostoArticoli() {
    double totale = 0;
    for (articolo articolo : elencoArticoli){
        totale= articolo.prezzo;
    }
    return totale;
}

    }

        public static void main (String[] args) {
            articolo articolo1= new articolo(2356 , "Iphone" ,600.00, 4);
                 Cliente cliente1 = new Cliente(35464, "Carlo" ,"Patalano","Patalanocarlo674@gmail.com",new Date());
            articolo[] articoliNelCarrello= {articolo1};
            Carrello carrellocliente1 = new Carrello(cliente1, articoliNelCarrello );
            System.out.println("Totale della spesa del carrello è:" + carrellocliente1.totaleCostiArticoli);
        }}
    }


