package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyDAO {
	
	public void create(CompanyEntity CompanyEntity);
	default  CompanyEntity getById(int id)
	{
		return null;
	} 
	 void updatedomainById(String newPop, int id);
      
		 default void deleteById(int id) {
		 
	 }
	
}
