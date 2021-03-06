package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Person;
import com.revature.data.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService {
	private PersonDAO personDao;
	
	@Autowired
	public PersonServiceImpl(PersonDAO p) {
		personDao = p;
	}

	@Override
	public Integer addPerson(Person p) {
		return personDao.add(p).getId();
	}

	@Override
	public Person getPersonById(Integer id) {
		return personDao.getById(id);
	}

	@Override
	public Person getPersonByUsername(String username) {
		return personDao.getByUsername(username);
	}

	@Override
	public void updatePerson(Person p) {
		personDao.update(p);
	}

	@Override
	public void deletePerson(Person p) {
		personDao.delete(p);
	}

}
