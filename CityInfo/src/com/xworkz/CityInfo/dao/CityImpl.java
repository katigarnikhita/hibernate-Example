package com.xworkz.CityInfo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.CityInfo.entity.CityInfoEntity;




public class CityImpl implements CityInterface {
	
	public void create(CityInfoEntity cityentity) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(CityInfoEntity.class);
		SessionFactory factory=config.buildSessionFactory();
		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction trasaction=session.beginTransaction();
			session.save(cityentity);
			trasaction.commit();
			session.close();
		}
		factory.close();
	}
	public CityInfoEntity getById(int id)
	{
		System.out.println("invoking getById method");
		System.out.println("id:"+id);
		CityInfoEntity entity=null;
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityInfoEntity.class).buildSessionFactory();
		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(CityInfoEntity .class, id);
			if(entity!=null)
			{
				System.out.println("enter found at id="+id);
			}
			else
			{
				System.out.println("no entity was found at id=" +id);
			}
			session.close();
		}
				factory.close();
				return entity;
		
	}
	public void  updatePapulationById(int newPop,int id)
	 {
		   System.out.println("invoking updatePapulationById method");
		   System.out.println("passed arguments newPpop="+newPop+"Id:+id");
		   SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityInfoEntity.class).buildSessionFactory();
		   if(factory!=null)
		   {
			   Session session=factory.openSession();
			  Transaction tx=session.beginTransaction();
			CityInfoEntity entity=session.get(CityInfoEntity.class,id);
			if(entity!=null)
			{
				entity.setPopulation(newPop);
				session.update(entity);
				tx.commit();
				System.out.println("updated population at id="+id);
			}
			else
			{
				System.out.println("improver id");
			}
			session.close();
		   }
		   factory.close();
	 }
	   public void deleteById(int id)
	   {
		   System.out.println("invoking deleteById method");
		   System.out.println("id:"+id);
		   SessionFactory factory=new Configuration().configure().addAnnotatedClass(CityInfoEntity.class).buildSessionFactory();
		   if(factory!=null)
		   {
			   Session session=factory.openSession();
			  Transaction tx=session.beginTransaction();
			  CityInfoEntity entity=session.get(CityInfoEntity.class,id);
			if(entity!=null)
			{
				
				session.delete(entity);
				tx.commit();
				System.out.println("delete entity at id="+id);
			}
			else
			{
				System.out.println("no entity  id found at id="+id);
			}
			session.close();
		   }
		   factory.close();
	 }
	  
}
