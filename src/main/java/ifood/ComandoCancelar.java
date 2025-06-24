package ifood;

public class ComandoCancelar implements ComandoPedido {
    private Pedido pedido;

    public ComandoCancelar(Pedido pedido) {
        this.pedido = pedido;
    }

    public void executar() {
        pedido.cancelar();
    }
}

