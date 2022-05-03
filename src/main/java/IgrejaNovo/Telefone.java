package main.java.IgrejaNovo;

public class Telefone {

    private Telefone() {
    }

    ;
    private static Telefone instance = new Telefone();

    public static Telefone getInstance() {
        return instance;
    }

    private String telefoneIgreja;

    public String getTelefoneIgreja() {
        return telefoneIgreja;
    }

    public void setTelefoneIgreja(String telefoneIgreja) {
        this.telefoneIgreja = telefoneIgreja;
    }

}
