package com.xworkz.patient_entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.patient_entity.entity.PatientEntity;

public class PatientImp implements PatientInterface {
	public void create(PatientEntity patientEntity) {
		System.out.println(patientEntity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(PatientEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(patientEntity);
		tr.commit();
		session.close();
		sessionFactory.close();


	}
	public PatientEntity getById(int id) {
		PatientEntity patientEntity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument " + id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(PatientEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			patientEntity = session.get(PatientEntity.class, id);
			if (patientEntity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return patientEntity;
	}
	public void updateById(String Name, int age, int id) {
		System.out.println("invode by id and update");

		System.out.println("passing arg " + Name + " "+age+" " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(PatientEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			PatientEntity entity = session.get(PatientEntity.class, id);
			if (entity != null) {

				entity.setName(Name);
				entity.setAge(age);
				session.update(entity);
				tran.commit();
				System.out.println("entity updated");
				session.close();

			} else {
				System.out.println("not found wrong passing");
			}
			factory.close();

		}
	}
	public void deleteById(int id) {
		System.out.println("invoked delete by id");

		SessionFactory factory= new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			PatientEntity entity=session.get(PatientEntity.class, id);
			if(entity!=null) {
				session.delete(entity);
				transaction.commit();
				System.out.println("you are genius found that and deleted");
				session.close();
			}else {
				System.out.println("not found that id");
			}
		}factory.close();
	}

}


