package com.xworkz.state_entity;

import com.xworkz.state_entity.dao.StateImplements;
import com.xworkz.state_entity.dao.StateInterface;
import com.xworkz.state_entity.entity.StateEntity;

public class StateScanner {

	public static void main(String[] args) {


		StateEntity stateEntity = new StateEntity(1,"karnatka",28,"bangalore");
		StateEntity stateEntity5 = new StateEntity(4,"AP",22,"amravati");
		StateEntity stateEntity2 = new StateEntity(2,"tamilnadu",230,"chennai");
		StateEntity stateEntity3 = new StateEntity(2,"maharastra",27,"mumbai");
		
	
		
		StateInterface set = new StateImplements();
		
		set.create(stateEntity);
		set.create(stateEntity5);
		set.create(stateEntity2);
		set.create(stateEntity3);
		
		
		
	}

}
