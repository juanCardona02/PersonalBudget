package com.mipresupuesto.personalbudget.application.service.interfaces;

import com.mipresupuesto.personalbudget.domain.BudgetDomain;

//Es la puerta de entrada
public interface CreateBudgetUseCase {
	
	void execute(BudgetDomain buget);

}
