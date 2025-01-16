package com.java.hib.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.java.hib.model.Employ;
import com.java.hib.model.Login;
import com.java.hib.util.EncryptPassword;
import com.java.hib.util.SessionHelper;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	
	public Employ searchEmployNamedQuery(int empno) {
		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
  	    Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno",empno);   
		Employ employ = (Employ)query.uniqueResult();
		return employ;
	}
	
	public List<Employ> showEmployNamedQuery() {
		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}
	
	public List<Employ> showDeptDetails(String dept) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		return cr.list();
	}
	
	public List<String> showDept() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.distinct(Projections.property("dept")); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}
	
	public Long doLogin(Login login) {
		String encr = EncryptPassword.getCode(login.getPassCode());
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", encr));
		cr.setProjection(Projections.rowCount());
		long  count =(Long)cr.uniqueResult();
		return count;
	}
	
	public int authenticate(Login login) {
		String encr = EncryptPassword.getCode(login.getPassCode());
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", encr));
		Login loginFound = (Login)cr.uniqueResult();
		if (loginFound!=null) {
			return 1;
		}
		return 0;
	}
	
	public String addUser(Login login) {
		String encr = EncryptPassword.getCode(login.getPassCode());
		login.setPassCode(encr);
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(login);
		trans.commit();
		return "User Account Added...";
	}
	
	public double totalSalary() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		double salary = (Double) session.createCriteria(Employ.class).
				setProjection(Projections.sum("basic")).uniqueResult();
		return salary;
	}
	
	public Long totalRecords() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class).setProjection(Projections.rowCount());
		Long count = (Long)cr.uniqueResult();
		return count;
	}
	public List<String> showName() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.property("name");
		cr.setProjection(projection);
		List<String> strList = cr.list();
		return strList;
	}
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		return cr.list();
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("empno", empno));
		Employ employ = (Employ)cr.uniqueResult();
		return employ;
	}

}
