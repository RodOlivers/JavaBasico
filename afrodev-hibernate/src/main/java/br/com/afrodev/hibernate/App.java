package br.com.afrodev.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.afrodev.hibernate.models.Personalidade;
import br.com.afrodev.hibernate.models.Pessoa;
import br.com.afrodev.hibernate.models.Sexo;

public class App {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("afrodev");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Pessoa p = new Pessoa();
		
		p.setNome("Joãozinho");
		p.setIdade(58);
		p.setSexo(Sexo.MASCULINO);
		List<Personalidade> personalidades = new ArrayList<>();
		personalidades.add(new Personalidade ("Extrovertido"));
		personalidades.add(new Personalidade ("Reservado"));
		for (int i = 0; i < personalidades.size(); i++) {
			em.persist(personalidades.get(i));
		}
		
		p.setPersonalidades(personalidades);
		em.persist(p);
		em.getTransaction().commit();
		
		
		Query q = em.createQuery("SELECT p FROM Pessoa p where p.nome = :pNome ",Pessoa.class);
		
		q.setParameter("pNome", "Mariazinha");
		List<Pessoa> pessoas = q.getResultList();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(p);
		}
		
		em.close();
		
 	}

}
