/**
 * 
 */
package br.com.terceiro.util;

import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class Leitor {

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
	
	public static void limparTela() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	public static String lerValor(String pergunta, Scanner sc) {
		System.out.print(pergunta);
		return sc.nextLine();  
	}

	public static Float lerValor(String pergunta, Scanner sc, Float valor) {
		System.out.print(pergunta);
		return Float.parseFloat(sc.nextLine());
	}

	public static Integer lerValor(String pergunta, Scanner sc, Integer valor) {
		System.out.print(pergunta);
		return Integer.parseInt(sc.nextLine());
	}

	public static Character lerValor(String pergunta, Scanner sc, Character valor) {
		System.out.print(pergunta);
		String retorno = sc.nextLine();
		return retorno.charAt(0);
	}

	public static Boolean lerValor(String pergunta, Scanner sc, Boolean b) {
		String retorno = "";
		do {
			System.out.print(pergunta);
			retorno = sc.nextLine();
		} while (!retorno.toUpperCase().equals("SIM") && !retorno.toUpperCase().equals("NAO"));
		if (retorno.toUpperCase().equals("SIM")) {
			return true;
		} else {
			return false;
		}
	}

	public static Long lerValor(String pergunta, Scanner sc, Long l) {
		System.out.println(pergunta);
		return Long.parseLong(sc.nextLine());
	}

}