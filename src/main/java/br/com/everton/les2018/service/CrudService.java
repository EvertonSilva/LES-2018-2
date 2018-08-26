package br.com.everton.les2018.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.DomainEntity;


@Service
public class CrudService<E> {
	
	@Autowired
	private JpaRepository<E, Long> repo;
	
	public Page<E> list(Pageable pageable) {
		return (Page<E>) repo.findAll(pageable);
	}
	
	public Optional<E> getEntity(Long entityId) {
		return (Optional<E>) repo.findById(entityId);
	}
	
	public E saveEntity(E entity) {
		return repo.save(entity);
	}
	
	public E updateEntity(E entity) {
		return repo.saveAndFlush(entity);
	}
}
