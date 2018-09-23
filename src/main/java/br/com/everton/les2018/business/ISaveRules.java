package br.com.everton.les2018.business;

import java.util.List;

public interface ISaveRules<T> {
	
	List<IStrategy<T>> getSaveRules();
}
