package com.apple.utils;

public class ReprodutorMusical {
	
	
	public void tocar(String musica) {
		System.out.println("Tocando musica " + musica);
	}
	
	public void pausar() {
		System.out.println("Pausando");
	}
	
	public String selecionarMusica(String musica) {
		return "Musica " + musica + " selecionada";
	}
}
