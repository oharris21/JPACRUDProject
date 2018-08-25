package com.skilldistillery.mvcdangeroussnakes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.dangeroussnakes.entities.Snake;
import com.skilldistillery.mvcdangeroussnakes.data.SnakeDAO;

@Controller
public class SnakeController {
	@Autowired
	private SnakeDAO dao; 
	
	@RequestMapping(path="createSnake.do", method=RequestMethod.POST)
	public ModelAndView createSnakeFromUser(Snake s, Model model) {
		ModelAndView mv = new ModelAndView(); 
		Snake snake = dao.create(s); 
		mv.setViewName("show");
		mv.addObject("snake", snake); 
		return mv; 
		// display snake's detail page when link is clicked on in index 
	}
	
	@RequestMapping(path="EditList.do", method=RequestMethod.GET)
	public ModelAndView listOfSnakesEdit() {
		ModelAndView mv = new ModelAndView(); 
		List<Snake> snakeList = dao.getSnakes(); 
		mv.addObject("snakeList", snakeList); 
		mv.setViewName("listOfSnakesEdit");
		return mv; 
	}
	
	@RequestMapping(path="DeleteList.do", method=RequestMethod.GET)
	public ModelAndView listOfSnakesDelete() {
		ModelAndView mv = new ModelAndView();
		List<Snake> snakeList = dao.getSnakes(); 
		mv.addObject("snakeList", snakeList); 
		mv.setViewName("listOfSnakesDelete");
		return mv; 
	}
	
	// shows full snake details to be edited 
	@RequestMapping(path="Edit.do", method=RequestMethod.GET)
	public ModelAndView showSnakes(int id) {
		ModelAndView mv = new ModelAndView(); 
		Snake s = dao.getSnakeById(id); 
		mv.addObject("snake", s); 
		mv.setViewName("edit");
		return mv; 
	}
	
	// edits snake 
	@RequestMapping(path="Edit.do", method=RequestMethod.POST)
	public ModelAndView updateSnake(Snake s) {
		ModelAndView mv = new ModelAndView();
		Snake updatedSnake = dao.update(s.getId(), s); 
		mv.addObject("snake", updatedSnake);
		mv.setViewName("show");
		return mv; 
	}
	
	@RequestMapping(path="Delete.do", method=RequestMethod.POST)
	public ModelAndView deleteSnake(int id) {
		ModelAndView mv = new ModelAndView(); 
		dao.delete(id); 
		mv.setViewName("deleteConfirmation");
		return mv; 
	}
}

// same snake/show page as above. "snake" represents the name that you'll be calling ${snake} 
// on that page. So like s.name s.colors.... 
// snake/show will just display a snake's info and have home, create, edit, and delete 