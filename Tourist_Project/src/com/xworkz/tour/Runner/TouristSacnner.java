package com.xworkz.tour.Runner;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class TouristSacnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("xworkz");
	System.out.println(entityManagerFactory);
	
	}

}
