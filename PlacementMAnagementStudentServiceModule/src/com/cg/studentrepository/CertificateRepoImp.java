package com.cg.studentrepository;

import javax.persistence.EntityManager;

import com.cg.studententities.Certificate;

public class CertificateRepoImp implements CertificateRepo{
	
private EntityManager entityManager;
	
	
	public CertificateRepoImp() {
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		
	}

	@Override
	public void deleteCertificate(int id) {
		Certificate certificate=entityManager.find(Certificate.class,id);
		entityManager.remove(certificate);
	}

	@Override
	public void searchCertificate(int id) {
		entityManager.find(Certificate.class,id);
		
	}


	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
		
	}


	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
