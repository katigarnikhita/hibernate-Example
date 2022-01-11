package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyDaoimpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyEntity companyEntity=new CompanyEntity(02,"tcs","devloper","www.tcs.com");
		CompanyEntity companyEntity1=new CompanyEntity(03,"apex","devloper","www.apex.com");
		CompanyEntity companyEntity2=new CompanyEntity(04,"infosys","devloper","www.infosys.com");
		CompanyEntity companyEntity3=new CompanyEntity(05,"infosys","devloper","www.infosys.com");
		CompanyEntity companyEntity4=new CompanyEntity(06,"infosys","devloper","www.infosys.com");
		
		
		CompanyDAO companyDAO=new  CompanyDaoimpl();
		companyDAO.create(companyEntity);
		
		companyDAO.updatedomainById("capgemini", 03);
		companyDAO.deleteById(04);
		
	
	}

}
