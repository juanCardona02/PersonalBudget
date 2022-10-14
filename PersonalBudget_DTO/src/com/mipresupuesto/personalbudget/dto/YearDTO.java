package com.mipresupuesto.personalbudget.dto;

public class YearDTO {
	
	private String id;
	private int year;
	
	public YearDTO() {
		setId("");
		setYear(0);
	}
	public YearDTO(final String id,final int year) {
		setId(id);
		setYear(year);
		
	}
	
	public static final YearDTO create() {
		return new YearDTO();
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
