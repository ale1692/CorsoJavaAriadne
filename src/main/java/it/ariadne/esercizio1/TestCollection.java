package it.ariadne.esercizio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestCollection {

	public static void main(String[] args) {

		// List<Persona> lista = new ArrayList<>();
		// // int stack
		// // lista heap
		//
		// Persona [] prs= { new Persona("C"),new Persona("B") };
		//
		// int [] vector = {1,2,4};
		//
		// int [][] matrix = {
		//
		// {1,2},
		// {2,3},
		// {4,5}
		// };
		//
		//
		// vector[0]=5; //non posso aggiungere un nuovo elemento

		List<Persona> lista = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String[] splitstr = input.split(" ");
		System.out.println("Numero di persone: " + splitstr.length);

		for (int i = 0; i < splitstr.length; i++) {
			lista.add(new Persona(splitstr[i]));
		}

		Collections.sort(lista);
		HashMap <String, Persona> elenco = new HashMap<>();
		lista.forEach(p -> elenco.put(p.getNome(), p));
		
		Map <String, Persona> mappa2=new TreeMap<>();
		
		for (Iterator iterator = mappa2.keySet().iterator(); iterator.hasNext();) {
			String persona = (String) iterator.next();
			System.out.println("Nome: " + persona);
		}
		
		// lambda expression dato un elemento p (è di tipo persona perchè viene dalla
		// mia lista)
		//lista.forEach(p -> System.out.println(p.getNome()));

		// int i=0; //unboxed
		// Integer i1=new Integer(i); //boxed
		// Integer azz=null;
		//
		// //int somma=i1.intValue() +1;
		// int somma=i1 +1; //unboxing overhead
		//

	}
}

class Persona implements Comparable {

	String nome;
	String cognome;
	
	public Persona(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}


	@Override
	public int compareTo(Object p) {
		
		//invertito segno
		return ((Persona) p).getNome().compareTo(this.nome)*-1;
	}
}
