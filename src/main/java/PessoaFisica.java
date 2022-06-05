import java.util.Arrays;

public class PessoaFisica extends Cliente{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Contrutor da Classe Cliente
     *
     * @param idCliente id do Cliente
     * @param nome      Nome do Cliente
     * @param cpf       CPF do Cliente
     * @param telefones Lista de Telefones do Cliente
     * @param enderecos Endereços Cadastrado
     */
    public PessoaFisica(int idCliente, String nome, String cpf, Telefone[] telefones, Endereco[] enderecos) {
        super(idCliente, nome, telefones, enderecos);
        this.setCpf(cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + this.getIdCliente() +
                ", Nome = '" + this.getNome() + '\'' +
                ", CPF = " + this.getCpf() +
                ", Telefones = " + Arrays.toString(this.getTelefones()) +
                ", Enderecos = " + Arrays.toString(this.getEnderecos()) +
                '}';
    }
}
