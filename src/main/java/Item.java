import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item {
    private String nome;
    private Integer quantidade;
    private Double preco;

    //modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * Contrutora da Classe Item
     * @param nome No do item
     * @param quantidade quantidade do item em estoque
     * @param preco preço do item
     */
    public Item(String nome, Integer quantidade, Double preco) {
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    /**
     * Implementa um Factory para a Classe Item
     * @return
     */
    public static Item setItem(){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o Nome do Produto: ");
        String nome = entrada.nextLine();
        System.out.printf(nome + "custa quanto? ");
        Double preco = entrada.nextDouble();
        System.out.printf("Quantas unidade de" + nome +" em estoque: ");
        Integer quantidade = entrada.nextInt();
        return new Item(nome, quantidade, preco);
    }

    /**
     * Gera um menu para cadastra uma Lista de Itens
     * @return Uma lista de Itens
     */
    public static List<Item> cadastraItems(){
        final Scanner entrada = new Scanner(System.in);
        List<Item> itens = new ArrayList<>();
        boolean continuar = true;
        itens.add(Item.setItem());
        while( continuar ){
            System.out.println("##########################################################");
            System.out.println("Digite 1 para cadastra outro Cliente");
            System.out.println("Digite 0 para Cancelar: ");
            System.out.printf("Digite uma opção: ");
            int input = entrada.nextInt();
            switch (input) {
                case 1 -> itens.add(Item.setItem());
                case 0 -> continuar = false;
                default -> System.out.println("Por favor! Digite uma opção Valida!");
            }
        }
        return itens;
    }
    @Override
    public String toString() {
        return "Item {" +
                "Nome ='" + this.getNome() + '\'' +
                ", Quantidade =" + this.getQuantidade() +
                ", Preco =" + this.getPreco() +
                '}';
    }
}
