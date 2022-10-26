package com.mipresupuesto.personalbudget.dto;

import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;

public class BudgetDTO {

	private YearDTO year;
	private PersonDTO person;

	public BudgetDTO() {

		setYear(YearDTO.create());
		setPerson(PersonDTO.create());

	}

	public BudgetDTO(final YearDTO year, final PersonDTO person) {
		setYear(year);
		setPerson(person);
	}

	public static final BudgetDTO create() {
		return new BudgetDTO();
	}

	public final YearDTO getYear() {

		if (UtilObject.getUtilObject().isNull(year)) {
			setYear(YearDTO.create());
		}
		return year;
	}

	public final void setYear(YearDTO year) {
		this.year = UtilObject.getUtilObject().getDefault(year, new YearDTO());
	}

	public final PersonDTO getPerson() {

		if (UtilObject.getUtilObject().isNull(person)) {
			setPerson(PersonDTO.create());
		}
		return person;
	}

	public final void setPerson(PersonDTO person) {
		this.person = UtilObject.getUtilObject().getDefault(person, new PersonDTO());
	}

}
