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

    public static String setDdd(Scanner entrada){
        System.out.println("Digite o DDD: ");
        return entrada.nextLine();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static String setNumero(Scanner entrada){
        System.out.println("Digite o número do telefone: ");
        return entrada.nextLine();
    }

    /*
     * Implementa um Factory para a Classe Telefone
     * @return Uma Instância da Classe Telefone
     */
    public static Telefone setTelefone(){
        Scanner entrada = new Scanner(System.in);
        return new Telefone(setDdd(entrada), setNumero(entrada));
    }

    /*
     * Cadastra uma Lista de Telefone
     * @return retorna a lista de Telefones cadastrada.
     */
    public static List<Telefone> cadastraTelefones(){
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        List<Telefone> telefones = new ArrayList<Telefone>();
        telefones.add(Telefone.setTelefone());
        while (continuar) {
            System.out.println("Digite 1 para cadastra outro um Telefone");
            System.out.println("Digite 0 para Cancelar");
            int input = entrada.nextInt();
            switch(input){
                case 1:
                    telefones.add(Telefone.setTelefone());
                break;
                case 0:
                    continuar = false;
                break;
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
