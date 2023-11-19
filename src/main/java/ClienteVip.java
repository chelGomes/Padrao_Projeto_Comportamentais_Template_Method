public class ClienteVip extends Cliente {
    public String realizarAtendimento() {
        // Lógica específica para atendimento de cliente VIP
        return "Atendimento VIP";
    }

    @Override
    public String getTipo() {
        return "ClienteVIP";
    }
}
