package ifood;

public class ComandoSairParaEntrega implements ComandoPedido {
    private Pedido pedido;

    public ComandoSairParaEntrega(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        pedido.sairParaEntrega();
    }
}

