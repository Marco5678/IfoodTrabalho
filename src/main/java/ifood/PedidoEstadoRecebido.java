package ifood;

public class PedidoEstadoRecebido extends PedidoEstado {
    private static PedidoEstadoRecebido instance = new PedidoEstadoRecebido();

    private PedidoEstadoRecebido() {}

    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebido";
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}

