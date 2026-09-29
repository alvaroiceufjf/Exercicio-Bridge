package org.example;

public class NotificacaoCreditoAgro extends Notificacao {

    private String nomeCooperado;
    private String numeroContrato;

    public NotificacaoCreditoAgro(CanalEnvio canal, String nomeCooperado, String numeroContrato) {
        super(canal);
        this.nomeCooperado = nomeCooperado;
        this.numeroContrato = numeroContrato;
    }

    @Override
    public String enviar() {
        String titulo = "Liberação Crédito Rural Agro";
        String conteudo = "Produtor " + nomeCooperado + ", a parcela do contrato " + numeroContrato + " está disponível.";
        return this.canal.enviarMensagem(titulo, conteudo);
    }
}
