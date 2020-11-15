/**
 * 
 */
package br.com.treinandoarrays;

import java.util.Scanner;

/**
 * @author Rodrigo
 *
 */
public class DesafioAula6 {
	
	public static String lerValor(String pergunta, Scanner sc) {
		System.out.println(pergunta);
		return sc.next();
	}
	
	public static float lerValor(String pergunta, Scanner sc, float valor) {
		System.out.println(pergunta);
		return sc.nextFloat();
	}
	
	public static char lerValor(String pergunta, Scanner sc, char valor ) {
		System.out.println(pergunta);
		String retorno = sc.next();
		return retorno.charAt(0);
	}
	
	public static int lerValor(String pergunta, Scanner sc, int valor) {
		System.out.println(pergunta);
		return sc.nextInt();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// crie 3 arrays com 6 posições
		/* primeiro array com nomes (String)
		 * segundo array com peso (float)
		 * terceiro array com sexo (char) [M e F para facilitar
		 * definir o tamanho dos arrays com base na entrada
		 * crie um menu usando o switch com as opções do tipo (1 a 3):
		 * apresentarTodosOsValoresDoArray,
		 * alterarTodoOArray, alterarArrayPosicao
		 * utlize o while para parar o programa somente quando informar o valor 0
		 */
		
		Scanner sc = new Scanner(System.in);
		int tamanho; 
		tamanho = lerValor("Qual o tamanho do array?", sc, 0);
		
		String[] nomes = new String [tamanho];
		float[] pesos = new float [tamanho];
		char[] sexos = new char [tamanho];
		int opcao = 0;
		int nrRegistro;
		
		do {
			opcao = lerValor("Agora escolha uma opção de 1 a 5 ou 0 para sair", sc, opcao);

		switch (opcao) {
		case 0:
			System.out.println("Saindo...");
			break;
		case 1:
			for (int i = 0; i < tamanho; i++) {
				
			System.out.printf("Nome: %s \n", nomes[i]);
			System.out.printf("Peso: %.2f \n", pesos[i]);
			System.out.printf("Sexo: %s \n", sexos[i]);
			
			}
			break;
		case 2:
			for (int i = 0; i < tamanho; i++) {
				System.out.printf("Registro nr %d \n", (i + 1));
				adcionarValorArray (nomes, pesos, sexos, i, sc);
				System.out.println("-----------------------");
				
			}
			break;
		case 3:
			nrRegistro = lerValor("Informe o nr do registro para alteração", sc, 0);
			adcionarValorArray (nomes, pesos, sexos, (nrRegistro - 1), sc);
			
			break;
			 //crie uma opção 4 que irá alterar não o registro todo e sim apenas o que o usuario quiser
		case 4:
			nrRegistro = lerValor("Informe o nr do registro para alteração", sc, 0);
			int campoAlterando = lerValor("Qual opção deseja altera? \n1- nome; \n2- peso; \n3-sexo.", sc, 0);
			adcionarValorArray (nomes, pesos, sexos, (nrRegistro - 1), sc, campoAlterando);
			/*
			 * if (campoAlterando == 1) { nomes[nrRegistro - 1] =
			 * lerValor("Informe seu nome: ", sc); } else if (campoAlterando == 2){
			 * pesos[nrRegistro - 1] = lerValor("Informe seu peso: ", sc,
			 * pesos[nrRegistro]); } else if (campoAlterando == 3) { sexos[nrRegistro - 1] =
			 * lerValor("Informe seu sexo (F/M):: ", sc, sexos[nrRegistro]); }
			 */
			break;
		case 5:
			//imprimir valores por registro
			nrRegistro = lerValor("Informe o nr do registro para impressão", sc, 0);
			
			System.out.printf("Nome: %s \nPeso %.2f\nSexo: %s\n", nomes[nrRegistro - 1], pesos[nrRegistro - 1],
					sexos[nrRegistro - 1]);
		break;
		case 6:
			//imprimir 1 valor de 1 registro
			System.out.println("Informe o nr do registro para impressão");
			nrRegistro = sc.nextInt();
			
			System.out.println("Qual opção deseja imprimir? \n1- nome; \n2- peso; \n3-sexo.");
			int campoImprimindo = sc.nextInt();
			
			if (campoImprimindo == 1) {
				System.out.printf("Nome: %s \n", nomes[nrRegistro]);
				} else if (campoImprimindo == 2){
				System.out.printf("Peso: %.2f \n", pesos[nrRegistro]);
				} else if (campoImprimindo == 3) {
				System.out.printf("Sexo: %s \n", sexos[nrRegistro]);
				}
		break;		
		default:
			System.out.println("Opção inválida");
			break;
			}
		} while (opcao !=0);
		//Utilizando a estrutura, adicione valores dentro de cada posição dos arrays



	}

	private static void adcionarValorArray(String[] nomes, float[] pesos, char[] sexos, int i, Scanner sc) {
		nomes[i] = lerValor("Informe seu nome: ", sc);
		pesos[i] = lerValor("Informe seu peso: ", sc, pesos[i]);
		sexos[i] = lerValor("Informe seu sexo (F/M): ", sc, sexos[i]);
		
	}

	private static void adcionarValorArray(String[] nomes, float[] pesos, char[] sexos, int i, 
			Scanner sc, int campoAlterando) {
		if (campoAlterando == 1) {
			nomes[i] = lerValor("Informe seu nome: ", sc);
		} else if (campoAlterando == 2) {
			pesos[i] = lerValor("Informe seu peso: ", sc, pesos[i]);
		} else if (campoAlterando == 3) {
			sexos[i] = lerValor("Informe seu sexo (F/M):: ", sc, sexos[i]);
		}
	}

}
