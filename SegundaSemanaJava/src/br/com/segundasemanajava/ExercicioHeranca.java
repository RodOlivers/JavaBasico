package br.com.segundasemanajava;

import java.util.ArrayList;

import java.util.Scanner;

import br.com.dao.AnimalDAO;


public class ExercicioHeranca {
	
		public static void main (String [] args) {
		
		AnimalDAO dao = new AnimalDAO();		
		menu(dao);
		
	}	
	
	//faça um programa para ler animais e ao fechar imprimir quantos são cachorros, gatos e galinhas
	public static void menu (AnimalDAO dao) {
		Scanner sc = new Scanner (System.in);
		Integer opcao = 0;
		Integer quantidadeGato = 0;
		Integer quantidadeCachorro = 0;
		Integer quantidadeGalinha = 0;
			do {
				opcao = Leitor.lerValor("0) Sair\n1) Cadastrar \n2)Listar Animais", sc, opcao);
				switch (opcao.intValue()) {
				case 0:
					System.out.println("Saindo...");
					for (Animal a : dao.consultarAnimais()) {
						if (a instanceof Gato) {
							quantidadeGato++;
						} else if (a instanceof Cachorro) {
							quantidadeCachorro++;
						} else if (a instanceof Galinha) {
							quantidadeGalinha++;
						}
					}
					System.out.println("----------------------------");
					System.out.printf("Quantidade de Gatos foi %d \n", quantidadeGato);
					System.out.printf("Quantidade de Cachorro foi %d \n", quantidadeCachorro);
					System.out.printf("Quantidade de Galinha foi %d \n", quantidadeGalinha);
					break;
				case 1:
					dao.cadastrarAnimal(cadastrarAnimal(sc));
					break;
				case 2:
					listarAnimais(dao.consultarAnimais());
					break;
				case 3:
					int testeDeletou = deletarAnimalPorIdentificador(dao, sc);
					if (testeDeletou > 0) {
						System.out.println("Deletado com sucesso!");
					}
					break;
				default:
					break;
				}
			} while (opcao != 0);
	}
	
	private static int deletarAnimalPorIdentificador(AnimalDAO dao, Scanner sc) {

		Long identificador = Leitor.lerValor("Qual o registro deseja deletar ? ", sc, 0L);

		if (identificador > 1) {
			Animal a = dao.buscarAnimal(identificador);
			return dao.deletarAnimal(a);
		}
		return 0;
	}

