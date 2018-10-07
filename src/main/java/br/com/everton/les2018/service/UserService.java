package br.com.everton.les2018.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.User;

@Service
public class UserService extends CrudService<User> {

	public UserService() {
		super.entityName = "user";
	}
	
	@Override
	public List<User> searchBy(String filter) {
		return null;
	}

}
