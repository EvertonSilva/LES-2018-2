package br.com.everton.les2018.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.everton.les2018.model.OverdueFine;
import br.com.everton.les2018.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import br.com.everton.les2018.model.User;
import br.com.everton.les2018.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UsersController extends BaseController<User> {
	
	@GetMapping
	public Optional<User> findByIdDoc(@RequestParam(value = "id-doc") String doc) {
		return ((UserService)service).findByIdDocument(doc);
	}

	@GetMapping("/students")
	public Page<User> getAllStudents(Pageable pageable) {
		return ((UserService)service).listStudents(pageable);
	}

	@GetMapping("/current")
	public User getCurrentUser() {
		return super.currentUser();
	}

	@GetMapping("/{userId}/debit")
	public List<OverdueFine> getUserDebit(@PathVariable Long userId) {
		return ((UserService)service).getDebit(userId);
	}

}
