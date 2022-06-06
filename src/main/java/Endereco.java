import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Endereco {
    private String logadouro;
    private String cep;
    private Integer numero;


    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    /*
     * Construtor da classe Endereço
     * @param logadouro Endereço do cliente
     * @param cep       CEP do cliente
     * @param numero    Número do logadouro
     */
    public Endereco(String logadouro, String cep, Integer numero) {
        this.setLogadouro(logadouro);
        this.setCep(cep);
        this.setNumero(numero);
    }

    /*
     * Implementa um Factory para a Classe Endereço
     * @return Uma Instância da classe Endereço
     */
    public static Endereco getEndereco(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Logadouro: ");
        String logadouro = entrada.nextLine();
        System.out.println("Digite o CEP: ");
        String cep = entrada.nextLine();
        System.out.println("Digite o Número da Residência: ");
        Integer numero = entrada.nextInt();

        return new Endereco(logadouro, cep, numero);
    }

    /*
     * Gera um menu para cadastra uma Lista de Telefones
     * @return retorna a lista de Telefones cadastrada.
     */
    public static List<Endereco> cadastraEnderecos(){
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        List<Endereco> logadouro = new ArrayList<Endereco>();
        logadouro.add(Endereco.getEndereco());
        while (continuar) {
            System.out.println("Digite 1 para cadastra outro um Endereco");
            System.out.println("Digite 0 para Cancelar");
            int input = entrada.nextInt();
            switch (input) {
                case 1 -> logadouro.add(Endereco.getEndereco());
                case 0 -> continuar = false;
            }
        }
        return logadouro;
    }


    @Override
    public String toString() {
        return "Endereco [ " + System.lineSeparator() +
            "Logadouro = " + this.getLogadouro() +
            ", CEP = " + this.getCep() +
            ", numero = " + this.getNumero() + "]" + System.lineSeparator();
    }

}
