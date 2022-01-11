package com.xworkz.patient_entity;


import com.xworkz.patient_entity.dao.PatientImp;
import com.xworkz.patient_entity.dao.PatientInterface;
import com.xworkz.patient_entity.entity.PatientEntity;


public class PatientRunner {
	
	public static void main(String[] args) {
		
		PatientEntity entity1=new PatientEntity(1,26,9,"madhu","laxmeshwar");
		PatientEntity entity2=new PatientEntity(2,46,8,"anu","gadag");
	    PatientEntity entity3=new PatientEntity(3,56,6,"suma","banglore");
	    PatientEntity entity4=new PatientEntity(5,26,4,"naveen","hydrabad");
		
		
		
	    PatientInterface set = new PatientImp();
        set.create(entity1);
	    set.create(entity2);
	    set.create(entity3);
	    set.create(entity4);
	
	    PatientEntity set1=set.getById(2);
		 System.out.println(set1);

	    
		set.deleteById(2);
	}

}
