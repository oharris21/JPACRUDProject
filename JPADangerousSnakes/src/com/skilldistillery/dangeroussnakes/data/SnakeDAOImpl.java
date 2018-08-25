package com.skilldistillery.dangeroussnakes.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.dangeroussnakes.entities.Snake;

public class SnakeDAOImpl implements SnakeDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Snake");
	EntityManager em;

	@Override
	public Snake create(Snake snake) {
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(snake);
		em.flush();
		em.getTransaction().commit();
		return snake;
	}

	@Override
	public void update() {
		em.getTransaction().begin();
		em.getTransaction().commit();
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
}
