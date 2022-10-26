package com.mipresupuesto.personalbudget.dto;

import com.mipresupuesto.personalbudget.crosscuting.util.text.UtilText;

public class PersonDTO {
	
	private String id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String name;
	private String completeName;
	
	public PersonDTO() {
		

		setId(UtilText.EMPTY);
		setIdCard(UtilText.EMPTY);
		setFirstName(UtilText.EMPTY);
		setMiddleName(UtilText.EMPTY);
		setLastName(UtilText.EMPTY);
		setName(UtilText.EMPTY);
		setCompleteName(UtilText.EMPTY);
		
	}
	public PersonDTO(final String id,final String idCard,final String firstName,final String middleName,final String lastName,final String name, final String completeName){
		
		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setName(name);
		setCompleteName(completeName);
		
	}
	
	public static final PersonDTO create() {
		
		return new PersonDTO();
	}
	
	public final void setId(final String id) {
		this.id= id;
	}

	public final void setIdCard(final String idCard) {
		this.idCard = UtilText.getDefault(idCard);
	}

	public final void setFirstName(final String firstName) {
		this.firstName = UtilText.getDefault(firstName);
	}

	public final void setMiddleName(final String middleName) {
		this.middleName = UtilText.getDefault(middleName);
	}

	public final void setLastName(final String lastName) {
		this.lastName = UtilText.getDefault(lastName);
	
	}
	
	public final String getId() {
		if (UtilText.isNull(id)) {
			setId(UtilText.EMPTY);
		}
		return id.trim();
	}

	public final String getIdCard() {
		
		if (UtilText.isNull(idCard)) {
			setIdCard(UtilText.EMPTY);
		}
		return idCard.trim();
	}

	public final String getFirstName() {
		if (UtilText.isNull(firstName)) {
			setFirstName(UtilText.EMPTY);
		}
		return firstName.trim();
	}

	public final String getMiddleName() {
		if (UtilText.isNull(middleName)) {
			setMiddleName(UtilText.EMPTY);
		}
		return middleName.trim();
	}
	
	public final String getLastName() {
		if (UtilText.isNull(lastName) ) {
			setLastName(UtilText.EMPTY);
		}
		return lastName.trim();
	}
	public String getName() {
		if (UtilText.isNull(name)) {
			setName(UtilText.EMPTY);
		}
		return name.trim();
	}
	public void setName(String name) {
		this.name = UtilText.getDefault(name);
	}
	public String getCompleteName() {
		
		if (UtilText.isNull(completeName)) {
			setCompleteName(UtilText.EMPTY);
		}
		return completeName.trim();
	}
	public void setCompleteName(String completeName) {
		this.completeName = UtilText.getDefault(completeName);
	}



}
