package com.dornel.java8update.interfacefuncional;

public class Solution {
	
	public static void main(String... args){
		
		Validador<String> cepValidador = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(cepValidador.validar("94955-kkk"));
		System.out.println(cepValidador.validar("94955-900"));
		System.out.println(cepValidador.removeMask("94955-900"));
		
	//==========
		
		Runnable o = () -> {
			System.out.println("O que sou eu? Que lambda?");
			};
			o.run();
			System.out.println(o);
			System.out.println(o.getClass());
	///=============
		final int numero = 5;
		new Thread(() -> {
		System.out.println(numero); // não compila
		}).start();
		//numero = 10; // por causa dessa linha!

			
			
		
	}
}
