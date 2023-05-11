package com.apple;
import com.apple.utils.AparelhoTelefonico;
import com.apple.utils.NavegadorDeInternet;
import com.apple.utils.ReprodutorMusical;

public class Telefone {
	
	private ReprodutorMusical reprodutorMusical;
	private NavegadorDeInternet navegador;
	private AparelhoTelefonico aparelho;
	public Telefone() {
		this.reprodutorMusical = new ReprodutorMusical();
		this.navegador = new NavegadorDeInternet();
		this.aparelho = new AparelhoTelefonico();
	}
	public ReprodutorMusical getReprodutorMusical() {
		return reprodutorMusical;
	}
	public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
		this.reprodutorMusical = reprodutorMusical;
	}
	public NavegadorDeInternet getNavegador() {
		return navegador;
	}
	public void setNavegador(NavegadorDeInternet navegador) {
		this.navegador = navegador;
	}
	public AparelhoTelefonico getAparelho() {
		return aparelho;
	}
	public void setAparelho(AparelhoTelefonico aparelho) {
		this.aparelho = aparelho;
	}
	

}
