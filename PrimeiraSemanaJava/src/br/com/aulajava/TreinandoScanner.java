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
		
		// 5- crie uma condição de repetição (usando while)
		//++ é o mesmo que somar +1
		//-- é o mesmo que subtrair -1
		
		while (peso < 3 ) {
			
			peso++;
		} */
		
		/*
		 * 6- Adicione a cadeia de código que criamos em uma estrutura while enquanto o valor de controle for "C"
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
				
			System.out.printf("Meu nome é: %s \n Minha idade é %d \n e Meu peso é: %.2f", nome, idade, peso);
			break;
			}

		/*
		 * 2- Agora exibir da seguinte forma: 
		 * Meu nome é ... 
		 * Minha idade é ... 
		 * Meu peso é ...
		 */

		/*
		 * System.out.println("Meu nome é: " + nome);
		 * System.out.println("Minha idade é: " + idade);
		 * System.out.println("Meu peso é: " + peso);
		 */

		// Imprimindo usando printf, com essa função basta declarar o tipo do atributo e indicar qual variavel vai ser impressa
		// \n = pula linha, não é usado no System.out.println, pois o final 'ln' já pula linha
/*
		System.out.printf("Meu nome é: %s \n", nome); // %s é usado para imprimir string
		System.out.printf("Minha idade é %d \n", idade); // %d é usado para int
		System.out.printf("Meu peso é: %.2f \n", peso); // %f é usado para float, usando %.2f limita a mostrar 2 casas decimais
*/
		// Pode se obter o mesmo resultado fazendo em uma linha da seguinte forma:
		// System.out.printf("Meu nome é: %s \n Minha idade é %d \n e Meu peso é: %.2f", nome, idade, peso);

		/*
		 * 3- realize um teste if: 
		 * Caso peso seja maior que 80 imprimir: "Você precisa correr mais." 
		 * Caso o peso seja menor que 80: "Coma mais carboidratos."
		 */

//		if (peso > 80 ) {
//			System.out.println("Você precisa correr mais.");
//		} else {
//			System.out.println("Coma mais carboidratos.");
//		}

		// if - operadores
		// if (true && true) = && le-se como "e" = verifica se as 2 condições são verdadeiras, caso sejam, retorna true
		// if (true || true) = || le-se como "ou" = verifica se uma das condições é verdadeira, caso seja, retorna true

	/*	if ((peso > 80 && idade > 40) || nome.equals("Roger")) {
			System.out.println("Você precisa correr mais.");
		} else {
			System.out.println("Coma mais carboidratos.");
		} */

		/*
		 * ! = sinal de negação, nega o booleano, exemplo: !true = false ou !false = true
		 * equals = objeto.equals("valor x") - usa-se quando quer ver se o que foi atribuido a um objeto tem um "valor x" esperado
		 */

		// switch case = serve para testar valores de uma variavel e executar uma ação
		// caso o valor seja verdadeiro
		// assim que o primeiro bloco da condição satisfazer o case ele para a execução
		// caso tenha o comando break
		// é limitado a entrada de inteiros
	/*	switch (idade) {
		case 80:
			System.out.println("Você é um senhor com 80 anos e muita saúde!");
			break;

		case 40:
			System.out.println("Você é um jovem adulto com 40 anos!");
			break;

		default:
			System.out.println("Você é um ser vivo bem legal eu espero");
			break;
		} */

//		verificaIdadeEPeso(peso, idade, nome); // invocando o metodo verificaIdade dentro do metodo main
//		verificaIdadeComSwitch(idade); // invocando o metodo verificaIdadeComSwitch dentro do metodo main
		
	} //fim do metodo main

	/*
	 * 4- crie um metodo verificaIdade (peso,idade,nome) dentro dessa classe
	 * TreinandoScanner, usando o que foi visto até aqui
	 */

	// criando o metodo (sempre fora da chave do main, que já é um método)
	public static void verificaIdadeEPeso(float peso, int idade, String nome) {
		if ((peso > 80 && idade > 40) || nome.equals("Roger")) {
			System.out.println("Corre mais (metodo aqui)");
		} else {
			System.out.println("Come mais (metodo aqui)");
		}
	}

	// criando o metodo (sempre fora da chave do main, que já é um método)
	public static void verificaIdadeComSwitch(int idade) {

		switch (idade) {
		case 80:
			System.out.println("Você tem 80 anos! (metodo aqui)");
			break;

		case 40:
			System.out.println("Você tem 40 anos!(metodo aqui)");
			break;

		default:
			System.out.println("Você é um ser vivo! (metodo aqui)");
			break;
		}

	}
	
	
}
