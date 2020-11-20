package br.com.segundasemanajava;

public class Galinha extends Animal {
	
	private Float alturaDoPoleiro;
	
	public Float getAlturaDoPoleiro() {
		return alturaDoPoleiro;
	}

	public void setAlturaDoPoleiro(Float alturaDoPoleiro) {
		this.alturaDoPoleiro = alturaDoPoleiro;
	}
	
	@Override
	public void dizerOla () {
		System.out.println("Olá, eu sou um Galinha!");
	}
}
