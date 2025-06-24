package ifood;

public class ComandoEntregar implements ComandoPedido {
    private Pedido pedido;

    public ComandoEntregar(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        pedido.entregar();
    }
}
