package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoFactoryTest {

    @Test
    void testCriacaoPedido() {
        Pedido pedido = PedidoFactory.criarPedido();
        assertNotNull(pedido);
        assertEquals("Recebido", pedido.getEstado());
    }
}
