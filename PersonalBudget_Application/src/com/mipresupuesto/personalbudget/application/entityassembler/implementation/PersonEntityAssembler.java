package com.mipresupuesto.personalbudget.application.entityassembler.implementation;

import com.mipresupuesto.personalbudget.application.entityassembler.EntityAssembler;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.domain.builder.PersonDomainBuilder;
import com.mipresupuesto.personalbudget.entity.PersonEntity;

public class PersonEntityAssembler implements EntityAssembler<PersonEntity, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonEntity entity) {
		PersonDomain domain = PersonDomainBuilder.get().build();
		if (UtilObject.getUtilObject().isNull(entity)) {
			domain = PersonDomainBuilder.get().setId(entity.getId()).setFirstName(entity.getFirstName())
					.setLastName(entity.getLastName()).setIdCard(entity.getIdCard())
					.setMiddleName(entity.getMiddleName()).build();
		}
		return domain;
	}

	@Override
	public PersonEntity assembleEntity(PersonDomain domain) {
		PersonEntity entity = new PersonEntity();
		if (UtilObject.getUtilObject().isNull(domain)) {
			entity = new PersonEntity(domain.getId(), domain.getIdCard(), domain.getFirstName(), domain.getMiddleName(),
					domain.getLastName(), domain.getName(), domain.getCompleteName());
		}
		return entity;
	}

}
