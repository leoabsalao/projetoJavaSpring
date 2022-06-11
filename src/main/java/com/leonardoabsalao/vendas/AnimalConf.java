package com.leonardoabsalao.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConf {
   
	@Bean(name="cachorro")
	public Animal cachorro() {
		return new Animal() {
			@Override
			public void fazerBarulho() {
				// TODO Auto-generated method stub
				System.out.println("Au Au");
			}
		};
	}
	
	@Bean(name="gato")
	public Animal gato() {
		return new Animal() {
			@Override
			public void fazerBarulho() {
				// TODO Auto-generated method stub
				System.out.println("Miau Miau");
			}
		};
	}
	
	
}
