package com.mipresupuesto.personalbudget.dto;

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

		if (year == null) {
			setYear(YearDTO.create());
		}
		return year;
	}

	public final void setYear(YearDTO year) {
		this.year = year;
	}

	public final PersonDTO getPerson() {

		if (person == null) {
			setPerson(PersonDTO.create());
		}
		return person;
	}

	public final void setPerson(PersonDTO person) {
		this.person = person;
	}

}
