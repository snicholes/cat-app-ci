package com.revature.data;

import java.util.Set;

import org.hibernate.Session;

import com.revature.beans.Status;
import com.revature.utils.HibernateUtil;

public class StatusHibernate implements StatusDAO {
	private HibernateUtil hu = HibernateUtil.getHibernateUtil();

	@Override
	public Status getById(Integer id) {
		Session s = hu.getSession();
		// TODO
		return null;
	}

	@Override
	public Set<Status> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Status t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Status t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Status add(Status s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
