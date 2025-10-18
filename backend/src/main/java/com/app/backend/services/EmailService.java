package com.app.backend.services;

public interface EmailService {
    public void sendMessage(String from, String to, String subject, String text);

}
