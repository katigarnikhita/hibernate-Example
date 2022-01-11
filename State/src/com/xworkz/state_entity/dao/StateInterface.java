package com.xworkz.state_entity.dao;


import com.xworkz.state_entity.entity.StateEntity;

public interface StateInterface{
	
	public void create(StateEntity stateEntity);

default StateEntity getById(int id)
{
	return null;
} 
 void updatedomainById(String newPop, int id);
  
	 default void deleteById(int id) {
	 
 }
}
