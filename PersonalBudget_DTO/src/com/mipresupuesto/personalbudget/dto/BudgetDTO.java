package com.mipresupuesto.personalbudget.dto;

public class BudgetDTO {

	private YearEntity year;
	private PersonDTO person;

	public BudgetDTO() {

		setYear(YearEntity.create());
		setPerson(PersonDTO.create());

	}

	public BudgetDTO(final YearEntity year, final PersonDTO person) {
		setYear(year);
		setPerson(person);
	}

	public static final BudgetDTO create() {
		return new BudgetDTO();
	}

	public final YearEntity getYear() {

		if (year == null) {
			setYear(YearEntity.create());
		}
		return year;
	}

	public final void setYear(YearEntity year) {
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
