package com.dornel.java8update.removeif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.dornel.java8update.lambda.Usuario;

public class Solution {

	public static void main(String...args){
		
		Aluno a1 = new Aluno("Tatiana", 10);
		Aluno a2 = new Aluno("Maria", 9);
		Aluno a3 = new Aluno("Thaty Mary", 4);
//		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		Predicate<Aluno> predicado = new Predicate<Aluno>() {
 		 	public boolean test(Aluno u) {
 		 		return u.getNota()<7;
 		 	}
 		 };		
		alunos.removeIf(predicado);		
		alunos.forEach(u -> System.out.println(u.getNome()));		
		System.out.println("====================");
		alunos.removeIf(u -> u.getNota() <= 9);		
		alunos.forEach(u -> System.out.println(u.getNome()));
		
		
	}
	
}
