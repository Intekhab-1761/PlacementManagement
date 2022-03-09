package com.cg.adminclient;

import com.cg.adminentities.Admin;
import com.cg.adminservice.AdminService;
import com.cg.adminservice.AdminServiceImpl;

public class Client {

	public static void main(String[] args) {
		//Debug this program as Debug -> Debug as Java Application

				AdminService service = new AdminServiceImpl();
				Admin admin = new Admin();
		// Create Operation
				admin.setId(1);;
				admin.setName("abhi");
				admin.setPassword("Abhishek");
				service.addAdmin(admin);
	}
}