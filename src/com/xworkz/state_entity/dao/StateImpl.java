package com.xworkz.state_entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.state_entity.entity.StateEntity;

public class StateImpl implements StateInterface {

	@Override
	public void save(StateEntity stateentity) {
		// TODO Auto-generated method stub
		System.out.println("invoking save methods");
		System.out.println(stateentity);
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(StateEntity.class);
		SessionFactory factory=config.buildSessionFactory();
		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction trasaction=session.beginTransaction();
			session.save(stateentity);
			trasaction.commit();
			session.close();
		}
		factory.close();
	}

}
