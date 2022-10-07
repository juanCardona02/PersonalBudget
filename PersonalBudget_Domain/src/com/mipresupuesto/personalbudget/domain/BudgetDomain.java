package com.mipresupuesto.personalbudget.domain;

public class BudgetDomain {
	
	private YearDomain year;
	private PersonDomain person;
	

	private BudgetDomain(YearDomain year,PersonDomain person){
		
		this.year=year;
		this.person=person;
		
	}
	
	public static BudgetDomain builder(YearDomain year,PersonDomain person) {
		return new BudgetDomain(year, year);
	
	}

	public YearDomain getYearDomain() {
		return year;
	}

	private void setYearDomain(YearDomain yearDomain) {
		this.year = yearDomain;
	}

	public PersonDomain getPersonDomain() {
		return person;
	}

	public void setPersonDomain(PersonDomain personDomain) {
		this.person = personDomain;
	}

	
	
	

}
