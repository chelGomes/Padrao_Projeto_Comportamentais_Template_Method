import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteVipTest {
    @Test
    void deveRetornarAtendimentoVIP() {
        ClienteVip cliente = new ClienteVip();
        cliente.setNome("Sophia");
        cliente.setIdCliente(2);
        assertEquals("Atendimento Vip", cliente.realizarAtendimento());
    }

    @Test
    void deveRetornarInformacoes() {
        ClienteVip cliente = new ClienteVip();
        cliente.setNome("Sophia");
        cliente.setIdCliente(2);
        assertEquals("ClienteVip{ idCliente=2, nome='Sophia', atendimento='Atendimento Vip'}", cliente.getInfo());
    }
}
