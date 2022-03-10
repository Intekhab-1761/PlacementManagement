package com.cg.studentrepository;

import javax.persistence.EntityManager;

import com.cg.studententities.Placement;

public class PlacementRepoImp implements PlacementRepo {

	private EntityManager entityManager;

	public PlacementRepoImp() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		entityManager.find(Placement.class, id);
		return null;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

}
