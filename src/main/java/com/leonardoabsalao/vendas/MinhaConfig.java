package com.leonardoabsalao.vendas;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MinhaConfig {
	
	@Bean 
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("APLICAÇÃO RODANDO CO SUCESSO.");
		};
	}
}
