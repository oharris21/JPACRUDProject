package com.skilldistillery.mvcdangeroussnakes.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.dangeroussnakes.entities.Snake;

public class SnakeDAOImpl implements SnakeDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Snake");
	EntityManager em = emf.createEntityManager();
	// create methods to open and close connection 

	@Override
	public Snake create(Snake snake) {
		em.getTransaction().begin();
		em.persist(snake);
		em.flush();
		em.getTransaction().commit();
		return snake;
	}

	@Override
	public Snake update(int id, Snake s) {
		em.getTransaction().begin();
		Snake managedSnake = em.find(Snake.class, id);
		managedSnake.setName(s.getName());
		managedSnake.setColors(s.getColors());
		managedSnake.setLengthInInches(s.getLengthInInches()); 
		managedSnake.setWeightInLbs(s.getWeightInLbs());
		managedSnake.setHabitat(s.getHabitat());
		managedSnake.setRegion(s.getRegion());
		managedSnake.setHowVenemous(s.getHowVenemous());
		managedSnake.setCharacteristics(s.getCharacteristics());
		em.getTransaction().commit();
		return managedSnake;
	}

	@Override
	public boolean delete(int id) {
		Snake s = em.find(Snake.class, id);
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		if(em.find(Snake.class, id) == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<Snake> getSnakes() {
		String names = "SELECT s FROM Snake s";
		List<Snake> snakeList = em.createQuery(names, Snake.class).getResultList();
		return snakeList; 
	}
	
	public Snake getSnakeById(int id) {
		String qs = "SELECT s FROM Snake s WHERE s.id = :id"; 
		Snake s = em.createQuery(qs, Snake.class).setParameter("id", id).getSingleResult(); 
		return s; 
	}

}
