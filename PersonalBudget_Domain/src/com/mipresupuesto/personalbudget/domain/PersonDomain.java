package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonDomain {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String completeName;
	private String name;

	private PersonDomain(final UUID id,final String idCard,final String firstName,final String middleName,final String lastName,final String name,final String completeName){
		
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setName(name);
		setCompleteName(completeName);
		
	
		
	}
	
	public static PersonDomain create(final UUID id,final String idCard,final String firstName,final String middleName,final String lastName,final String name,final String completeName) {
		
		return new PersonDomain(id, idCard, firstName, middleName, lastName,name,completeName);
	
	}

	
	private final void setId(final UUID id) {
		//this.id = (id == null) ?  UtilUUID.DEFAULT_UUID : id;
		this.id = UtilUUID.getDefaultUUID(id);

	}

	private final void setIdCard(final String idCard) {
		this.idCard = (idCard == null) ? "" : idCard.trim();
	}

	private final void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	private final void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public final void setLastName(final String lastName) {
		this.lastName = lastName;
	
	}
	private final void setName(final String name) {
		this.name = name;
	}
	private final void setCompleteName(final String completeName) {
		this.completeName = completeName;
	}

	
	public final UUID getId() {
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
	
	public final String getName() {
		return (getFirstName() + " " + getMiddleName().trim());
	}

	public String getCompleteName() {
		return completeName;
	}

	
	
	
	
}
