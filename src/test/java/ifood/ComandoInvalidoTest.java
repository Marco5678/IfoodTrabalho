package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComandoInvalidoTest {

    @Test
    void naoDeveEntregarPedidoSemSairParaEntrega() {
        Pedido pedido = new Pedido();
        ComandoPedido comando = new ComandoEntregar(pedido);
        comando.executar();
        assertNotEquals("Entregue", pedido.getEstado());
    }

    @Test
    void naoDeveSairParaEntregaSemPreparar() {
        Pedido pedido = new Pedido();
        ComandoPedido comando = new ComandoSairParaEntrega(pedido);
        comando.executar();
        assertNotEquals("Saiu para Entrega", pedido.getEstado());
    }
}
