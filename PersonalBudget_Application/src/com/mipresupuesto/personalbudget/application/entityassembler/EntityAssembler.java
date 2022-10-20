package com.mipresupuesto.personalbudget.application.entityassembler;

public interface EntityAssembler<E,D> {
	
	D assembleDTO(E entity);
	E assembleEntity(D dto);
	
	

}
