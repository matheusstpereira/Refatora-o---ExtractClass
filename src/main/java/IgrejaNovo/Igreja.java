package main.java.IgrejaNovo;

public class Igreja {

    private Igreja(){};
    private static Igreja instance = new Igreja();
    public static Igreja getInstance(){
        return instance;
    }

    private String nomeIgreja;
    private String codigoIgreja;

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
}

