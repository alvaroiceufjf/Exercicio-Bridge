package org.example;

public class NotificacaoEmprestimoPF extends Notificacao {

    private String nomeCooperado;
    private double valor;

    public NotificacaoEmprestimoPF(CanalEnvio canal, String nomeCooperado, double valor) {
        super(canal);
        this.nomeCooperado = nomeCooperado;
        this.valor = valor;
    }

    @Override
    public String enviar() {
        String titulo = "Aviso de Crédito PF";
        String conteudo = "Olá " + nomeCooperado + ", seu empréstimo de R$ " + valor + " foi aprovado.";
        return this.canal.enviarMensagem(titulo, conteudo);
    }
}
