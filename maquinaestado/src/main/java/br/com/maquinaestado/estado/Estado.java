package br.com.maquinaestado.estado;

import br.com.maquinaestado.EstadoDesligado;
import br.com.maquinaestado.MaquinaEstado;

public class Estado extends MaquinaEstado {
  private EstadoDesligado estadoAtual = new EstadoDesligado();

  ;


    public void setEstadoAtual(EstadoDesligado estado) {
        estadoAtual = estado;
    }

    public void ligar(Estado estado) {
        estadoAtual.ligar(this);
    }

    public void desligar(Estado estado) {
        estadoAtual.Desligar(this);
    }


    protected void setEstadoAtual(EstadoLigado estadoLigado) {
    }
}
