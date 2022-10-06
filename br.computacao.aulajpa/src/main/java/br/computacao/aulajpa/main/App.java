package br.computacao.aulajpa.main;

import javax.persistence.EntityManager;

import br.computacao.aulajpa.dao.JpaUtil;

public class App {

	public static void main(String[] args) {
		EntityManager eM = JpaUtil.getEntityManagerFactory().createEntityManager();

	}

}
