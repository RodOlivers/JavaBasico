/**
 * 
 */
package br.com.desafioaula4;
import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class Menu {

	Impressora i = new Impressora (); //declaração da classe impressora para poder usar o metodo dela
	Opcoes o = new Opcoes (); //declaração da classe opcoes para poder usar os metodos dela
	
	public static void main(String[] args) {
		//ctrl + shift + o
		Scanner sc = new Scanner(System.in);

		Impressora.imprimaValor("Escolha um número de 1 a 3");
		int numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			Opcoes.selecionarOpcao1();
		break; //usado para que ele não siga para as outras opções
		
		case 2:
			Opcoes.selecionarOpcao2();
		break;
			
		case 3:
			Opcoes.selecionarOpcao3();			
		break;
		}
	}

}
