package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscuting.util.text.UtilText;
import com.mipresupuesto.personalbudget.crosscutting.util.uuid.UtilUUID;

@Entity
@Table(name = "Person")
public class PersonEntity {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "idCard")
	private String idCard;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "middleName")
	private String middleName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "name")
	private String name;
	@Column(name = "completeName")
	private String completeName;

	public PersonEntity() {

		setId(UtilUUID.DEFAULT_UUID);
		setIdCard(UtilText.EMPTY);
		setFirstName(UtilText.EMPTY);
		setMiddleName(UtilText.EMPTY);
		setLastName(UtilText.EMPTY);
		setName(UtilText.EMPTY);
		setCompleteName(UtilText.EMPTY);

	}

	public PersonEntity(final UUID id, final String idCard, final String firstName, final String middleName,
			final String lastName, final String name, final String completeName) {

		setId(id);
		setIdCard(idCard);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setName(name);
		setCompleteName(completeName);

	}

	public void setId(final UUID id) {
		this.id = id;
	}

	public  void setIdCard(final String idCard) {
		this.idCard = UtilText.getDefault(idCard);
	}

	public  void setFirstName(final String firstName) {
		this.firstName = UtilText.getDefault(firstName);
	}

	public  void setMiddleName(final String middleName) {
		this.middleName = UtilText.getDefault(middleName);
	}

	public  void setLastName(final String lastName) {
		this.lastName = UtilText.getDefault(lastName);

	}

	public  UUID getId() {

		if (UtilUUID.isNull(id)) {
			setId(UtilUUID.DEFAULT_UUID);
		}

		return id;
	}

	public  String getIdCard() {

		if (UtilText.isNull(idCard)) {
			setIdCard(UtilText.EMPTY);
		}
		return UtilText.trim(idCard);
	}

	public  String getFirstName() {
		if (UtilText.isNull(firstName)) {
			setFirstName(UtilText.EMPTY);
		}
		return UtilText.trim(firstName);
	}

	public  String getMiddleName() {
		if (UtilText.isNull(middleName)) {
			setMiddleName(UtilText.EMPTY);
		}
		return UtilText.trim(middleName);
	}

	public  String getLastName() {
		if (UtilText.isNull(lastName)) {
			setLastName(UtilText.EMPTY);
		}
		return UtilText.trim(lastName);
	}

	public String getName() {
		if (UtilText.isNull(name)) {
			setName(UtilText.EMPTY);
		}
		return UtilText.trim(name);
	}

	public void setName(String name) {
		this.name = UtilText.getDefault(name);
	}

	public String getCompleteName() {

		if (UtilText.isNull(completeName)) {
			setCompleteName(UtilText.EMPTY);
		}
		return UtilText.trim(completeName);
	}

	public void setCompleteName(String completeName) {
		this.completeName = UtilText.getDefault(completeName);
	}

}
