package com.mipresupuesto.personalbudget.application.dtoassembler.implementator;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssambler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.crosscutting.util.uuid.UtilUUID;
import com.mipresupuesto.personalbudget.domain.YearDomain;
import com.mipresupuesto.personalbudget.domain.builder.YearDomainBuilder;
import com.mipresupuesto.personalbudget.dto.YearDTO;

public final class YearDTOAssembler implements DTOAssambler<YearDTO, YearDomain> {

	@Override
	public YearDomain assembleDomain(YearDTO dto) {

		YearDomain domain = YearDomainBuilder.get().build();

		if (!UtilObject.getUtilObject().isNull(dto)) {

			domain = YearDomainBuilder.get().setId(UtilUUID.getUUIDFromString(dto.getId())).setYear(dto.getYear())
					.build();
		}
		return domain;
	}

	@Override
	public YearDTO assembleDTO(YearDomain domain) {

		YearDTO dto = new YearDTO();

		if (!UtilObject.getUtilObject().isNull(domain)) {
			dto = new YearDTO(UtilUUID.getStringFromUUID(domain.getId()), domain.getYear());
		}
		return dto;
	}

}
