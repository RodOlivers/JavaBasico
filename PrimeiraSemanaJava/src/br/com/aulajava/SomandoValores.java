package br.com.aulajava;

public class SomandoValores {

	public static void main(String[] args) {
		/*
		 * Informar 2 valores e realizar a soma de ambos
		 * e apresentar o resultado da seguinte forma:
		 * 
		 * "valor1 + valor2 = soma"
		 * 
		 * Com System.out.println();
		 * 
		 * Quando valor1 for maior que o valor2, Some + 2 ao valor da soma
		 * 
		 * Quando o valor1 for menor que o valor2 diminua -5 do valor da soma
		 * 
		 * Imprimir "Ocorreu um ajuste no valor da soma já que
		 * 
		 * valor1 > valor2
		 * valor1 < valor2"
		 * 
		 */

		int valor1 = 1;
		int valor2 = 4;
		String mensagem = "Ocorreu um ajuste no valor da soma já que ";
		boolean eMaior = false;
		
		int soma = valor1 + valor2;
		
		//uso do if
		
		System.out.println(valor1 > valor2);
		
		if (valor1 > valor2) {  
		
		soma = soma + 2 ; //pode-se usar também soma += 2
		eMaior = true;
		
		//System.out.println (" Ocorreu um ajuste no valor da soma já que valor1 > valor2 ");
			
		} else if (valor1 < valor2) {
			
			soma = soma - 5; //pode-se usar também soma -= 5
			
		//System.out.println (" Ocorreu um ajuste no valor da soma já que valor1 < valor2 ");
			
		}
		

		System.out.println(("" + valor1).concat(" + " + valor2).concat(" = " + soma));
		
		//correção forma 1: if e else tradicional
		
/*		if (eMaior) {
			System.out.println(mensagem.concat(""+valor1).concat(" > ").concat(""+ valor2));
		} else {
			System.out.println(mensagem.concat(""+valor1).concat(" < ").concat("")+ valor2);
		}
*/
		// correção forma 2: if ternário
		System.out.println(mensagem
				.concat(""+ valor1)
				.concat(eMaior ? " > " : " < ") //aqui foi o usa do o if ternario
				.concat("" + valor2)); 
		
		// ? = se o resultado do if for true use "essa opção" e o : = funciona como o else do ?
	}

}
