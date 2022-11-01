package com.mipresupuesto.personalbudget.specification.component;

import com.mipresupuesto.personalbudget.specification.ISpecification;
import com.mipresupuesto.personalbudget.specification.implementation.CompositeSpecification;

public class AndSpecification extends CompositeSpecification{

	private ISpecification leftCondition;
	private ISpecification rightCondition;
	
	public AndSpecification(ISpecification left, ISpecification right) {
		this.leftCondition = left;
		this.rightCondition = right;
	}
	
	public boolean isSatisfiedBy(Object candidate) {
		return leftCondition.isSatisfiedBy(candidate) && rightCondition.isSatisfiedBy(candidate);
	}
}
