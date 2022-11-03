package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;

@Entity
@Table(name = "Budget")
public class BudgetEntity {

	@Id
	@Column(name = "id")
	private UUID id;

	// muchos a uno
	@ManyToOne
	@JoinColumn(name = "idYear")
	private YearEntity year;
	@ManyToOne
	@JoinColumn(name = "idPerson")
	private PersonEntity person;

	public BudgetEntity() {

		setYear(new YearEntity());
		setPerson(new PersonEntity());

	}

	public UUID getId() {

		return id;
	}

	public void setId(final UUID id) {
		this.id = id;
	}

	public BudgetEntity(final UUID id, final YearEntity year, final PersonEntity person) {
		setId(id);
		setYear(year);
		setPerson(person);
	}

	public YearEntity getYear() {

		if (UtilObject.getUtilObject().isNull(year)) {
			setYear(new YearEntity());
		}
		return year;
	}

	public void setYear(YearEntity year) {
		this.year = UtilObject.getUtilObject().getDefault(year, new YearEntity());
	}

	public PersonEntity getPerson() {

		if (UtilObject.getUtilObject().isNull(person)) {
			setPerson(new PersonEntity());
		}
		return person;
	}

	public void setPerson(PersonEntity person) {
		this.person = UtilObject.getUtilObject().getDefault(person, new PersonEntity());
	}

}
