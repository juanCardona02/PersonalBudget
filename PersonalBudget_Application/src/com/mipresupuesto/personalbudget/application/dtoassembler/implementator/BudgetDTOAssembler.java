package com.mipresupuesto.personalbudget.application.dtoassembler.implementator;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssambler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.crosscutting.util.uuid.UtilUUID;
import com.mipresupuesto.personalbudget.domain.BudgetDomain;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.domain.builder.BudgetDomainBuilder;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;
import com.mipresupuesto.personalbudget.dto.YearDTO;

@Component
public class BudgetDTOAssembler implements DTOAssambler<BudgetDTO, BudgetDomain> {

	@Override
	public BudgetDomain assembleDomain(BudgetDTO dto) {

		BudgetDomain domain = BudgetDomainBuilder.get().build();

		if (!UtilObject.getUtilObject().isNull(dto)) {
			domain = BudgetDomainBuilder.get()
					.build();

			//domain = BudgetDomainBuilder.get().setYear(dto.getYear()).setPerson(dto.getPerson()).build();
		}
		return domain;
		
	}

	@Override
	public BudgetDTO assembleDTO(BudgetDomain domain) {
	
		BudgetDTO dto = new BudgetDTO();

		if (!UtilObject.getUtilObject().isNull(domain)) {
			
			dto = new BudgetDTO();
			//dto = new BudgetDTO(domain.getYear(), domain.getPerson());
		}
		return dto;
	}

}
