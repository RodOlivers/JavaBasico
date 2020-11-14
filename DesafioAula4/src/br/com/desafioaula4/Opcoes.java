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
	
//	Impressora i = new Impressora(); //declaração da classe impressora para poder usar o metodo dela
//CORREÇÃO: não era necessário instanciar a classe impressora, pois o metodo dela é estatico	
//CORREÇÃO: dica = não era preciso que os metodos fossem todos "static", já que por conta disso o Scanner sc
//			teve que ser repetido 3 vezes dentro de cada metodo dessa classe. Com o Scanner sc fora,
//			basta os metodos não serem estaticos, ou seja public void seleccionarOpcaoX()
	
	Scanner sc = new Scanner (System.in);
	
	public  void selecionarOpcao1() {
		
		//aproveite esse trecho e crie um metodo
		//dica: pode-se usar o "Extract Method" do eclipse para gerar um metodo de um trecho
				
		String animal;
//			if (animal.equals("Gato")) {
//			Impressora.imprimaValor("Que legal! O meu também!");
//			} else {
				do {
					animal = lerAnimal();
					Impressora.imprimaValor("Eu prefiro Gato");
				}	while (!animal.toLowerCase().equals("gato") );//usado o ! para ter o efeito contrario do .equals
					Impressora.imprimaValor("Que legal! O meu também!");
		}

//			} CORREÇÃO: não era necessario o uso do if, apenas o while
	
	public String lerAnimal() {
		Impressora.imprimaValor("Qual seu animal preferido?");
		return sc.nextLine();
	}
	
	public int selecionarOpcao2() {		
		
		Impressora.imprimaValor("Qual a idade do seu filho?");
		int idade = sc.nextInt();
		
		if (idade > 0 && idade < 12) {			
			Impressora.imprimaValor("Ele ainda é uma criança!");			
		} else if (idade > 11 && idade < 19) {			
			Impressora.imprimaValor("Adolescência é fogo...");
		} else {
			Impressora.imprimaValor("Ele já é um adulto!");
		}
		return idade;
		
	}

	public void selecionarOpcao3(int idade) {

		if (idade == 0) {
			Impressora.imprimaValor("É necessário informar a idade na opção 2");
		} else {

			for (int i = 0; i < idade; i++) {
				Impressora.imprimaValor(i + "...");

			}
			Impressora.imprimaValor(idade + "são tantos anos...");
		}
	}
} 
