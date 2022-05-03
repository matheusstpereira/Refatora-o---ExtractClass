package main.java.IgrejaNovo;

public class Endereco {

    private Endereco() {
    }

    ;
    private static Endereco instance = new Endereco();

    public static Endereco getInstance() {
        return instance;
    }

    private String enderecoNumeroIgreja;
    private String enderecoRuaIgreja;
    private String enderecoBairroIgreja;

    public String getEnderecoNumeroIgreja() {
        return enderecoNumeroIgreja;
    }

    public void setEnderecoNumeroIgreja(String enderecoNumeroIgreja) {
        this.enderecoNumeroIgreja = enderecoNumeroIgreja;
    }

    public String getEnderecoRuaIgreja() {
        return enderecoRuaIgreja;
    }

    public void setEnderecoRuaIgreja(String enderecoRuaIgreja) {
        this.enderecoRuaIgreja = enderecoRuaIgreja;
    }

    public String getEnderecoBairroIgreja() {
        return enderecoBairroIgreja;
    }

    public void setEnderecoBairroIgreja(String enderecoBairroIgreja) {
        this.enderecoBairroIgreja = enderecoBairroIgreja;
    }

}
