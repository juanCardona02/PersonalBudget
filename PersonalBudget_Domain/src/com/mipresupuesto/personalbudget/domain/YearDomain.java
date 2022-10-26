package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscuting.util.numeric.UtilNumeric;
import com.mipresupuesto.personalbudget.crosscutting.util.uuid.UtilUUID;

public final class YearDomain {
	
	private UUID id;
	private int year;
	
	private YearDomain(final UUID id,final int year){
		setId(id);
		setYear(year);
	}
	
	public static YearDomain create(final UUID id,final int year) {
		
		return new YearDomain(id,year);
	
	}
	
	private final void setId(final UUID id) {
		//this.id = (id == null) ?  UtilUUID.DEFAULT_UUID : id;
		this.id = UtilUUID.getDefaultUUID(id);

	}

	private final void setYear(final int year) {
		this.year = (int) UtilNumeric.getDefault(year);
		
	}

	public final UUID getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}
	
	

}
