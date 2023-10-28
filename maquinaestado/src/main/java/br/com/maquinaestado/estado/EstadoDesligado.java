package br.com.maquinaestado.estado;

public class EstadoDesligado extends Estado {
    public void ligar(Estado estado){
        super.ligar(estado);
        System.out.println("A máquina está ligada. ");
        estado.setEstadoAtual(new EstadoLigado());

    }

    public void desligar(Estado estado) {
        super.desligar(estado);
        System.out.println("A máquina está desliagada. ");
    }
}
