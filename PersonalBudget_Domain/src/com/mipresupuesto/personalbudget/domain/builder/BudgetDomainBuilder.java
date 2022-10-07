package com.mipresupuesto.personalbudget.domain.builder;

import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	
	private YearDomain year;
	private PersonDomain person;

	private BudgetDomainBuilder() {
		setYear(year);
		setPerson(person);

	}

	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();

	}

	private final YearDomain getYear() {
		return year;
	}

	public final BudgetDomainBuilder setYear(YearDomain year) {
		this.year = (year == null) ? YearDomainBuilder.get().build() : year;
		return this;
	}

	private PersonDomain getPerson() {
		return person;
	}

	public final BudgetDomainBuilder setPerson(PersonDomain person) {

		this.person = (person == null) ? PersonDomainBuilder.get().build() : person;
		return this;

	}
	
	public BudgetDomain build() {

		return BudgetDomain.create(getYear(), getPerson());
	}

}
