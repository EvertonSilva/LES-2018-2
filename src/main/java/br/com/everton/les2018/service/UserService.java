package br.com.everton.les2018.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.User;
import br.com.everton.les2018.persistence.repository.UserRepository;

@Service
public class UserService extends CrudService<User> {

	public UserService() {
		super.entityName = "user";
	}
	
	public Optional<User> findByIdDocument(String document) {
		return ((UserRepository)repo).findByIdDocument(document);
	}
	
	@Override
	public List<User> searchBy(String filter) {
		return null;
	}

}
