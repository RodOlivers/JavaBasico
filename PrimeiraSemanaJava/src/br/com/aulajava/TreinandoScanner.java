/**
 * 
 */
package br.com.aulajava;

import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class TreinandoScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1- Crie um programa que leia seu/sua: 
		 * String nome; 
		 * int idade; 
		 * float peso:
		 * 
		 */

		/* Scanner sc = new Scanner(System.in);

		System.out.println("Insira seu nome:");
		String nome = sc.nextLine();
		System.out.println("Insira sua idade:");
		int idade = sc.nextInt();
		System.out.println("Insira seu peso:");
		float peso = sc.nextFloat();
		
		// 5- crie uma condi��o de repeti��o (usando while)
		//++ � o mesmo que somar +1
		//-- � o mesmo que subtrair -1
		
		while (peso < 3 ) {
			
			peso++;
		} */
		
		/*
		 * 6- Adicione a cadeia de c�digo que criamos em uma estrutura while enquanto o valor de controle for "C"
		 */
			
			String controle = "C"; 
			Scanner sc = new Scanner(System.in);
			while (controle.equals("C")) {
				
				System.out.println("Informe seu nome:");
				String nome = sc.nextLine();
				System.out.println("Informe sua idade:");
				int idade = sc.nextInt();
				System.out.println("Informe seu peso:");
				float peso = sc.nextFloat();
				
			System.out.printf("Meu nome �: %s \n Minha idade � %d \n e Meu peso �: %.2f", nome, idade, peso);
			break;
			}

		/*
		 * 2- Agora exibir da seguinte forma: 
		 * Meu nome � ... 
		 * Minha idade � ... 
		 * Meu peso � ...
		 */

		/*
		 * System.out.println("Meu nome �: " + nome);
		 * System.out.println("Minha idade �: " + idade);
		 * System.out.println("Meu peso �: " + peso);
		 */

		// Imprimindo usando printf, com essa fun��o basta declarar o tipo do atributo e indicar qual variavel vai ser impressa
		// \n = pula linha, n�o � usado no System.out.println, pois o final 'ln' j� pula linha
/*
		System.out.printf("Meu nome �: %s \n", nome); // %s � usado para imprimir string
		System.out.printf("Minha idade � %d \n", idade); // %d � usado para int
		System.out.printf("Meu peso �: %.2f \n", peso); // %f � usado para float, usando %.2f limita a mostrar 2 casas decimais
*/
		// Pode se obter o mesmo resultado fazendo em uma linha da seguinte forma:
		// System.out.printf("Meu nome �: %s \n Minha idade � %d \n e Meu peso �: %.2f", nome, idade, peso);

		/*
		 * 3- realize um teste if: 
		 * Caso peso seja maior que 80 imprimir: "Voc� precisa correr mais." 
		 * Caso o peso seja menor que 80: "Coma mais carboidratos."
		 */

//		if (peso > 80 ) {
//			System.out.println("Voc� precisa correr mais.");
//		} else {
//			System.out.println("Coma mais carboidratos.");
//		}

		// if - operadores
		// if (true && true) = && le-se como "e" = verifica se as 2 condi��es s�o verdadeiras, caso sejam, retorna true
		// if (true || true) = || le-se como "ou" = verifica se uma das condi��es � verdadeira, caso seja, retorna true

	/*	if ((peso > 80 && idade > 40) || nome.equals("Roger")) {
			System.out.println("Voc� precisa correr mais.");
		} else {
			System.out.println("Coma mais carboidratos.");
		} */

		/*
		 * ! = sinal de nega��o, nega o booleano, exemplo: !true = false ou !false = true
		 * equals = objeto.equals("valor x") - usa-se quando quer ver se o que foi atribuido a um objeto tem um "valor x" esperado
		 */

		// switch case = serve para testar valores de uma variavel e executar uma a��o
		// caso o valor seja verdadeiro
		// assim que o primeiro bloco da condi��o satisfazer o case ele para a execu��o
		// caso tenha o comando break
		// � limitado a entrada de inteiros
	/*	switch (idade) {
		case 80:
			System.out.println("Voc� � um senhor com 80 anos e muita sa�de!");
			break;

		case 40:
			System.out.println("Voc� � um jovem adulto com 40 anos!");
			break;

		default:
			System.out.println("Voc� � um ser vivo bem legal eu espero");
			break;
		} */

//		verificaIdadeEPeso(peso, idade, nome); // invocando o metodo verificaIdade dentro do metodo main
//		verificaIdadeComSwitch(idade); // invocando o metodo verificaIdadeComSwitch dentro do metodo main
		
	} //fim do metodo main

	/*
	 * 4- crie um metodo verificaIdade (peso,idade,nome) dentro dessa classe
	 * TreinandoScanner, usando o que foi visto at� aqui
	 */

	// criando o metodo (sempre fora da chave do main, que j� � um m�todo)
	public static void verificaIdadeEPeso(float peso, int idade, String nome) {
		if ((peso > 80 && idade > 40) || nome.equals("Roger")) {
			System.out.println("Corre mais (metodo aqui)");
		} else {
			System.out.println("Come mais (metodo aqui)");
		}
	}

	// criando o metodo (sempre fora da chave do main, que j� � um m�todo)
	public static void verificaIdadeComSwitch(int idade) {

		switch (idade) {
		case 80:
			System.out.println("Voc� tem 80 anos! (metodo aqui)");
			break;

		case 40:
			System.out.println("Voc� tem 40 anos!(metodo aqui)");
			break;

		default:
			System.out.println("Voc� � um ser vivo! (metodo aqui)");
			break;
		}

	}
	
	
}
