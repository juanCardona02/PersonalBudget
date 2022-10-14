package com.mipresupuesto.personalbudget.dto;

public class YearEntity {
	
	private String id;
	private int year;
	
	public YearEntity() {
		setId("");
		setYear(0);
	}
	public YearEntity(final String id,final int year) {
		setId(id);
		setYear(year);
		
	}
	
	public static final YearEntity create() {
		return new YearEntity();
	}
	
	public final String getId() {
		
		if (id == null || "".equals(id.trim())) {
			setId("");
		}
		return id;
	}
	public final void setId(final String id) {
		this.id = id;
	}
	public final int getYear() {
		if (year < 0) {
			setYear(0);
		}
		return year;
	}
	public final void setYear(final int year) {
		this.year = year;
	}

}
