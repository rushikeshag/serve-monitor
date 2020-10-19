package org.lotus.servemonitor.mail;

public interface EmailService {
    public void sendSimpleMessage(String from, String to, String subject, String text);

    public void sendMessageWithAttachment(String from, String to, String subject, String text, String pathToAttachment);
}
