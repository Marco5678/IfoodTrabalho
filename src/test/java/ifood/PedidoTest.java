package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void testInicializacaoPedido() {
        Pedido pedido = new Pedido();
        assertEquals("Recebido", pedido.getEstado());
    }

    @Test
    void testTransicaoParaPreparando() {
        Pedido pedido = new Pedido();
        pedido.preparar();
        assertEquals("Preparando", pedido.getEstado());
    }

    @Test
    void testTransicaoParaSaiuParaEntrega() {
        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.sairParaEntrega();
        assertEquals("Saiu para Entrega", pedido.getEstado());
    }

    @Test
    void testTransicaoParaEntregue() {
        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.sairParaEntrega();
        pedido.entregar();
        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    void testCancelarPedidoEmEstadoRecebido() {
        Pedido pedido = new Pedido();
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getEstado());
    }

    @Test
    void testCancelarPedidoEmEstadoPreparando() {
        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getEstado());
    }
}
