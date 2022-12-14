package com.mipresupuesto.personalbudget.dto;

import com.mipresupuesto.personalbudget.crosscuting.util.numeric.UtilNumeric;
import com.mipresupuesto.personalbudget.crosscuting.util.text.UtilText;

public class YearDTO {
	
	private String id;
	private int year;
	
	public YearDTO() {
		setId(UtilText.EMPTY);
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
			setId(UtilText.EMPTY);
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
		this.year = (int) UtilNumeric.getDefault(year);
	}

}
