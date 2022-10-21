package com.mipresupuesto.personalbudget.application.entityassembler;

public interface EntityAssembler<E,D> {
	
	D assembleDomain(E entity);
	E assembleEntity(D domain);
	
	

}
