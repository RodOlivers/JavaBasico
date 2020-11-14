/**
 * 
 */
package br.com.treinandofor;

import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1- Verifique se uma string tem o tamanho maior que 10 usando o for
		// 2- Imprima caractere a caractere da string
		// 3 - quando a string tiver a letra a, pule 2 caracteres se possivel
//		Scanner sc = new Scanner (System.in);
//		String texto = sc.nextLine();
//
//		for (int i = 0; i < texto.length(); i++ ) {
//			
//			if (i == 8) {
//				System.out.println("O tamanho da String é maior que 10");
//			}
//			System.out.println(texto.substring(i, (i + 1)));
//			if (texto.substring(i, (i + 1)).toLowerCase().equals("a")
//					&& (i +2) < texto.length()) {
//				i = i + 2;
//			}
//		}
		
//		String textob = "Marcus, Fabiano, Icaro, Renata";
//		
//		String [] nomes = textob.split(", ");
//		for (String i : nomes) {
//			System.out.println(i);
//		}
		
		System.out.println("Digite uma String:");
		Scanner sc = new Scanner (System.in);
		String texto = sc.nextLine();
		
		String [] A = texto.split("a");
		for (String b : A) {
			System.out.println(b);
		}
		
//		for (int i = 0; i < texto.length(); i++ ) {
//			
//			System.out.println(texto.substring(i, (i + 1)));
//			if (texto.substring(i, (i + 1)).toLowerCase().equals("a")
//					&& (i +2) < texto.length()) {
//				i = i + 2;
//			}
//		}
		

	}

}
