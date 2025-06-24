package ifood;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    private List<String> itens = new ArrayList<>();
    private String endereco;
    private String formaPagamento;

    public PedidoBuilder adicionarItem(String item) {
        this.itens.add(item);
        return this;
    }

    public PedidoBuilder definirEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public PedidoBuilder definirFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
        return this;
    }

    public Pedido construir() {
        Pedido pedido = new Pedido();
        pedido.setItens(itens);
        pedido.setEndereco(endereco);
        pedido.setFormaPagamento(formaPagamento);
        return pedido;
    }
}


