package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscuting.util.numeric.UtilNumeric;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
@Table(name = "Year")
public class YearEntity {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "year")
	private int year;

	public YearEntity() {
		setYear(0);
	}

	public YearEntity(final UUID id, final int year) {
		setId(id);
		setYear(year);

	}

	public UUID getId() {

		return id;
	}

	public void setId(final UUID id) {
		this.id = id;
	}

	public int getYear() {
		if (year < 0) {
			setYear(0);
		}
		return year;
	}

	public void setYear(final int year) {
		this.year = (int) UtilNumeric.getDefault(year);
	}

}
