package com.mipresupuesto.personalbudget.application.dtoassembler;

//DTO=D
//Domain=D
public interface DTOAssambler<T,D> {
	
	D assembleDomain(T dto);
	T assembleDTO(D domain);
	

}
 