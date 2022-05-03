package test.java.IgrejaNovo;

import main.java.IgrejaNovo.Igreja;
import main.java.IgrejaNovo.Endereco;
import main.java.IgrejaNovo.Telefone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IgrejaTest {

    //Testes com Classe Igreja
    @Test
    public void deveRetornarNomeIgreja(){
        Igreja.getInstance().setNomeIgreja("Caminho da Graca");
        assertEquals("Caminho da Graca", Igreja.getInstance().getNomeIgreja());
    }

    @Test
    public void deveRetornarCodigoIgreja() {
        Igreja.getInstance().setCodigoIgreja("05");
        assertEquals("05", Igreja.getInstance().getCodigoIgreja());
    }

    //Testes com Classe Endereço
    @Test
    public void deveRetornarEnderecoNumeroIgreja(){
        Endereco.getInstance().setEnderecoNumeroIgreja("120");
        assertEquals("120", Endereco.getInstance().getEnderecoNumeroIgreja());
    }

    @Test
    public void deveRetornarEnderecoRuaIgreja(){
        Endereco.getInstance().setEnderecoRuaIgreja("Rua Maquinista Joao Mendes");
        assertEquals("Rua Maquinista Joao Mendes", Endereco.getInstance().getEnderecoRuaIgreja());
    }

    @Test
    public void deveRetornarEnderecoBairroIgreja(){
        Endereco.getInstance().setEnderecoBairroIgreja("Flores");
        assertEquals("Flores", Endereco.getInstance().getEnderecoBairroIgreja());
    }

    //Testes com Classe Telefone
    @Test
    public void deveRetornarTelefoneIgreja(){
        Telefone.getInstance().setTelefoneIgreja("32 32511954");
        assertEquals("32 32511954", Telefone.getInstance().getTelefoneIgreja());
    }


}