	private static void listarAnimais(ArrayList<Animal> animais) {

		for (Animal a : animais) {
			if (a instanceof Gato) {
				Gato gato = (Gato) a;
				imprimir(gato);
			} else if (a instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) a;
				imprimir(cachorro);
			} else if (a instanceof Galinha) {
				Galinha galinha = (Galinha) a;
				imprimir(galinha);
			}
		}
	}

	private static void imprimir(Gato gato) {
		System.out.printf(
				"Identificador: %d\nNome: %s\nIdade: %d\n" + "Tamanho: %.2f\nPeso: %.2f\nPossui caixa de areia: %s",
				gato.getIdentificador(), gato.getNome(), gato.getIdade(), gato.getTamanho(), gato.getPeso(),
				gato.getTraducaoPossuiCaixaDeAreia());
	}

	private static void imprimir(Cachorro cachorro) {
		System.out.printf(
				"Identificador: %d\nNome: %s\nIdade: %d\n" + "Tamanho: %.2f\nPeso: %.2f\nPossui caixa de areia: %s",
				cachorro.getIdentificador(), cachorro.getNome(), cachorro.getIdade(), cachorro.getTamanho(),
				cachorro.getPeso(), cachorro.getTraduzirPossuiCama());
	}

	private static void imprimir(Galinha galinha) {
		System.out.printf(
				"Identificador: %d\nNome: %s\nIdade: %d\n" + "Tamanho: %.2f\nPeso: %.2f\nPossui caixa de areia: %.2f",
				galinha.getIdentificador(), galinha.getNome(), galinha.getIdade(), galinha.getTamanho(),
				galinha.getPeso(), galinha.getTamanhoDoPoleiro());

	}

	private static ArrayList<Animal> cadastrarAnimal (Scanner sc) {
		ArrayList<Animal> animaisParaCadastro = new ArrayList<>();
		Integer opcao = 0;
		do {
			System.out.print("--------------------------------\n");
			opcao = Leitor.lerValor("0) Sair\n1) Cadastrar Gato \n2) Cadastrar Cachorro \n3) Cadastrar Galinha", sc, 0);
			switch (opcao.intValue()) {
			case 0:
				System.out.println("Saindo do cadastro...");
				break;
			case 1:
				animaisParaCadastro.add(cadastrarGato(sc));
				break;
			case 2:
				animaisParaCadastro.add(cadastrarCachorro(sc));
				break;
			case 3:
				animaisParaCadastro.add(cadastrarGalinha(sc));
				break;
			default:
				break;
			}
		} while (opcao != 0);
		
		return animaisParaCadastro;
	}

	private static Animal cadastrarGalinha(Scanner sc) {
		Galinha g = new Galinha();

		g.setIdade(Leitor.lerValor("Qual a idade ?", sc, g.getIdade()));
		g.setNome(Leitor.lerValor("Qual a nome ? ", sc));
		g.setPeso(Leitor.lerValor("Qual o peso ? ", sc, g.getPeso()));
		g.setTamanho(Leitor.lerValor("Qual o tamanho ? ", sc, g.getTamanho()));
		g.setTamanhoDoPoleiro(Leitor.lerValor("Qual o tamanho do Poleiro ? ", sc, g.getTamanhoDoPoleiro()));

		return g;
	}

	private static Animal cadastrarCachorro(Scanner sc) {
		Cachorro c = new Cachorro();

		c.setIdade(Leitor.lerValor("Qual a idade ?", sc, c.getIdade()));
		c.setNome(Leitor.lerValor("Qual a nome ? ", sc));
		c.setPeso(Leitor.lerValor("Qual o peso ? ", sc, c.getPeso()));
		c.setTamanho(Leitor.lerValor("Qual o tamanho ? ", sc, c.getTamanho()));
		c.setPossuiCama(Leitor.lerValor("Possui cama ? ", sc, c.getPossuiCama()));
		return c;
	}

	private static Animal cadastrarGato(Scanner sc) {
		Gato g = new Gato();

		g.setIdade(Leitor.lerValor("Qual a idade ?", sc, g.getIdade()));
		g.setNome(Leitor.lerValor("Qual a nome ? ", sc));
		g.setPeso(Leitor.lerValor("Qual o peso ? ", sc, g.getPeso()));
		g.setTamanho(Leitor.lerValor("Qual o tamanho ? ", sc, g.getTamanho()));
		g.setPossuiCaixaDeAreia(Leitor.lerValor("Possui caixa de areia ? ", sc, g.getPossuiCaixaDeAreia()));
		return g;
	}
}





//Aula 19/11

//ArrayList<Animal> arrayListAnimais = new ArrayList<>();

//Gato g = new Gato();
//arrayListAnimais.add(new Cachorro());
//arrayListAnimais.add(new Galinha());
//arrayListAnimais.add(g);
//
//for (Animal a : arrayListAnimais) {
//
//}		
//arrayListAnimais.forEach(data -> {
//	data.setIdade(10);
//	data.dizerOla();
//});
//for (int i = 0; i < arrayListAnimais.size(); i++) {
//	if (arrayListAnimais.get(i) instanceof Gato) {
//		arrayListAnimais.remove(arrayListAnimais.get(i));
//		i--;
//	}
//	System.out.println(arrayListAnimais.get(i).getNome());
//}

// instanceof é usado para comparação de tipos (aquele objeto em si)
// equals é usado para comparar todo o valor

//Gato g = new Gato();
//Cachorro c = new Cachorro();
//Galinha gal = new Galinha();
//Animal a = new Galinha();
//Animal ac = new Cachorro();
//
//g.dizerOla();
//c.dizerOla();
//gal.dizerOla();
//a.dizerOla();
//ac.dizerOla();

//Pessoa p = new Pessoa ();
//Livro l = new Livro();
//p.setNome("Pessoa");
//l.setNome("Livro");
//System.out.println(p.getNome());
//System.out.println(l.getNome());