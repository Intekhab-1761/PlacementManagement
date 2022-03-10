package com.cg.studentservice;

import com.cg.studententities.Certificate;
import com.cg.studentrepository.CertificateRepo;
import com.cg.studentrepository.CertificateRepoImp;


public class CertificateServiceImp implements CertificateService  {
	
private CertificateRepo repo;
	
	
	public CertificateServiceImp() {
		repo=new CertificateRepoImp();
	}

	@Override
	public void addCertificate(Certificate certificate) {
		repo.beginTransaction();
		repo.addCertificate(certificate);
		repo.commitTransaction();
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		repo.beginTransaction();
		repo.updateCertificate(certificate);
		repo.commitTransaction();
		
	}

	@Override
	public void deleteCertificate(int id) {
		repo.beginTransaction();
		repo.deleteCertificate(id);
		repo.commitTransaction();
		
	}

	@Override
	public void searchCertificate(int id) {
		repo.beginTransaction();
		repo.searchCertificate(id);
		repo.commitTransaction();
		
	}

}
