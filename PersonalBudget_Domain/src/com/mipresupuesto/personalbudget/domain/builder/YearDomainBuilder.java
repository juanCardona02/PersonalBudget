package com.mipresupuesto.personalbudget.domain.builder;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.YearDomain;

/*
 * COntruye Objetos year domain
 */
public class YearDomainBuilder {

	private UUID id;
	private int year;

	private YearDomainBuilder() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}

	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}

	public final YearDomainBuilder setId(final UUID id) {
		//this.id = (id == null) ?  UtilUUID.DEFAULT_UUID : id;
		this.id = UtilUUID.getDefaultUUID(id);
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}

	/*
	 * Usted esta es construyendo por eso es private
	 */
	private final UUID getId() {
		return id;
	}

	private final int getYear() {
		return year;
	}

	public YearDomain build() {

		return YearDomain.create(getId(), getYear());
	}

}
