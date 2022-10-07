package com.mipresupuesto.personalbudget.domain;

public class PersonDomain {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;

	private PersonDomain(String id, String idCard,String firstName,String middleName,String lastName){
		
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		/*
		this.id=id;
		this.idCard=idCard;
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;*/
		
	}
	
	public static PersonDomain create(String id, String idCard,String firstName,String middleName,String lastName) {
		
		return new PersonDomain(id, idCard, firstName, middleName, lastName);
	
	}

	
	private final void setId(String id) {
		this.id = (id == null) ? "" : id.trim();
	}

	private final void setIdCard(String idCard) {
		this.idCard = (idCard == null) ? "" : id.trim();
	}

	private final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private final void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	
	}
	
	public final String getId() {
		return id;
	}

	public final String getIdCard() {
		return idCard;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getMiddleName() {
		return middleName;
	}
	
	public final String getLastName() {
		return lastName;
	}

	
	
	
}
