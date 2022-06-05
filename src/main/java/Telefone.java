public class Telefone {
    private byte ddd;
    private int numero;


    //modificadores

    public byte getDdd() {
        return ddd;
    }

    public void setDdd(byte ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Contrutor da Classe Telefone
     * @param ddd DDD da operadora
     * @param numero Numero do Telefone
     */
    public Telefone(byte ddd, int numero) {
        this.setDdd(ddd);
        this.setNumero(numero);
    }

    @Override
    public String toString() {
        return " (" + this.getDdd() +") " + this.getNumero() ;
    }
}
