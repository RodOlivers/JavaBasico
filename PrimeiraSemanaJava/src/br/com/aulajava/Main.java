package br.com.aulajava;

public class Main {
	
	public static void main (String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println(c.realizarMultiplicacao(10));
		
		System.out.println(c.realizaSoma(10));
		
		System.out.println(Calculadora.valorPadraoSomaInteiro);
		
		byte b = 100;
		short s = 32; //  - 32000  at� 32000
		int i = 30; // - 2147483648 at� 2147483648
		long l  = 20l;//  - 9223372036854775808 at�  9223372036854775808 
		float f = 10.3443f;  //  6 
		double d = 12.343d; // 15
		boolean bol = true; // valores true ou false
		char ch = 70 ;  // 'a' (tabela ASCII)
				System.out.println(ch);
		
	}

}
