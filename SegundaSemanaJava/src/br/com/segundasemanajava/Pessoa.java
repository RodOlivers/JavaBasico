/**
 * 
 */
package br.com.segundasemanajava;

/**
 * @author Rodrigo
 *
 */


	public class Pessoa extends ClassePadrao  {

		private Float peso;
		private Character sexo;
		
		//metodo contrutor executa ao Criar uma instancia da classe
		public Pessoa () {
			super();			
		}
		
		public Pessoa(String nome, Float peso, Character sexo) {
			super();
			this.nome = nome;
			this.peso = peso;
			this.sexo = sexo;
		}
		
		@Override
		public String getNome() {
			return "Pessoa: " + this.nome;
		}
		
		public Float getPeso() {
			return peso;
		}
		
		public void setPeso(Float peso) {
			this.peso = peso;
		}
		
		public Character getSexo() {
			return sexo;
		}
		
		public void setSexo(Character sexo) {
			this.sexo = sexo;
		}
		
		
//		public Pessoa setNome(String nome) {
//		this.nome = nome;
//		return this;
//		}
		
//		public Pessoa setPeso(Float peso) {
//		this.peso = peso;
//		return this;
//		}
		
//		public Pessoa setSexo(Character sexo) {
//			this.sexo = sexo;
//			return this;
//		}

}
