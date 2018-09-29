package br.com.everton.les2018.business;

import java.util.List;

public interface IListRules<T> {
	
	List<IStrategy<T>> getRules(String context);
}
