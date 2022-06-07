import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Telefone {
    private String ddd;
    private String numero;


    //modificadores

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    /*
     * Implementa um Factory para a Classe Telefone
     * @return Uma Instância da Classe Telefone
     */
    public static Telefone setTelefone(){
        final Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o DDD: ");
        String ddd = entrada.nextLine();
        System.out.printf("Digite o número do telefone: ");
        String numero = entrada.nextLine();
        return new Telefone(ddd, numero);
    }

    /*
     * Cadastra uma Lista de Telefone
     * @return retorna a lista de Telefones cadastrada.
     */
    public static List<Telefone> cadastraTelefones(){
        final Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(Telefone.setTelefone());
        while (continuar) {
            System.out.println("############################################################");
            System.out.println("################## CADASTRO DE TELEFONES ###################");
            System.out.println("############################################################");
            System.out.println("Digite 1 para cadastra outro Telefone");
            System.out.println("Digite 0 para Cancelar");
            System.out.printf("Digite uma opção: ");
            int input = entrada.nextInt();
            switch (input) {
                case 1 -> telefones.add(Telefone.setTelefone());
                case 0 -> continuar = false;
                default -> System.out.println("Por favor! Digite uma opção Valida!");
            }
        }
        // entrada.close();
        return telefones;
    }

    /**
     * Contrutor da Classe Telefone
     * @param ddd DDD da operadora
     * @param numero Numero do Telefone
     */
    public Telefone(String ddd, String numero) {
        this.setDdd(ddd);
        this.setNumero(numero);
    }


    @Override
    public String toString() {
        return " (" + this.getDdd() +") " + this.getNumero() ;
    }
}
