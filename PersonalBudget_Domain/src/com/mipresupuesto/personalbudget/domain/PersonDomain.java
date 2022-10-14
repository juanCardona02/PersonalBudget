package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class PersonDomain {
	
	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;

	private PersonDomain(final UUID id,final String idCard,final String firstName,final String middleName,final String lastName){
		
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	
		
	}
	
	public static PersonDomain create(final UUID id,final String idCard,final String firstName,final String middleName,final String lastName) {
		
		return new PersonDomain(id, idCard, firstName, middleName, lastName);
	
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

	
	
	
}
