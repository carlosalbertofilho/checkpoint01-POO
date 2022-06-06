import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
     * @param logadouro Endereços Cadastrado
     */
    public PessoaJuridica(int idCliente, String nome, String cnpj, List<Telefone> telefones, List<Endereco> logadouro) {
        super(idCliente, nome, telefones, logadouro);
        this.setCnpj(cnpj);
    }

    /*
     * Metodo Factory para a Classe Pessoa Jurídica
     *
     * @param idCliente Indice para controle da lista de Clientes
     * @return retorna uma instância classe Pessoa Jurídica.
     */
    public static PessoaJuridica setCliente(int idCliente){
        final Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o CNPJ: ");
        String cnpj = entrada.nextLine();
        final List<Telefone> telefones = Telefone.cadastraTelefones();
        final List<Endereco> logadouros = Endereco.cadastraEnderecos();
        entrada.close();
        return new PessoaJuridica(idCliente, nome, cnpj, telefones, logadouros);
    }

    /*
     * Gera um menu para cadastra uma Lista de Pessoas Jurídica
     * @return Uma lista de Clintes Pessoas Jurídica
     */
    public static List<PessoaJuridica> cadastraClientes() {
        final Scanner entrada = new Scanner(System.in);
        List<PessoaJuridica> basePessoaJuridica = new ArrayList<PessoaJuridica>();
        int contIdCliente = 1;
        boolean continuar = true;
        do {
            basePessoaJuridica.add(PessoaJuridica.setCliente(contIdCliente));
            System.out.println("Digite 1 para cadastra outro um Cliente");
            System.out.println("Digite 0 para Cancelar");
            int input = entrada.nextInt();
            switch(input){
                case 1:
                    contIdCliente++;
                    basePessoaJuridica.add(PessoaJuridica.setCliente(contIdCliente));
                break;
                case 0:
                    continuar = false;
                break;
                default:
                    System.out.println("Por favor! Digite uma opção Valida!");
                break;
            }
        } while (continuar);
        entrada.close();
        return basePessoaJuridica;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + getIdCliente() +
                ", Nome = '" + getNome() + '\'' +
                ", CNPJ = " + getCnpj() +
                ", Telefones = " + getTelefones().toString() +
                ", Enderecos = " + getEnderecos().toString() +
                '}';
    }
}
