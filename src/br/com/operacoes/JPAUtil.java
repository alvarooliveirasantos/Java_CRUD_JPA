package br.com.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
	



public static EntityManager getEntityManager(){
	
	return emf.createEntityManager();
}
}