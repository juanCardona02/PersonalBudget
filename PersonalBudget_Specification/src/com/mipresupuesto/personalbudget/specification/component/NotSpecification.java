package com.mipresupuesto.personalbudget.specification.component;

import com.mipresupuesto.personalbudget.specification.ISpecification;
import com.mipresupuesto.personalbudget.specification.implementation.CompositeSpecification;

public class NotSpecification extends CompositeSpecification{
	private ISpecification mapped;
	public NotSpecification(ISpecification k) {
		mapped = k;
	}
	
	public boolean isSatisfiedBy(Object candidate) {
		return !mapped.isSatisfiedBy(candidate);
	}
}
