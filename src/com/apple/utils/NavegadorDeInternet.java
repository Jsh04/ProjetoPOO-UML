package com.apple.utils;

import java.util.LinkedList;
import java.util.List;

public class NavegadorDeInternet {

	private List<String> listaDeAbas = new LinkedList<>();
	
	public String exibirAba(String aba) {
		String abaRetorna = listaDeAbas.stream().filter(x -> x.equals(aba)).toList().get(0);
		return "Exibindo " + abaRetorna;
	}
	
	public void adicionarAba(String aba) {
		listaDeAbas.add(aba);	
	}
	
	public void atualizaPagina(String aba) {
		System.out.println("Atualizando a página");
		this.exibirAba(aba);
	}
	
	
	
	
}
