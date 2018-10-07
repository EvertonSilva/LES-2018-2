package br.com.everton.les2018.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.everton.les2018.model.User;
import br.com.everton.les2018.service.CrudService;

public abstract class BaseController<T> {
	
	@Autowired
	protected CrudService<T> service;
	
	@Autowired
	protected HttpSession session;
	
	@Autowired
	private CrudService<User> userService;
	
	public User currentUser() {
		Long userId = (Long) session.getAttribute("user_id");
		
		return userService.getEntity(userId).get();
	}
}
