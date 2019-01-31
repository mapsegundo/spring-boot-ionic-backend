package com.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.cursomc.security.UserSS;

public class UserService {

	//Retorna usuario logado
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
