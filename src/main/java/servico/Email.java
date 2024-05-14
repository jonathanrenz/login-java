/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import javax.mail.*;
import java.util.Properties;

/**
 *
 * @author Jonathan Renz
 */
public class Email {

    static final String remetente_nome = "?"; //colocar seu email
    static final String remetente_senha = "?"; //colocar senha
    private String assunto;
    private String mensagem;
    private String destinatario;

    public Email(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar() {
        SimpleEmail email = new SimpleEmail();
        email.setSSLOnConnect(true);
        email.setHostName("smtp.gmail.com");
        email.setSslSmtpPort("465");
        email.setAuthenticator(new DefaultAuthenticator(remetente_nome, remetente_senha));

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); 
        props.put("mail.smtp.port", "465"); 

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(remetente_nome, remetente_senha);
            }
        });

        try {
            email.setFrom(remetente_nome);
            email.setDebug(true);
            email.setSubject(this.assunto);
            email.setMsg(this.mensagem);
            email.addTo(this.destinatario);

            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }

    }

}
