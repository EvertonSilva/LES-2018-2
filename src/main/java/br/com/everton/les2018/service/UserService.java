package br.com.everton.les2018.service;

import java.util.List;
import java.util.Optional;

import br.com.everton.les2018.model.OverdueFine;
import br.com.everton.les2018.model.Student;
import br.com.everton.les2018.persistence.repository.BookLoanRepository;
import br.com.everton.les2018.persistence.repository.OverdueFineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.everton.les2018.model.User;
import br.com.everton.les2018.persistence.repository.UserRepository;

@Service
public class UserService extends CrudService<User> {

	@Autowired
	private OverdueFineRepository overdueFineRepo;

	public UserService() {
		super.entityName = "user";
	}
	
	public Optional<User> findByIdDocument(String document) {
		return ((UserRepository)repo).findByIdDocument(document);
	}

	public Page<User> listStudents(Pageable pageable) {
		return ((UserRepository)repo).findAllStudents(pageable);
	}

	public List<OverdueFine> getDebit(Long userId) {
		return overdueFineRepo.findByUser(userId);
	}

	@Override
	public List<User> searchBy(String filter) {
		return null;
	}

}
