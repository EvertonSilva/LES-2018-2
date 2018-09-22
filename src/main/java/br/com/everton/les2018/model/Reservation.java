package br.com.everton.les2018.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reserve extends LibraryTransaction {

	private static final long serialVersionUID = 1L;
	

}
