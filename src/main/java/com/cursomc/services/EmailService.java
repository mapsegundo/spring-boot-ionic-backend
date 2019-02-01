package com.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.cursomc.domain.Cliente;
import com.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
	void sendOrderConfirmationEmailHtml(Pedido obj);
	void sendEmailHtml(MimeMessage msg);
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
