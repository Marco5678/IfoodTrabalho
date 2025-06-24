package ifood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestauranteObserverTest {

    @Test
    void testNotificarCliente() {
        Restaurante restaurante = new Restaurante("Restaurante XYZ");
        Cliente cliente = new Cliente("João");
        restaurante.addObserver(cliente);
        restaurante.atualizarStatusPedido();
        assertEquals("João, você recebeu uma atualização: Status do pedido alterado no restaurante: Restaurante XYZ", cliente.getNotificacao());
    }
}
