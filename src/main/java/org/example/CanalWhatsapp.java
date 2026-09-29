package org.example;

public class CanalWhatsApp implements CanalEnvio {
    @Override
    public String enviarMensagem(String titulo, String conteudo) {
        return "Enviando WhatsApp [" + titulo + "]: " + conteudo;
    }
}
