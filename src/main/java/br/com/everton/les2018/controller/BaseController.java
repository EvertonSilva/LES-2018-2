package br.com.everton.les2018.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.everton.les2018.service.CrudService;

public abstract class BaseController<T> {
	
	@Autowired
	protected CrudService<T> service;
}
