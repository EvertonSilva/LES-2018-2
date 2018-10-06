package br.com.everton.les2018.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.everton.les2018.service.CrudService;

public abstract class BaseController<T> {
	
	@Autowired
	protected CrudService<T> service;
	
	@Autowired
	protected HttpSession session;
}
