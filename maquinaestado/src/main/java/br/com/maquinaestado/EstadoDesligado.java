package br.com.maquinaestado;

public record EstadoDesligado() implements Estado {
    @Override
    public void ligar(MaquinaEstado maquinaEstado) {

    }

    @Override
    public void Desligar(MaquinaEstado maquinaEstado) {

    }
}
