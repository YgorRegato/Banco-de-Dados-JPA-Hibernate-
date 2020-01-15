package br.com.Banco.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("financa");
	
	public EntityManager getEntityManager() {
		
		return emf.createEntityManager();
	}


}
