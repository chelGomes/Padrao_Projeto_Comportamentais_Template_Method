public class ClienteVip extends Cliente {
    public String realizarAtendimento() {

        return "Atendimento VIP";
    }

    @Override
    public String getTipo() {
        return "ClienteVIP";
    }
}
