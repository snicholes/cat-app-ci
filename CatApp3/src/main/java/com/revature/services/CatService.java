package com.revature.services;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.revature.beans.Breed;
import com.revature.beans.Cat;
import com.revature.beans.Person;

public interface CatService {
	// "create" method: returns the unique identifier of the added Cat
	public Integer addCat(Cat c);
	// "read" methods
	public Cat getCatById(Integer id);
	public Set<Cat> getCats();
	public Set<Cat> getAvailableCats();
	public Set<Breed> getBreeds();
	// "update" methods
	public void updateCat(Cat c);
	public void adoptCat(Person p, Cat c);
	// "delete" methods
	public void removeCat(Cat c);

}
