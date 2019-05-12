package org.formacio.api;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Component
public class LocalitatOpBasic {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public Localitat carrega (long id) {
		Localitat localitat = getEm().find(Localitat.class, id);
		return localitat;
	}
	
	public void alta (String nom, Integer habitants) {
	}
	
	public void elimina (long id) {
	}
	
	public void modifica (Localitat localitat) {
	}

}
