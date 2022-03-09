package com.cg.adminservice;

import com.cg.adminentities.Admin;
import com.cg.adminrepository.AdminRepo;
import com.cg.adminrepository.AdminRepoImpl;

public class AdminServiceImpl implements AdminService {
	private AdminRepo dao;

	public AdminServiceImpl() {
		dao = new AdminRepoImpl();
	}

	@Override
	public void addAdmin(Admin admin) {
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();

	}

	@Override
	public void updateAdmin(Admin admin) {
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();

	}

	@Override
	public void removeAdmin(Admin admin) {
		dao.beginTransaction();
		dao.removeAdmin(admin);
		dao.commitTransaction();
	}

	@Override
	public Admin findAdminById(int id) {
//no need of transaction, as it's an read operation
		Admin admin = dao.getAdminById(id);
		return admin;
	}

}
