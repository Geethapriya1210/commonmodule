package com.xworkz.countries.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.countries.dto.CountriesDTO;


@Component
public class CountriesDAOImpl implements CountriesDAO {
	@Autowired
	private SessionFactory factory;

	public void CalamityDAOImpl() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@Override
	public void save(CountriesDTO countriesdto) {
		
		Session session = this.factory.openSession();
		try {

			System.out.println("Start: save method in CountriesDAOImpl ");
			System.out.println("session created");
			System.out.println("Starting transaction");
			session.beginTransaction();
			System.out.println("Saving " );
			session.save(countriesdto);
			session.flush();
			session.getTransaction().commit();
			System.out.println("Committed Transaction");

		} catch (Exception e) {
			System.err.println("Exception in create method" + e.getMessage());
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			System.out.println("Closing session");
			session.close();
		}
		System.out.println("End: save method in CountriesDAOImpl ");



		
	}

}
