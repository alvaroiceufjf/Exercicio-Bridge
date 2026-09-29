package org.example;

public abstract class Notificacao {

    // Ponte (Bridge) para a interface do implementor
    protected CanalEnvio canal;

    public Notificacao(CanalEnvio canal) {
        this.canal = canal;
    }

    public void setCanal(CanalEnvio canal) {
        this.canal = canal;
    }

    public abstract String enviar();
}
