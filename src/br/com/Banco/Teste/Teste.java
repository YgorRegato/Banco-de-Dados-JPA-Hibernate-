package br.com.Banco.Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.Banco.Modelo.Conta;

public class Teste {
	
	public static void main(String[] args) {
		
		
		Conta conta= new Conta();
		
		conta.setTitular("Ygor Regato");
		conta.setBanco("Itaú");
		conta.setAgencia("1234");
		conta.setNumero("654321");
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("financa");
		EntityManager em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}

}
