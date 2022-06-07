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
        System.out.println("########################################################");
        System.out.println("Bem vindo ao Cadastro de Empresas");
        System.out.printf("Digite o nome do usuário: ");
        String nome = entrada.nextLine();
        System.out.printf("Digite o CNPJ: ");
        String cnpj = entrada.nextLine();
        System.out.println(nome + ", por favor! Cadastre seus telefones. ");
        final List<Telefone> telefones = Telefone.cadastraTelefones();
        System.out.println(nome + ", por favor! Cadastre seus endereços. ");
        final List<Endereco> logadouros = Endereco.cadastraEnderecos();
        return new PessoaJuridica(idCliente, nome, cnpj, telefones, logadouros);
    }

    /*
     * Gera um menu para cadastra uma Lista de Pessoas Jurídica
     * @return Uma lista de Clintes Pessoas Jurídica
     */
    public static List<PessoaJuridica> cadastraClientes() {
        final Scanner entrada = new Scanner(System.in);
        List<PessoaJuridica> basePessoaJuridica = new ArrayList<>();
        int contIdCliente = 1;
        boolean continuar = true;
        basePessoaJuridica.add(PessoaJuridica.setCliente(contIdCliente));
        while (continuar) {
            System.out.println("##########################################################");
            System.out.println("Digite 1 para cadastra outra Empresa");
            System.out.println("Digite 0 para Cancelar: ");
            System.out.printf("Digite uma opção: ");
            int input = entrada.nextInt();
            switch (input) {
                case 1 -> {
                    contIdCliente++;
                    basePessoaJuridica.add(PessoaJuridica.setCliente(contIdCliente));
                }
                case 0 -> continuar = false;
                default -> System.out.println("Por favor! Digite uma opção Valida!");
            }
        }
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
