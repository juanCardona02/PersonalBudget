package com.mipresupuesto.personalbudget.specification.implementation;

import com.mipresupuesto.personalbudget.specification.ISpecification;
import com.mipresupuesto.personalbudget.specification.component.AndNotSpecification;
import com.mipresupuesto.personalbudget.specification.component.AndSpecification;
import com.mipresupuesto.personalbudget.specification.component.NotSpecification;
import com.mipresupuesto.personalbudget.specification.component.OrNotSpecification;
import com.mipresupuesto.personalbudget.specification.component.OrSpecification;

public abstract class CompositeSpecification implements ISpecification{

	public abstract boolean isSatisfiedBy(Object candidate);

	public ISpecification and(ISpecification other) {
		return new AndSpecification(this, other);
	}
	
	public ISpecification andNot(ISpecification other) {
		return new AndNotSpecification(this, other);
	}
	
	public ISpecification or(ISpecification other) {
		return new OrSpecification(this, other);
	}
	
	public ISpecification orNot(ISpecification other) {
		return new OrNotSpecification(this, other);
	}
	
	public ISpecification not() {
		return new NotSpecification(this);
	}
}
