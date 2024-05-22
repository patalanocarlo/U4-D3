package Esercizio1;

public class Main {

    public static class Rettangolo {
        // Attributi privati per altezza e larghezza
        private double altezza;
        private double larghezza;

        // Vado ad inizializzare altezza e larghezza
        public Rettangolo(double altezza, double larghezza) {
            this.altezza = altezza;
            this.larghezza = larghezza;
        }

        // Metodi getter e setter per la mia  altezza e larghezza
        public double getAltezza() {
            return altezza;
        }

        public double getLarghezza() {
            return larghezza;
        }

        // Metodi setter per altezza e larghezza
        public void setAltezza(double altezza) {
            this.altezza = altezza;
        }

        public void setLarghezza(double larghezza) {
            this.larghezza = larghezza;
        }


        public double calcolaArea() {
            return altezza * larghezza;
        }


        public double calcolaPerimetro() {
            return 2 * (altezza + larghezza);
        }

        // Metodo static per stampare area e perimetro di un rettangolo
        public static void stampaRettangolo(Rettangolo r) {
            System.out.println("Area: " + r.calcolaArea());
            System.out.println("Perimetro: " + r.calcolaPerimetro());
        }

        // Metod static per stampare area e perimetro di due rettangoli e sommarli
        public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
            System.out.println("Rettangolo 1:");
            stampaRettangolo(r1);
            System.out.println("Rettangolo 2:");
            stampaRettangolo(r2);

            double sommaAree = r1.calcolaArea() + r2.calcolaArea();
            double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

            System.out.println("Somma delle aree: " + sommaAree);
            System.out.println("Somma dei perimetri: " + sommaPerimetri);
        }
    }

    // Metodo main per testare le funzionalità della classe Rettangolo
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 9);
        Rettangolo rettangolo2 = new Rettangolo(3, 7);

        System.out.println("Dettagli del primo rettangolo:");
        Rettangolo.stampaRettangolo(rettangolo1);

        System.out.println("\nDettagli del secondo rettangolo:");
        Rettangolo.stampaRettangolo(rettangolo2);

        System.out.println("\nDettagli di entrambi i rettangoli:");
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}