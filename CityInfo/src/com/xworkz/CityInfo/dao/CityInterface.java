package com.xworkz.CityInfo.dao;

import com.xworkz.CityInfo.entity.CityInfoEntity;


public interface CityInterface {
	public void create(CityInfoEntity cityentity);
	default  CityInfoEntity getById(int id)
	{
		return null;
	} 
	 default void updatePopulationById(long l,int id)
	 {
		 
	 }
	 default void deleteById(int id) {
		 
	 }
}
