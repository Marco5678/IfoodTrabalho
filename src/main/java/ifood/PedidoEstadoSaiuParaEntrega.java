package ifood;

public class PedidoEstadoSaiuParaEntrega extends PedidoEstado {
    private static PedidoEstadoSaiuParaEntrega instance = new PedidoEstadoSaiuParaEntrega();

    private PedidoEstadoSaiuParaEntrega() {}

    public static PedidoEstadoSaiuParaEntrega getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Saiu para Entrega";
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }
}
