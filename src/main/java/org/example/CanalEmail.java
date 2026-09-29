package org.example;

public class CanalEmail implements CanalEnvio {
    @Override
    public String enviarMensagem(String titulo, String conteudo) {
        return "Enviando E-mail [" + titulo + "]: " + conteudo;
    }
}
