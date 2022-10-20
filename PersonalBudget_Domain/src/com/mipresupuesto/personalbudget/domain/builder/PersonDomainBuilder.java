package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscuting.util.text.UtilText;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;

public class PersonDomainBuilder {

	private UUID id;
	private String idCard;
	private String firstName;
	private String middleName;
	private String lastName;
	private String name;
	private String completeName;

	private PersonDomainBuilder() {

		setId(UtilUUID.DEFAULT_UUID);
		setIdCard(UtilText.EMPTY);
		setFirstName(UtilText.EMPTY);
		setMiddleName(UtilText.EMPTY);
		setLastName(UtilText.EMPTY);
		setName(UtilText.EMPTY);
		setCompleteName(UtilText.EMPTY);
		
	}

	public static final PersonDomainBuilder get() {
		return new PersonDomainBuilder();
	}

	public final PersonDomainBuilder setId(final UUID id) {
		//this.id = (id == null) ? UtilUUID.DEFAULT_UUID : id;
		this.id = UtilUUID.getDefaultUUID(id);

		return this;

	}

	public final PersonDomainBuilder setIdCard(final String idCard) {

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

	private final UUID getId() {
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

		return PersonDomain.create(getId(), getIdCard(), getFirstName(), getMiddleName(), getLastName(),getName(),getCompleteName());
	}

	private final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private final String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

}
