package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;

public class BudgetDomain {
	
	private UUID id;
	private YearDomain year;
	private PersonDomain person;

	private BudgetDomain(final UUID id,final YearDomain year,final PersonDomain person) {
		setId(id);
		setYear(year);
		setPerson(person);

	}

	public static BudgetDomain create(final UUID id,final YearDomain year,final PersonDomain person) {
		return new BudgetDomain(id,year, person);

	}

	public YearDomain getYear() {
		return year;
	}

	private void setYear(final YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build() : year;
	}

	public PersonDomain getPerson() {
		return person;
	}

	private void setPerson(final PersonDomain person) {

		this.person = (person == null) ? PersonDomainBuilder.get().build() : person;

	}

	public UUID getId() {
		return id;
	}

	public void setId(final UUID id) {
		this.id = (id == null) ?  UUID.randomUUID() : id;
	}
	

}
