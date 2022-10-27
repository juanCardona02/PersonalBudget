package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;

@Component
public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity,BudgetDomain>{

	PersonEntityAssembler personAssembler = new PersonEntityAssembler();
	YearEntityAssembler yearAssembler = new YearEntityAssembler();

	@Override
	public BudgetDomain assembleDomain(BudgetEntity entity) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		if (UtilObject.getUtilObject().isNull(entity)) {
			domain = BudgetDomainBuilder.get().setId(entity.getId())
					.setPerson(personAssembler.assembleDomain(entity.getPerson()))
					.setYear(yearAssembler.assembleDomain(entity.getYear())).build();
		}
		return domain;
	}

	@Override
	public BudgetEntity assembleEntity(BudgetDomain domain) {
		BudgetEntity entity = new BudgetEntity();
		if (UtilObject.getUtilObject().isNull(domain)) {
			entity = new BudgetEntity(domain.getId(), yearAssembler.assembleEntity(domain.getYear()),
					personAssembler.assembleEntity(domain.getPerson()));
		}
		return entity;
	}


}
