package ifood;

import java.util.ArrayList;
import java.util.List;

public class ControleDePedidos {
    private List<ComandoPedido> comandos = new ArrayList<>();

    public void adicionarComando(ComandoPedido comando) {
        comandos.add(comando);
    }

    public void executarComandos() {
        for (ComandoPedido comando : comandos) {
            comando.executar();
        }
        comandos.clear();
    }
}

