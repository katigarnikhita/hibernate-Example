package com.xworkz.company.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;


public class CompanyDaoimpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity companyEntity) {
		// TODO Auto-generated method stub
		System.out.println("invoking create dao method");
		System.out.println(companyEntity);
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory factory=configuration.buildSessionFactory(); 
		if(factory!=null)
		{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(companyEntity);
		transaction.commit();
		session.close();
		}
		factory.close();
	}
		public CompanyEntity getById(int id)
		{
			
			System.out.println("Invoked getById method");
			System.out.println("Id : "+id);
			CompanyEntity entity =null;

			SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

			if(factory!=null)
			{
				Session session=factory.openSession();
				entity=session.get(CompanyEntity.class, id);

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

		@Override
		
		

		public void updatedomainById(String newPop,int id)
		{
			System.out.println("Invoked updatePopulationById method");
			System.out.println("passed arguments newPpop= "+newPop+" Id : "+id);

			SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

			if(factory!=null)
			{
				Session session=factory.openSession();
				Transaction tx=session.beginTransaction();
				CompanyEntity entity=session.get(CompanyEntity.class, id);

				if(entity!=null)
				{
					entity.setDomain(newPop);
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
		
	}

