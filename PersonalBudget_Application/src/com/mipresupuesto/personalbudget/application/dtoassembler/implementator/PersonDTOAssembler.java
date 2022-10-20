package com.mipresupuesto.personalbudget.application.dtoassembler.implementator;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssambler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.dto.PersonDTO;

public class PersonDTOAssembler implements DTOAssambler<PersonDTO, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonDTO dto) {
		
		PersonDomain domain = PersonDomainBuilder.get().build();

		if (!UtilObject.getUtilObject().isNull(dto)) {

			domain = PersonDomainBuilder.get().setId(UtilUUID.getUUIDFromString(dto.getId())).setIdCard(dto.getIdCard()).setFirstName(dto.getFirstName()).setMiddleName(dto.getMiddleName()).setLastName(dto.getLastName())
					.build();
		}
		return domain;
	}
	

	@Override
	public PersonDTO assembleDTO(PersonDomain domain) {
		
		PersonDTO dto = new PersonDTO();

		if (!UtilObject.getUtilObject().isNull(domain)) {
			dto = new PersonDTO(UtilUUID.getStringFromUUID(domain.getId()), domain.getIdCard(), domain.getFirstName(),domain.getMiddleName(),domain.getLastName(),domain.getName(),domain.getCompleteName());
		}
		return dto;
	}

}
