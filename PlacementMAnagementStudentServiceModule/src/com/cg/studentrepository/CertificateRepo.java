package com.cg.studentrepository;

import com.cg.studententities.Certificate;

public interface CertificateRepo {

	public abstract void addCertificate(Certificate certificate);
	
	public abstract void updateCertificate(Certificate certificate);
	
	public abstract void deleteCertificate(int id);
	
	public abstract void searchCertificate(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();
	
	

}
