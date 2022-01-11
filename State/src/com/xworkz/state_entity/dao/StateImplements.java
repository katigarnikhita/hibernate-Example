package com.xworkz.state_entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.state_entity.entity.StateEntity;

public class StateImplements implements StateInterface{

	@Override
	public void create(StateEntity stateEntity) {

		System.out.println("invoking create dao method");
		System.out.println(stateEntity);
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory factory=configuration.buildSessionFactory(); 
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(stateEntity);
		transaction.commit();
		session.close();
		
		}
		factory.close();
	}
	public StateEntity getById(int id)
	{
		
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		StateEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(StateEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(StateEntity.class, id);

			if(entity!=null)
			{
				System.out.println("entity found at id= "+id);
			}

			else
			{
				System.out.println("No entity was found at id= "+id);
			}
			session.close();
		}

		factory.close();
		return entity;
	}

	public void updateNameById(String newPop,int id)
	{
		System.out.println("Invoked updatePopulationById method");
		System.out.println("passed arguments newPpop= "+newPop+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(StateEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			StateEntity entity=session.get(StateEntity.class, id);

			if(entity!=null)
			{
				entity.setName(newPop);
				session.update(entity);
				tx.commit();

				System.out.println("Updated population at id= "+id);

			}
			else
			{
				System.out.println("improper id ");
			}
			session.close();
		}
		factory.close();
	}
	@Override
	public void updatedomainById(String newPop, int id) {
		// TODO Auto-generated method stub
		
	}

}
