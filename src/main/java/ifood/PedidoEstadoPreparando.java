package ifood;

public class PedidoEstadoPreparando extends PedidoEstado {
    private static PedidoEstadoPreparando instance = new PedidoEstadoPreparando();

    private PedidoEstadoPreparando() {}

    public static PedidoEstadoPreparando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean sairParaEntrega(Pedido pedido) {
        pedido.setEstado(PedidoEstadoSaiuParaEntrega.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}

