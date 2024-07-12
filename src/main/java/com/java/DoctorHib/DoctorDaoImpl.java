package com.java.DoctorHib;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DoctorDaoImpl implements DoctorDao {
	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Doctor> showdoctorDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Doctor");
		List<Doctor> doctorList = query.list();
		return doctorList;	
		}

	@Override
	public String adddoctorDao(Doctor DoctorNew) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		sessionFactory = SessionHelper.getConnection();
	    session = sessionFactory.openSession();
	    Transaction trans = session.beginTransaction();
	    session.saveOrUpdate(DoctorNew);
	    trans.commit();
	    return " Record Inserted...";	
	}

}
