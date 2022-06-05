import java.util.Arrays;

public class Cliente {
    private int idCliente;
    private String nome;
    private Telefone[] telefones;
    private Endereco[] enderecos;

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

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * Contrutor da Classe Cliente
     * @param idCliente id do Cliente
     * @param nome Nome do Cliente
     * @param telefones Lista de Telefones do Cliente
     * @param enderecos Endereços Cadastrado
     */
    public Cliente(int idCliente, String nome, Telefone[] telefones, Endereco[] enderecos) {
        this.setIdCliente(idCliente);
        this.setNome(nome);
        this.setTelefones(telefones);
        this.setEnderecos(enderecos);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + this.getIdCliente() +
                ", Nome = '" + this.getNome() + '\'' +
                ", Telefones = " + Arrays.toString(this.getTelefones()) +
                ", Enderecos = " + Arrays.toString(this.getEnderecos()) +
                '}';
    }
}
