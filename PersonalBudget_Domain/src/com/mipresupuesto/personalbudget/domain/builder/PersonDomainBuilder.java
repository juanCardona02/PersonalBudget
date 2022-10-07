package com.mipresupuesto.personalbudget.domain.builder;

import com.mipresupuesto.personalbudget.domain.PersonDomain;

public class PersonDomainBuilder {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	
	private PersonDomainBuilder() {
		
		setId("");
		setIdCard("");
		setFirstName("");
		setMiddleName("");
		setLastName("");
	}
	

	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}


	public final PersonDomainBuilder setId(String id) {
		this.id = (id == null) ? "" : id.trim();
		return this;	
	
	}


	public final PersonDomainBuilder setIdCard(String idCard) {
		
		this.idCard = (idCard == null) ? "" : idCard.trim();
		return this;

	}


	public final PersonDomainBuilder setFirstName(String firstName) {
		this.firstName = (firstName == null) ? "" : firstName.trim();
		return this;
		
	}


	public final PersonDomainBuilder setMiddleName(String middleName) {
		
		this.middleName = (middleName == null) ? "" : middleName.trim();
		return this;

	}


	public final PersonDomainBuilder setLastName(String lastName) {
		this.lastName = (lastName == null) ? "" : lastName.trim();
		return this;

	}


	private final String getId() {
		return id;
	}


	private final String getIdCard() {
		return idCard;
	}


	private final String getFirstName() {
		return firstName;
	}


	private final String getMiddleName() {
		return middleName;
	}


	private final String getLastName() {
		return lastName;
	}
	
	public PersonDomain build() {

		return PersonDomain.create(getId(), getIdCard(),getFirstName(),getMiddleName(),getLastName());
	}
	
	

}
