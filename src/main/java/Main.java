import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<PessoaFisica> basePessoaFisicas = new ArrayList<PessoaFisica>();
    private static List<PessoaJuridica> basePessoaJuridicas = new ArrayList<PessoaJuridica>();


    public static List<PessoaFisica> getBasePessoaFisicas() {
        return basePessoaFisicas;
    }

    public static void setBasePessoaFisicas(List<PessoaFisica> basePessoaFisicas) {
        Main.basePessoaFisicas = basePessoaFisicas;
    }

    public static List<PessoaJuridica> getBasePessoaJuridicas() {
        return basePessoaJuridicas;
    }

    public static void setBasePessoaJuridicas(List<PessoaJuridica> basePessoaJuridicas) {
        Main.basePessoaJuridicas = basePessoaJuridicas;
    }

    public static void casdastraClientes(){
        final Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("Você deseja cadastra um usuário Pessoa Física ou Jurídica?");
            System.out.println("Digite 1 para Pessoa Física ou 2 para Pessoa Jurídica");
            System.out.println("Digite 0 para Cancelar");
            int opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    setBasePessoaFisicas(PessoaFisica.cadastraClientes());
                break;
                case 2:
                    setBasePessoaJuridicas(PessoaJuridica.cadastraClientes());
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

        casdastraClientes();

        System.out.println(getBasePessoaFisicas());
        System.out.println(getBasePessoaJuridicas());

    }
}
