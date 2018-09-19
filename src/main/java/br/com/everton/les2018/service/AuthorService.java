package br.com.everton.les2018.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.Author;

@Service
public class AuthorService extends CrudService<Author> {

	@Override
	public List<Author> searchBy(String filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
