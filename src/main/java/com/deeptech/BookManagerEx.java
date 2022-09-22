package com.deeptech;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BookManagerEx {


	public static void main(String[] args) {
		 EntityManager entityM;
		 EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("BookUnit");
		entityM = factory.createEntityManager();

		entityM.getTransaction().begin();
		
		Book newBook = new Book();
		newBook.setTitle("jpa hibernate mysql");
		newBook.setAuthor("Abhijeet");
		newBook.setPrice(1500);
		
		entityM.persist(newBook);
		
		entityM.getTransaction().commit();
		entityM.close();
		factory.close();
	}

}
