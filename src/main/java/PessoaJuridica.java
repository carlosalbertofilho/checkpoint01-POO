import java.util.Arrays;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Contrutor da Classe Cliente
     *
     * @param idCliente id da Empresa
     * @param nome      Nome da Empresa
     * @param cnpj      CNPJ da Empresa
     * @param telefones Lista de Telefones da Empresa
     * @param enderecos Endereços Cadastrado
     */
    public PessoaJuridica(int idCliente, String nome, String cnpj, Telefone[] telefones, Endereco[] enderecos) {
        super(idCliente, nome, telefones, enderecos);
        this.setCnpj(cnpj);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + this.getIdCliente() +
                ", Nome = '" + this.getNome() + '\'' +
                ", CNPJ = " + this.getCnpj() +
                ", Telefones = " + Arrays.toString(this.getTelefones()) +
                ", Enderecos = " + Arrays.toString(this.getEnderecos()) +
                '}';
    }
}
