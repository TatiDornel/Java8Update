package com.dornel.java8update.lambda;

public class Usuario {
	private String nome;
	private int pontos;
	private boolean moderador = false;
	
	public Usuario(String nome, int pontos){
		this.nome = nome;
		this.pontos = pontos;
		
	}
	
	public String getNome(){return nome;}
	public int getPontos(){return pontos;}
	public boolean isModerador(){return moderador;}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPontos(int pontos){
		this.pontos = pontos;
	}
	public void tornarModerador(){
		this.moderador = true;
	}
}
