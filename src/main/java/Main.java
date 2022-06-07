import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<PessoaFisica> basePessoaFisica = new ArrayList<PessoaFisica>();
    private static List<PessoaJuridica> basePessoaJuridica = new ArrayList<PessoaJuridica>();


    public static List<PessoaFisica> getBasePessoaFisica() {
        return basePessoaFisica;
    }

    public static void setBasePessoaFisica(List<PessoaFisica> basePessoaFisica) {
        Main.basePessoaFisica = basePessoaFisica;
    }

    public static List<PessoaJuridica> getBasePessoaJuridica() {
        return basePessoaJuridica;
    }

    public static void setBasePessoaJuridica(List<PessoaJuridica> basePessoaJuridica) {
        Main.basePessoaJuridica = basePessoaJuridica;
    }

    public static void casdastraCliente(){
        final Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("##########################################################");
            System.out.println("################## CADASTRO DE USUÁRIO ###################");
            System.out.println("##########################################################");
            System.out.println("Você deseja cadastra um usuário Pessoa Física ou Jurídica?");
            System.out.println("Digite 1 para Pessoa Física ou 2 para Pessoa Jurídica");
            System.out.println("Digite 0 para Cancelar");
            System.out.printf("Digite uma opção: ");
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1 -> setBasePessoaFisica(PessoaFisica.cadastraClientes());
                case 2 -> setBasePessoaJuridica(PessoaJuridica.cadastraClientes());
                case 0 -> continuar = false;
                default -> System.out.println("Por favor! Digite uma opção Valida!");
            }
        } while( continuar );
        entrada.close();
    }

    public static void main(String[] args) {
        casdastraCliente();

        System.out.println(getBasePessoaFisica());
        System.out.println(getBasePessoaJuridica());

    }
}
