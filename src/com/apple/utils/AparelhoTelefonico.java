package com.apple.utils;

public class AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	}
	
	public void atender() {
		double numero = Math.floor(Math.random() * 10);
		
		while(true) {
			this.ligar("85858656");
			if(numero >= 5 && numero <= 7) {
				System.out.println("Atendeu");
				break;
			}
		}
		
	}
	
	public String iniciarCorreioDeVoz() {
		return "Iniciando Correio de voz";
	}
	
}
