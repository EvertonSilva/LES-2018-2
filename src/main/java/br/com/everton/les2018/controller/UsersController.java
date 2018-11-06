package br.com.everton.les2018.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.everton.les2018.model.User;
import br.com.everton.les2018.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UsersController extends BaseController<User> {
	
	@GetMapping("/current")
	public User getCurrentUser() {
		return super.currentUser();
	}
	
	@GetMapping
	public Optional<User> findByIdDoc(@RequestParam(value = "id-doc") String doc) {
		return ((UserService)service).findByIdDocument(doc);
	}

}
