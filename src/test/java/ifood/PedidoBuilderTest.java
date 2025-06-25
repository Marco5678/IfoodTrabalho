package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

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

    @Test
    void deveConstruirPedidoComItens() {
        Pedido pedido = new PedidoBuilder()
                .adicionarItem("Pizza")
                .adicionarItem("Suco")
                .construir();

        assertEquals(List.of("Pizza", "Suco"), pedido.getItens());
    }

    @Test
    void deveConstruirPedidoComEndereco() {
        Pedido pedido = new PedidoBuilder()
                .definirEndereco("Rua A, 123")
                .construir();

        assertEquals("Rua A, 123", pedido.getEndereco());
    }

    @Test
    void deveConstruirPedidoComFormaPagamento() {
        Pedido pedido = new PedidoBuilder()
                .definirFormaPagamento("Cartão")
                .construir();

        assertEquals("Cartão", pedido.getFormaPagamento());
    }

    @Test
    void deveConstruirPedidoComEstadoInicial() {
        Pedido pedido = new PedidoBuilder()
                .construir();

        assertEquals("Recebido", pedido.getEstado());
    }
}


