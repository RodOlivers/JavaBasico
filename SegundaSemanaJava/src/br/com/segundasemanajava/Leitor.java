/**
 * 
 */
package br.com.segundasemanajava;

import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class Leitor {

	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.next();
	}
	
	public static Integer lerValor(String pergunta, Scanner sc, Integer valor) {
		System.out.println(pergunta);
		return sc.nextInt();
	}
	
	public static void limparConsole() {
		try {

			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {
			System.out.println("Erro....");
		}

	}

}
