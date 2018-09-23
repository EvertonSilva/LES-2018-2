package br.com.everton.les2018.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.business.ISaveRules;
import br.com.everton.les2018.persistence.repository.JpaSpecificationRepository;

@Service
public abstract class CrudService<E> {
	
	@Autowired
	protected JpaSpecificationRepository<E, Long> repo;
	
	@Autowired
	private Map<String, ISaveRules<E>> rules;
	
	
	public Page<E> list(Pageable pageable) {
		return repo.findByEnabledTrue(pageable);
	}
	
	public Optional<E> getEntity(Long entityId) {
		return repo.findByIdAndEnabledTrue(entityId);
	}
	
	public E saveEntity(E entity) {
		executeRules(entity, "save");
		return repo.save(entity);
	}
	
	public E updateEntity(E entity) {
		return repo.saveAndFlush(entity);
	}
	
	public abstract List<E> searchBy(String filter);
	
	private void executeRules(E entity, String operation) {
		String entityName = entity.getClass().getSimpleName().toLowerCase();
		String key = operation.toLowerCase().concat("_").concat(entityName);
		
		rules.get(key).getSaveRules().forEach(str -> {
			str.process(entity);
		});
	}

}
