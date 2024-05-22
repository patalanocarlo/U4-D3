package Esercizio2;
import java.util.LinkedList;

public class Main {

    static class Chiamata {
        private String numeroChiamato;
        private int durata;

        public Chiamata(String numeroChiamato, int durata) {
            this.numeroChiamato = numeroChiamato;
            this.durata = durata;
        }

//senza il metodo toString ho un problema di leggibilita infatti avro un output illegibile con solo (nome del package nome della classe principale , la classe static di riferimento quindi Chiamata.)

        public String toString() {
            return "Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti";
        }
    }

    // Classe interna SIM
    static class SIM {
        private String numeroTelefono;
        private double credito;
        private LinkedList<Chiamata> ultimeChiamate;

        public SIM(String numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
            this.credito = 0;
            this.ultimeChiamate = new LinkedList<>();
        }

        public void aggiungiUnaChiamata(String numeroChiamato, int durata) {
            if (ultimeChiamate.size() == 5) {
                ultimeChiamate.removeFirst();
            }
            ultimeChiamate.add(new Chiamata(numeroChiamato, durata));
        }

        public void stampaDatiSim() {
            System.out.println("Numero di telefono: " + numeroTelefono);
            System.out.println("Credito disponibile: " + credito + "$");
            System.out.println("Ultime 5 chiamate effettuate:");
            if (ultimeChiamate.isEmpty()) {
                System.out.println("Nessuna chiamata effettuata.");
            } else {
                for (Chiamata chiamata : ultimeChiamate) {
                    System.out.println(chiamata);
                }
            }
        }
    }

    public static void main(String[] args) {
        SIM laMiaSim = new SIM("342-384-9990");

        laMiaSim.aggiungiUnaChiamata("342-365-4532", 3);
        laMiaSim.aggiungiUnaChiamata("342-324-3467", 20);
        laMiaSim.aggiungiUnaChiamata("342-321-9787", 50);
        laMiaSim.aggiungiUnaChiamata("342-378-3229", 34);
        laMiaSim.aggiungiUnaChiamata("342-342-9360", 2);

        laMiaSim.stampaDatiSim();
    }
}