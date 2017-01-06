package com.dornel.java8update.ordenando;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dornel.java8update.removeif.Aluno;

public class Solution {

	public static void main(String... args) {
		Aluno a1 = new Aluno("Tatiana", 10);
		Aluno a2 = new Aluno("Maria", 9);
		Aluno a3 = new Aluno("Carla Mary", 4);
		Aluno a4 = new Aluno("Fabricio", 9.5);
//		List<Aluno> alunos = Arrays.asList(a1,a2,a3);
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		Comparator<Aluno> comparatoAluno = (al1, al2) -> al1.getNome().compareTo(al2.getNome());
		Collections.sort(alunos, comparatoAluno);
		
		alunos.forEach(u -> System.out.println(u.getNome()));
		
		System.out.println("----");
		Collections.sort(alunos, (al1, al2) -> al2.getNome().compareTo(al1.getNome()));
		alunos.forEach(u -> System.out.println(u.getNome()));
		
		
		System.out.println("----");
		alunos.sort((al1, al2) -> al1.getNota() > al2.getNota() ? -1: 1);
		alunos.forEach(u -> System.out.println(u.getNome()+"-"+u.getNota() ));
		
		System.out.println("----");
		alunos.sort((al1, al2) -> al2.getNota() > al1.getNota() ? -1: 1);
		alunos.forEach(u -> System.out.println(u.getNome()+"-"+u.getNota() ));
		
		System.out.println("----");
		alunos.sort(Comparator.comparing(a -> a.getNome()));
		alunos.forEach(u -> System.out.println(u.getNome()));
		
		System.out.println("----");
		List<String> nomes =
				Arrays.asList("Tatiana", "Carla", "Fernanda");
		
		nomes.sort(Comparator.naturalOrder());
		nomes.forEach(u -> System.out.println(u));
		
		System.out.println("----");
		
		nomes.sort(Comparator.reverseOrder());
		nomes.forEach(u -> System.out.println(u));
		
	}

}
