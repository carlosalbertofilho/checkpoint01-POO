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
            System.out.println("Você deseja cadastra um usuário Pessoa Física ou Jurídica?");
            System.out.println("Digite 1 para Pessoa Física ou 2 para Pessoa Jurídica");
            System.out.println("Digite 0 para Cancelar");
            int opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    setBasePessoaFisica(PessoaFisica.cadastraClientes());
                break;
                case 2:
                    setBasePessoaJuridica(PessoaJuridica.cadastraClientes());
                break;
                case 0:
                    continuar = false;
                break;
                default:
                    System.out.println("Por favor! Digite uma opção Valida!");
                break;
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
