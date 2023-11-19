public abstract class Cliente {
    private int idCliente;
    protected String nome;
    private String email;
    private String telefone;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public abstract String realizarAtendimento();

    public String getTipo() {
        return "Cliente";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "idCliente=" + this.idCliente +
                ", nome='" + this.nome + '\'' +
                ", atendimento='" + this.realizarAtendimento() + '\'' +
                '}';
    }
}
