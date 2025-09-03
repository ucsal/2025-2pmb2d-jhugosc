package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender {
    private final SmtpClient smtpClient = new SmtpClient();

    @Override
    public void send(String to, String subject, String body) {
        this.smtpClient.send(to, subject, body);
        System.out.println("E-mail real enviado para: " + to);
    }
}