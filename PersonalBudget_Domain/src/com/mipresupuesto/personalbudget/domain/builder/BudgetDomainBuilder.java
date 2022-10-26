package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.crosscutting.util.uuid.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class BudgetDomainBuilder {
	
	private UUID id;
	private YearDomain year;
	private PersonDomain person;

	private BudgetDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(year);
		setPerson(person);

	}

	public static final BudgetDomainBuilder get() {
		return new BudgetDomainBuilder();

	}

	private final YearDomain getYear() {
		return year;
	}

	public final BudgetDomainBuilder setYear(final YearDomain year) {
		this.year = (UtilObject.getUtilObject().isNull(year)) ? YearDomainBuilder.get().build() : year;
		return this;
	}

	private PersonDomain getPerson() {
		return person;
	}

	public final BudgetDomainBuilder setPerson(final PersonDomain person) {

		this.person = (UtilObject.getUtilObject().isNull(person)) ? PersonDomainBuilder.get().build() : person;
		return this;

	}
	
	public BudgetDomain build() {

		return BudgetDomain.create(getId(),getYear(), getPerson());
	}

	public UUID getId() {
		return id;
	}

	public final BudgetDomainBuilder setId(final UUID id) {
		//this.id = (id == null) ?  UtilUUID.DEFAULT_UUID : id;
		this.id = UtilUUID.getDefaultUUID(id);
		return this;

	}

}
