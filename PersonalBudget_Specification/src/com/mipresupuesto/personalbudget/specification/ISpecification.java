package com.mipresupuesto.personalbudget.specification;

public interface ISpecification {
	
	boolean isSatisfiedBy(Object candidate);
	ISpecification and(ISpecification other);
	ISpecification andNot(ISpecification other);
	ISpecification or(ISpecification other);
	ISpecification orNot(ISpecification other);
	ISpecification not();
}
