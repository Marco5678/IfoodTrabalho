package ifood;

public class ComandoPreparar implements ComandoPedido {
    private Pedido pedido;

    public ComandoPreparar(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        pedido.preparar();
    }
}
