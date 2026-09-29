package org.example;

public class CanalSMS implements CanalEnvio {
    @Override
    public String enviarMensagem(String titulo, String conteudo) {
        return "Enviando SMS [" + titulo + "]: " + conteudo;
    }
}
