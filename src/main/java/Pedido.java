import java.time.LocalDate;
import java.util.Arrays;

public class Pedido {
    private int idPedido;
    private LocalDate data;
    private Endereco enderecoEntrega;
    private Item[] itens;
    private final Cliente cliente;

    //modificadores
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }


    /**
     * Construtor da Classe Pedido
     *
     * @param idPedido id do Pedido
     * @param cliente  Cliente que fez o pedido
     * @param data     Data do Pedido
     * @param itens    Items do pedido
     */
    public Pedido(int idPedido, Cliente cliente, LocalDate data, Item[] itens) {
        this.cliente = cliente;
        this.setIdPedido(idPedido);
        this.setData(data);
        this.setEnderecoEntrega(cliente.getEndereco());
        this.setItens(itens);
    }

    @Override
    public String toString() {
        return "Pedido numero " + this.getIdPedido() +
                ", Realizado em " + this.getData() +
                ", pelo Cliente " + this.cliente.getNome() +
                ", Endereço de Entrega " + this.getEnderecoEntrega() +
                ", itens=" + Arrays.toString(this.getItens());
    }
}
