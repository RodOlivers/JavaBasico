/**
 * 
 */
package br.com.desafioaula4;

import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class Opcoes {
	
	Impressora i = new Impressora(); //declaração da classe impressora para poder usar o metodo dela
	
	
	public static void selecionarOpcao1() {
		
		Scanner sc = new Scanner (System.in);
				
		Impressora.imprimaValor ("Qual seu animal preferido?");
		String animal = sc.nextLine();
			
			if (animal.equals("Gato")) {
			Impressora.imprimaValor("Que legal! O meu também!");
			} else {
				while (!animal.equals("Gato") ) { //usado o ! para ter o efeito contrario do .equals
					Impressora.imprimaValor("Eu prefiro Gato");
					Impressora.imprimaValor ("Qual seu animal preferido?");
					animal = sc.nextLine(); //usando a mesma variavel para usar no while
				}
			Impressora.imprimaValor("Que legal! O meu também!");
			}
	}
	
	public static void selecionarOpcao2() {
		
		Scanner sc = new Scanner (System.in);
		
		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idade = sc.nextInt();
		
		if (idade > 0 && idade < 12) {			
			Impressora.imprimaValor("Ele ainda é uma criança!");			
		} else if (idade > 11 && idade < 19) {			
			Impressora.imprimaValor("Adolescência é fogo...");
		} else {
			Impressora.imprimaValor("Ele já é um adulto!");
		}
		
	}

	public static void selecionarOpcao3() {
		
		Impressora.imprimaValor("Em construção... \nSerá que vamos aprender a usar o 'for'?");
				
	}

}
