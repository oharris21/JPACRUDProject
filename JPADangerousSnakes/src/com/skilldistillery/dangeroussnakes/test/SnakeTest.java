package com.skilldistillery.dangeroussnakes.test;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.dangeroussnakes.entities.Snake;

class SnakeTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Snake blackMamba;
	
	@BeforeAll
	public static void setupAll() {	
		emf = Persistence.createEntityManagerFactory("Snake");
	}

	@AfterAll
	public static void tearDownAll() {
		emf.close();
	}
	
	@BeforeEach
	public void setUp() throws Exception {
	    em = emf.createEntityManager();
	    blackMamba = em.find(Snake.class, 1); 
	}

	@AfterEach
	public void tearDown() throws Exception {
		blackMamba = null; 
		em.close();
	}
	
	@Test
	void test_snake_mappings() {
		assertEquals("Black Mamba", blackMamba.getName()); 
		assertEquals("gray", blackMamba.getColors()); 
		assertEquals(8, blackMamba.getLengthInInches()); 
	}

}
