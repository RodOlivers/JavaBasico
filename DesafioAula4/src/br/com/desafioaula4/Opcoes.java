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
	
	Impressora i = new Impressora(); //declara��o da classe impressora para poder usar o metodo dela
	
	
	public static void selecionarOpcao1() {
		
		Scanner sc = new Scanner (System.in);
				
		Impressora.imprimaValor ("Qual seu animal preferido?");
		String animal = sc.nextLine();
			
			if (animal.equals("Gato")) {
			Impressora.imprimaValor("Que legal! O meu tamb�m!");
			} else {
				while (!animal.equals("Gato") ) { //usado o ! para ter o efeito contrario do .equals
					Impressora.imprimaValor("Eu prefiro Gato");
					Impressora.imprimaValor ("Qual seu animal preferido?");
					animal = sc.nextLine(); //usando a mesma variavel para usar no while
				}
			Impressora.imprimaValor("Que legal! O meu tamb�m!");
			}
	}
	
	public static void selecionarOpcao2() {
		
		Scanner sc = new Scanner (System.in);
		
		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idade = sc.nextInt();
		
		if (idade > 0 && idade < 12) {			
			Impressora.imprimaValor("Ele ainda � uma crian�a!");			
		} else if (idade > 11 && idade < 19) {			
			Impressora.imprimaValor("Adolesc�ncia � fogo...");
		} else {
			Impressora.imprimaValor("Ele j� � um adulto!");
		}
		
	}

	public static void selecionarOpcao3() {
		
		Impressora.imprimaValor("Em constru��o... \nSer� que vamos aprender a usar o 'for'?");
				
	}

}
