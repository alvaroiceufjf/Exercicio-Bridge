package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificacaoTest {

    @Test
    void deveEnviarNotificacaoEmprestimoPFPorEmail() {
        CanalEnvio canal = new CanalEmail();
        Notificacao notificacao = new NotificacaoEmprestimoPF(canal, "João Silva", 15000.0);

        assertEquals(
            "Enviando E-mail [Aviso de Crédito PF]: Olá João Silva, seu empréstimo de R$ 15000.0 foi aprovado.",
            notificacao.enviar()
        );
    }

    @Test
    void deveEnviarNotificacaoCreditoAgroPorWhatsApp() {
        CanalEnvio canal = new CanalWhatsApp();
        Notificacao notificacao = new NotificacaoCreditoAgro(canal, "Fazenda Boa Vista", "CPR-2026-88");

        assertEquals(
            "Enviando WhatsApp [Liberação Crédito Rural Agro]: Produtor Fazenda Boa Vista, a parcela do contrato CPR-2026-88 está disponível.",
            notificacao.enviar()
        );
    }

    @Test
    void devePermitirTrocarCanalEmTempoDeExecucao() {
        CanalEnvio email = new CanalEmail();
        CanalEnvio sms = new CanalSMS();

        Notificacao notificacao = new NotificacaoEmprestimoPF(email, "Maria Souza", 5000.0);
        
        // Envio via E-mail
        assertEquals(
            "Enviando E-mail [Aviso de Crédito PF]: Olá Maria Souza, seu empréstimo de R$ 5000.0 foi aprovado.",
            notificacao.enviar()
        );

        // Troca dinâmica do canal para SMS usando a mesma abstração
        notificacao.setCanal(sms);

        assertEquals(
            "Enviando SMS [Aviso de Crédito PF]: Olá Maria Souza, seu empréstimo de R$ 5000.0 foi aprovado.",
            notificacao.enviar()
        );
    }
}
