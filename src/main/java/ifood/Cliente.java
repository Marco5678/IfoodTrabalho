package ifood;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {
    private String nome;
    private String notificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNotificacao() {
        return notificacao;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.notificacao = this.nome + ", você recebeu uma atualização: " + arg.toString();
    }
}


