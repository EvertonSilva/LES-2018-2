package br.com.everton.les2018.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.persistence.repository.JpaSpecificationRepository;

@Service
public abstract class CrudService<E> {
	
	@Autowired
	protected JpaSpecificationRepository<E, Long> repo;
	
	
	public Page<E> list(Pageable pageable) {
		return (Page<E>) repo.findByEnabledTrue(pageable);
	}
	
	public Optional<E> getEntity(Long entityId) {
		return (Optional<E>) repo.findByIdAndEnabledTrue(entityId);
	}
	
	public E saveEntity(E entity) {
		return repo.save(entity);
	}
	
	public E updateEntity(E entity) {
		return repo.saveAndFlush(entity);
	}
	
	public abstract List<E> searchBy(String filter);
}
