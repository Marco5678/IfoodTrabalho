package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComandoPedidoTest {

    @Test
    void deveExecutarComandoPreparar() {
        Pedido pedido = new Pedido();
        ComandoPedido comando = new ComandoPreparar(pedido);
        comando.executar();
        assertEquals("Preparando", pedido.getEstado());
    }

    @Test
    void deveExecutarComandoSairParaEntrega() {
        Pedido pedido = new Pedido();
        pedido.preparar(); // precisa estar preparado antes
        ComandoPedido comando = new ComandoSairParaEntrega(pedido);
        comando.executar();
        assertEquals("Saiu para Entrega", pedido.getEstado());
    }

    @Test
    void deveExecutarComandoEntregar() {
        Pedido pedido = new Pedido();
        pedido.preparar();
        pedido.sairParaEntrega();
        ComandoPedido comando = new ComandoEntregar(pedido);
        comando.executar();
        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    void deveExecutarComandoCancelar() {
        Pedido pedido = new Pedido();
        ComandoPedido comando = new ComandoCancelar(pedido);
        comando.executar();
        assertEquals("Cancelado", pedido.getEstado());
    }

    @Test
    void deveExecutarVariosComandosNaOrdem() {
        Pedido pedido = new Pedido();

        ControleDePedidos controle = new ControleDePedidos();
        controle.adicionarComando(new ComandoPreparar(pedido));
        controle.adicionarComando(new ComandoSairParaEntrega(pedido));
        controle.adicionarComando(new ComandoEntregar(pedido));

        controle.executarComandos();

        assertEquals("Entregue", pedido.getEstado());
    }
}

