package com.xworkz.patient_entity.dao;


import com.xworkz.patient_entity.entity.PatientEntity;

public interface PatientInterface {

void create (PatientEntity patientEntity);
	
	default PatientEntity getById(int id) {
		return null;}
	
	
	
	default void updateById (String name,String birthPlace,int id) {
		
		
	}
	default void deleteById(int id) {}
}