package Esercizio3;
public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private int dataIscrizione;

    public Cliente(int codiceCliente, String nome, String cognome, String email, int dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public int getDataIscrizione() {
        return dataIscrizione;
    }
}