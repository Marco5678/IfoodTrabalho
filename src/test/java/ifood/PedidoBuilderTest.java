package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoBuilderTest {

    @Test
    void deveConstruirPedidoComDados() {
        Pedido pedido = new PedidoBuilder()
                .adicionarItem("Hambúrguer")
                .adicionarItem("Refrigerante")
                .definirEndereco("Rua das Flores, 123")
                .definirFormaPagamento("Cartão")
                .construir();

        assertNotNull(pedido);
        assertEquals("Recebido", pedido.getEstado());
    }
}


