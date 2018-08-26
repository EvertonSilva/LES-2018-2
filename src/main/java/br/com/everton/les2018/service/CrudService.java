package br.com.everton.les2018.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class CrudService<T, E> {
	
	@Autowired
	private JpaRepository<T, Long> repo;
	
	@SuppressWarnings("unchecked")
	public Page<E> list(Pageable pageable) {
		return (Page<E>) repo.findAll(pageable);
	}
	
	@SuppressWarnings("unchecked")
	public E getEntity(Long entityId) {
		return (E) repo.findById(entityId).get();
	}
	
}
