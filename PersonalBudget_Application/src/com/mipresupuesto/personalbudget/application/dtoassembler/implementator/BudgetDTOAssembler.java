package com.mipresupuesto.personalbudget.application.dtoassembler.implementator;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssambler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@Component
public class BudgetDTOAssembler implements DTOAssambler<BudgetDTO, BudgetDomain> {
	PersonDTOAssembler personAssembler = new PersonDTOAssembler();
	YearDTOAssembler yearAssembler = new YearDTOAssembler();

	@Override
	public BudgetDomain assembleDomain(final BudgetDTO dto) {
		BudgetDomain domain = BudgetDomainBuilder.get().build();
		if (UtilObject.getUtilObject().isNull(dto)) {
			domain = BudgetDomainBuilder.get().setPerson(personAssembler.assembleDomain(dto.getPerson()))
					.setYear(yearAssembler.assembleDomain(dto.getYear())).build();
		}
		return domain;
	}

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
		BudgetDTO budgetDto = new BudgetDTO();
		if (UtilObject.getUtilObject().isNull(domain)) {
			budgetDto = new BudgetDTO(yearAssembler.assembleDTO(domain.getYear()),
					personAssembler.assembleDTO(domain.getPerson()));
		}
		return budgetDto;
	}

}
