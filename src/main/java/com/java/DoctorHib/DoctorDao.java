package com.java.DoctorHib;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface DoctorDao {

	List<Doctor> showdoctorDao() throws ClassNotFoundException, SQLException;
	String adddoctorDao(Doctor DoctorNew) throws ClassNotFoundException, SQLException, ParseException;
}
