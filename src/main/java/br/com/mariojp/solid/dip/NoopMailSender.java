package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender{
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("--- DRY RUN MODE ---");
        System.out.println("E-mail (não enviado) para: " + to);
        System.out.println("Assunto: " + subject);
    }
}