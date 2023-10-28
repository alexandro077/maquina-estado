package br.com.maquinaestado.estado;

import br.com.maquinaestado.EstadoDesligado;

public class EstadoLigado extends Estado{
    @Override
    public void ligar(Estado estado) {
        super.ligar(estado);
        System.out.println("A máquina está ligada. ");
    }

    @Override
    public void desligar(Estado estado) {
        super.desligar(estado);
        System.out.println("A máquina está desliagada. ");
        estado.setEstadoAtual(new EstadoDesligado());
    }

}
