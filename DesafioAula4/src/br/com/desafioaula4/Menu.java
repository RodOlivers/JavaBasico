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

//	Impressora i = new Impressora (); //declara��o da classe impressora para poder usar o metodo dela
	//CORRE��O: n�o era necess�rio instanciar a classe impressora, pois o metodo dela � estatico
	
	public static void main(String[] args) {
		//ctrl + shift + o
		//1- Fa�a uma altera��o nesso codigo para que o menu s� saia quando a op��o informada for 0
		
		Scanner sc = new Scanner(System.in);
		

		int escolha;
		Opcoes opcoes = new Opcoes (); //declara��o da classe opcoes para poder usar os metodos dela
		
		int idade = 0;
		/* Quando a idade ainda n�o tiver sido informada e entrarem na op��o 3
		 * imprima "� necess�rio informar a idade na op��o 2" e n�o execute o c�digo da op��o 2
		 * 
		 * retorne a idade da op��o 2 e atribua o valor a variavel idade da classe Menu
		 */
		
		
		do {
			escolha = escolherOpcao(sc);
			switch (escolha) {
			case 1:
				opcoes.selecionarOpcao1();
			break; //usado para que ele n�o siga para as outras op��es
			
			case 2:
				opcoes.selecionarOpcao2();
			break;
				
			case 3:
				opcoes.selecionarOpcao3(idade);			
			break;
			case 0:
				break;
			
			default:
				Impressora.imprimaValor("Voc� n�o selecionou uma op��o valida!");
				break; //add na corre��o, usado quando n�o h� uma entrada de valores dentro dos casos
				}
		}	while (escolha != 0);
			
	}
	
	public static int escolherOpcao (Scanner sc) { //metodo criado para substituir a repeti��o do imprimaValor
		Impressora.imprimaValor("Escolha um n�mero de 1 a 3, ou 0 para sair");
		return sc.nextInt();
	}

}
