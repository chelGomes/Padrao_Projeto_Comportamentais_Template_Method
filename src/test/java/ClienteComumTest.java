import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteComumTest {
    @Test
    void deveRetornarAtendimentoComum() {
        ClienteComum cliente = new ClienteComum();
        cliente.setNome("Ana");
        cliente.setIdCliente(1);
        assertEquals("Atendimento Regular", cliente.realizarAtendimento());
    }

    @Test
    void deveRetornarInformacoes() {
        ClienteComum cliente = new ClienteComum();
        cliente.setNome("Ana");
        cliente.setIdCliente(1);
        assertEquals("Cliente{ idCliente=1, nome='Ana', atendimento='Atendimento Regular'}", cliente.getInfo());
    }
}
