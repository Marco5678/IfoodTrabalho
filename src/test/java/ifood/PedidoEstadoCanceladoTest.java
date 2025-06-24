package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoEstadoCanceladoTest {

    @Test
    void testEstadoCancelado() {
        Pedido pedido = new Pedido();
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getEstado());
    }
}
