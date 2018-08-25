package com.skilldistillery.dangeroussnakes.data;

import com.skilldistillery.dangeroussnakes.entities.Snake;

public interface SnakeDAO {
	public Snake create(Snake actor);
	public void update();
	public boolean delete(int id);
}
