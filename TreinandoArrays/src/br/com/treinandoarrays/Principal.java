/**
 * 
 */
package br.com.treinandoarrays;
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
							// 0		1		2		  3		    4
		String [] nomes = {"Marcus","Renata","Janaína","Patrícia","Samuel"};
		
		int [] idades = {10,20,30,40,50};
		
		//Array vão de 0 ... n (vai ate 4 no caso dos nomes
		//Imprima idade e nome percorrendo os arrays
		//lembrando: .length é o tamanho do array
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes [i] + " tem " + idades [i]);
		}		
		
		//Altere os valores dos nomes das posiçoes pares utilizando array [posicao] = valor;
		//lembre-se de usar  scanner
		Scanner sc = new Scanner (System.in);
		int controle = 0;
		for (String nome : nomes) {
			
			if (controle % 2 == 0) {
				System.out.println("O nome " + nome + " está sendo alterado, informe o novo valor");
				nome = sc.nextLine();
				System.out.println(nome);
				nomes[controle] = nome;
			}
			controle++;
		}		
		//Altere os valores das idades das posiçoes ímpares utilizando array [posicao] = valor;
		//lembre-se de usar  scanner
		controle = 0;
		for (int idade : idades) {
			
			if (controle % 2 != 0) {
				System.out.println("A idade " + idade + " está sendo alterada, informe o novo valor");
				idade = sc.nextInt();
				System.out.println(idade);
				idades[controle] = idade;
			}
			controle++;
		}	
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes [i] + " tem " + idades [i]);
		}
		
	}

}
