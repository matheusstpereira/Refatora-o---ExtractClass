package main.java.IgrejaAntigo;

public class Igreja {

    private Igreja(){};
    private static Igreja instance = new Igreja();
    public static Igreja getInstance() {
        return instance;
    }

    private String nomeIgreja;
    private String codigoIgreja;
    private String enderecoNumeroIgreja;
    private String enderecoRuaIgreja;
    private String enderecoBairroIgreja;
    private String telefoneIgreja;

    public String getNomeIgreja() {
        return nomeIgreja;
    }
    public void setNomeIgreja(String nomeIgreja) {
        this.nomeIgreja = nomeIgreja;
    }

    public String getCodigoIgreja() {
        return codigoIgreja;
    }
    public void setCodigoIgreja(String codigoIgreja) {
        this.codigoIgreja = codigoIgreja;
    }

    public String getEnderecoNumeroIgreja() { return enderecoNumeroIgreja; }
    public void setEnderecoNumeroIgreja(String enderecoNumeroIgreja) { this.enderecoNumeroIgreja = enderecoNumeroIgreja; }

    public String getEnderecoRuaIgreja() { return enderecoRuaIgreja; }
    public void setEnderecoRuaIgreja(String enderecoRuaIgreja) { this.enderecoRuaIgreja = enderecoRuaIgreja; }

    public String getEnderecoBairroIgreja() { return enderecoBairroIgreja; }
    public void setEnderecoBairroIgreja(String enderecoBairroIgreja) { this.enderecoBairroIgreja = enderecoBairroIgreja; }

    public String getTelefoneIgreja() { return telefoneIgreja; }
    public void setTelefoneIgreja(String telefoneIgreja) { this.telefoneIgreja = telefoneIgreja; }
    
}
