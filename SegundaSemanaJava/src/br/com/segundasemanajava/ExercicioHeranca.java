package br.com.segundasemanajava;

import java.util.ArrayList;

public class ExercicioHeranca {
	
	public static void main (String [] args) {
		
		ArrayList<Animal> arrayListAnimais = new ArrayList<>();
		
		Gato g = new Gato();
		arrayListAnimais.add(new Cachorro());
		arrayListAnimais.add(new Galinha());
		arrayListAnimais.add(g);
		
		for (Animal a : arrayListAnimais) {

		}		
		arrayListAnimais.forEach(data -> {
			data.setIdade(10);
			data.dizerOla();
		});
		for (int i = 0; i < arrayListAnimais.size(); i++) {
			if (arrayListAnimais.get(i) instanceof Gato) {
				arrayListAnimais.remove(arrayListAnimais.get(i));
				i--;
			}
			System.out.println(arrayListAnimais.get(i).getNome());
		}
	
		// instanceof é usado para comparação de tipos (aquele objeto em si)
		// equals é usado para comparar todo o valor
		
//		Gato g = new Gato();
//		Cachorro c = new Cachorro();
//		Galinha gal = new Galinha();
//		Animal a = new Galinha();
//		Animal ac = new Cachorro();
//		
//		g.dizerOla();
//		c.dizerOla();
//		gal.dizerOla();
//		a.dizerOla();
//		ac.dizerOla();
		
//		Pessoa p = new Pessoa ();
//		Livro l = new Livro();
//		p.setNome("Pessoa");
//		l.setNome("Livro");
//		System.out.println(p.getNome());
//		System.out.println(l.getNome());
	}

}
