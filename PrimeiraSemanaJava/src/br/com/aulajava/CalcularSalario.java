/**
 * 
 */
package br.com.aulajava;

/**
 * @author Rodrigo
 *
 */
public class CalcularSalario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Informem 2 valores do tipo float.
		// 1� valor � o salario base
		// 2� valor � o total das vendas
		// Apresentar salario final =  valor do salario + commiss�o que representa 10% do valor das vendas

		float salario = 1000;
		float totalVendas = 500;
		float comissao;
		float salarioFinal;
		
		comissao = totalVendas * 0.1f;
		
		salarioFinal = salario + comissao;
		
		System.out.println("O sal�rio final � = " + salarioFinal);

	}

}
