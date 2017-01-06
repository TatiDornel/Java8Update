package com.dornel.java8update.lambda;

import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String... args){
		Usuario user1 = new Usuario("Tatiana", 10);
		Usuario user2 = new Usuario("Maria", 20);
		Usuario user3 = new Usuario("Thaty Mary", 30);
		List<Usuario> lUsuarios = Arrays.asList(user1,user2,user3);
		

		lUsuarios.forEach(u -> System.out.println(u.getNome()));
		
		//lUsuarios.forEach(u -> u.tornarModerador());
		
		
		lUsuarios.forEach(u -> {
			u.tornarModerador();
			System.out.println(u.getNome());
		});
	}
}
