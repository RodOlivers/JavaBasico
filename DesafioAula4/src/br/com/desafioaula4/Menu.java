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

//	Impressora i = new Impressora (); //declaração da classe impressora para poder usar o metodo dela
	//CORREÇÃO: não era necessário instanciar a classe impressora, pois o metodo dela é estatico
	
	public static void main(String[] args) {
		//ctrl + shift + o
		//1- Faça uma alteração nesso codigo para que o menu só saia quando a opção informada for 0
		
		Scanner sc = new Scanner(System.in);
		

		int escolha;
		Opcoes opcoes = new Opcoes (); //declaração da classe opcoes para poder usar os metodos dela
		
		int idade = 0;
		/* Quando a idade ainda não tiver sido informada e entrarem na opção 3
		 * imprima "É necessário informar a idade na opção 2" e não execute o código da opção 2
		 * 
		 * retorne a idade da opção 2 e atribua o valor a variavel idade da classe Menu
		 */
		
		
		do {
			escolha = escolherOpcao(sc);
			switch (escolha) {
			case 1:
				opcoes.selecionarOpcao1();
			break; //usado para que ele não siga para as outras opções
			
			case 2:
				opcoes.selecionarOpcao2();
			break;
				
			case 3:
				opcoes.selecionarOpcao3(idade);			
			break;
			case 0:
				break;
			
			default:
				Impressora.imprimaValor("Você não selecionou uma opção valida!");
				break; //add na correção, usado quando não há uma entrada de valores dentro dos casos
				}
		}	while (escolha != 0);
			
	}
	
	public static int escolherOpcao (Scanner sc) { //metodo criado para substituir a repetição do imprimaValor
		Impressora.imprimaValor("Escolha um número de 1 a 3, ou 0 para sair");
		return sc.nextInt();
	}

}
