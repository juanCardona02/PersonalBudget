package com.mipresupuesto.personalbudget.domain;

import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;

public class BudgetDomain {

	private YearDomain year;
	private PersonDomain person;

	private BudgetDomain(YearDomain year, PersonDomain person) {
		setYear(year);
		setPerson(person);

	}

	public static BudgetDomain create(YearDomain year, PersonDomain person) {
		return new BudgetDomain(year, person);

	}

	public YearDomain getYear() {
		return year;
	}

	private void setYear(YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build() : year;
	}

	public PersonDomain getPerson() {
		return person;
	}

	private void setPerson(PersonDomain person) {

		this.person = (person == null) ? PersonDomainBuilder.get().build() : person;

	}

}
