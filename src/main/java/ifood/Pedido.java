package ifood;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private PedidoEstado estado;
    private List<String> itens;
    private String endereco;
    private String formaPagamento;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
        this.itens = new ArrayList<>();
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean sairParaEntrega() {
        return estado.sairParaEntrega(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }
}



