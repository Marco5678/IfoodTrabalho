package ifood;

import java.util.Observable;

public class Restaurante extends Observable {
    private String nome;

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public void atualizarStatusPedido() {
        setChanged();
        notifyObservers("Status do pedido alterado no restaurante: " + nome);
    }
}