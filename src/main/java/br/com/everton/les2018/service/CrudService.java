package br.com.everton.les2018.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.persistence.repository.JpaSpecificationRepository;

@Service
public abstract class CrudService<E> {
	
	@Autowired
	protected JpaSpecificationRepository<E, Long> repo;
	
	@Autowired
	private Map<String, IListRules<E>> rulesByEntity;
	
	protected String context;
	protected String entityName;
	
	
	public Page<E> list(Pageable pageable) {
		return repo.findByEnabledTrue(pageable);
	}
	
	public Optional<E> getEntity(Long entityId) {
		return repo.findByIdAndEnabledTrue(entityId);
	}
	
	public E saveEntity(E entity) {
		this.context = "SAVE";
		this.executeRules(entity);
		return repo.save(entity);
	}
	
	public E updateEntity(E entity) {
		this.context = "UPDATE";
		this.executeRules(entity);
		return repo.saveAndFlush(entity);
	}
	
	public String getEntityName() {
		return this.entityName;
	}
	
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	
	
	public abstract List<E> searchBy(String filter);
	
	private void executeRules(E entity) {
		rulesByEntity.get(this.entityName).getRules(this.context).forEach(str -> {
			str.process(entity);
		});
	}

}
