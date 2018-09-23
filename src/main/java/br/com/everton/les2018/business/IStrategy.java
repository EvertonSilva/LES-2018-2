package br.com.everton.les2018.business;

import org.springframework.stereotype.Component;

@Component
public interface IStrategy<T> {
	
	void process(T entity);
}
