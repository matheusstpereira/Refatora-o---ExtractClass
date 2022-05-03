package test.java.IgrejaAntigo;

import main.java.IgrejaAntigo.Igreja;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IgrejaTest {

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

    @Test
    public void deveRetornarEnderecoNumeroIgreja() {
        Igreja.getInstance().setEnderecoNumeroIgreja("120");
        assertEquals("120", Igreja.getInstance().getEnderecoNumeroIgreja());
    }

    @Test
    public void deveRetornarEnderecoRuaIgreja() {
        Igreja.getInstance().setEnderecoRuaIgreja("Rua Maquinista Joao Mendes");
        assertEquals("Rua Maquinista Joao Mendes", Igreja.getInstance().getEnderecoRuaIgreja());
    }

    @Test
    public void deveRetornarEnderecoBairroIgreja() {
        Igreja.getInstance().setEnderecoBairroIgreja("Flores");
        assertEquals("Flores", Igreja.getInstance().getEnderecoBairroIgreja());
    }

    @Test
    public void deveRetornarTelefoneIgreja() {
        Igreja.getInstance().setTelefoneIgreja("32 32511954");
        assertEquals("32 32511954", Igreja.getInstance().getTelefoneIgreja());
    }
}
