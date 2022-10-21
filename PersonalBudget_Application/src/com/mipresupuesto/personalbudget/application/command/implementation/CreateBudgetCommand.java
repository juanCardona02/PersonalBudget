package com.mipresupuesto.personalbudget.application.command.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssambler;
import com.mipresupuesto.personalbudget.application.service.interfaces.CreateBudgetUseCase;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@Service
public class CreateBudgetCommand  implements CreateBudgetPort {
	
	private DTOAssambler<BudgetDTO,BudgetDomain> dtoAssambler;
	
	@Autowired
	private CreateBudgetUseCase useCase;

	@Override
	public void exceute(BudgetDTO budget) {
		
		useCase.execute(dtoAssambler.assembleDomain(budget));
		
	}

}
