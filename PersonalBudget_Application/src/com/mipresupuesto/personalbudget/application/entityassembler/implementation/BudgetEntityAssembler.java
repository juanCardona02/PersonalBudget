package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.entity.BudgetEntity;
import com.mipresupuesto.personalbudget.entity.YearEntity;

@Component
public class BudgetEntityAssembler implements EntityAssembler<BudgetEntity,BudgetDomain>{

	@Override
	public BudgetDomain assembleDomain(BudgetEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BudgetEntity assembleEntity(BudgetDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
