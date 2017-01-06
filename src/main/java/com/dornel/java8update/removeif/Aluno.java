package com.dornel.java8update.removeif;

public class Aluno {
	private String nome;
	private double nota;
	private boolean aprovado = false;
	
	public Aluno(String nome, double nota){
		this.nome = nome;
		this.nota = nota;
		
	}
	
	public String getNome(){return nome;}
	public double getNota(){return nota;}
	public boolean isAprovado(){return aprovado;}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setNota(double pontos){
		this.nota = pontos;
	}
	public void tornarAprovado(){
		this.aprovado = true;
	}
}
