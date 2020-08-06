package com.bip.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bip.api.security.repositories.UsuarioRepository;

@SpringBootApplication
public class BipCompanyApplication {
	
	//@Value("${paginacao.qtd_por_pagina}")
	//private int intQtdPorPagina;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(BipCompanyApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Entrei no CommandLineRunner");
			/*Usuario usuario = new Usuario();
			usuario.setEmail("usuario@email.com");
			usuario.setProfile(PerfilEnum.ROLE_USUARIO);
			usuario.setPassword(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(usuario);
			
			Usuario admin = new Usuario();
			admin.setEmail("admin@email.com");
			admin.setProfile(PerfilEnum.ROLE_ADMIN);
			admin.setPassword(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(admin);*/
			
		};
	}
}
