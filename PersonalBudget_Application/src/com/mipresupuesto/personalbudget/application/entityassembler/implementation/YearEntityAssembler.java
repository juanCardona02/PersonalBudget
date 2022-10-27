package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;
import com.mipresupuesto.personalbudget.entity.YearEntity;

public class YearEntityAssembler implements EntityAssembler<YearEntity, YearDomain> {

	@Override
	public YearDomain assembleDomain(YearEntity entity) {
		YearDomain domain = YearDomainBuilder.get().build();
		if (UtilObject.getUtilObject().isNull(entity)) {
			domain = YearDomainBuilder.get().setId(entity.getId()).setYear(entity.getYear()).build();
		}
		return domain;
	}

	@Override
	public YearEntity assembleEntity(YearDomain domain) {
		YearEntity entity = new YearEntity();
		if (UtilObject.getUtilObject().isNull(domain)) {
			entity = new YearEntity(domain.getId(), domain.getYear());
		}
		return entity;
	}
}
