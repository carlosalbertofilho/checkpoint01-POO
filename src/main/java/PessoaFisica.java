import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
     * @param logadouro Endereços Cadastrado
     */
    public PessoaFisica(int idCliente, String nome, String cpf, List<Telefone> telefones, List<Endereco> logadouro) {
        super(idCliente, nome, telefones, logadouro);
        this.setCpf(cpf);
    }

    /*
     * Metodo Factory para a Classe Pessoa Física
     *
     * @param idCliente Indice para controle da lista de Clientes
     * @return retorna uma instância classe Pessoa Física.
     */
    public static PessoaFisica setCliente(int idCliente){
        final Scanner entrada = new Scanner(System.in);
        System.out.println("########################################################");
        System.out.println("Bem-vindo! Ao Cadastro de Usuários");
        System.out.printf("Digite o nome do usuário: ");
        String nome = entrada.nextLine();
        System.out.printf("Digite o CPF: ");
        String cpf = entrada.nextLine();
        System.out.println(nome + ", por favor! Cadastre seus telefones. ");
        final List<Telefone> telefones = Telefone.cadastraTelefones();
        System.out.println(nome + ", por favor! Cadastre seus endereços. ");
        final List<Endereco> logadouros = Endereco.cadastraEnderecos();
        return new PessoaFisica(idCliente, nome, cpf, telefones, logadouros);
    }

    /*
     * Gera um menu para cadastra uma Lista de Pessoas Física
     * @return Uma lista de Clintes Pessoas Física
     */
    public static List<PessoaFisica> cadastraClientes() {
        final Scanner entrada = new Scanner(System.in);
        List<PessoaFisica> basePessoaFisicas = new ArrayList<>();
        int contIdCliente = 1;
        boolean continuar = true;
        basePessoaFisicas.add(PessoaFisica.setCliente(contIdCliente));
        while (continuar) {
            System.out.println("##########################################################");
            System.out.println("Digite 1 para cadastra outro Cliente");
            System.out.println("Digite 0 para Cancelar: ");
            System.out.printf("Digite uma opção: ");
            int input = entrada.nextInt();
            switch (input) {
                case 1 -> {
                    contIdCliente++;
                    basePessoaFisicas.add(PessoaFisica.setCliente(contIdCliente));
                }
                case 0 -> continuar = false;
                default -> System.out.println("Por favor! Digite uma opção Valida!");
            }
        }
        return basePessoaFisicas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + getIdCliente() +
                ", Nome = '" + getNome() + '\'' +
                ", CPF = " + getCpf() +
                ", Telefones = " + getTelefones().toString() +
                ", Enderecos = " + getEnderecos().toString() +
                '}';
    }
}
