package br.com.everton.les2018.business.user;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.everton.les2018.business.IListRules;
import br.com.everton.les2018.business.IStrategy;
import br.com.everton.les2018.model.User;

@Component("user")
public class UserRules implements IListRules<User> {

	@Override
	public List<IStrategy<User>> getRules(String context) {
		return Collections.emptyList();
	}

}
