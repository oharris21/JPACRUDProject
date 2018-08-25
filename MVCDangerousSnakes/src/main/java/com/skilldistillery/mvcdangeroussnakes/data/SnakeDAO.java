package com.skilldistillery.mvcdangeroussnakes.data;

import java.util.List;

import com.skilldistillery.dangeroussnakes.entities.Snake;

public interface SnakeDAO {
	public Snake create(Snake snake);
	public Snake update(int id, Snake snake);
	public boolean delete(int id);
	public List<Snake> getSnakes();
	public Snake getSnakeById(int id); 
}
