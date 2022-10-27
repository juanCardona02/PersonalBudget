package com.mipresupuesto.personalbudget.crosscuting.exception;

import com.mipresupuesto.personalbudget.crosscuting.exception.enumeration.ExceptionLocation;
import com.mipresupuesto.personalbudget.crosscuting.exception.enumeration.ExceptionType;
import com.mipresupuesto.personalbudget.crosscuting.exception.general.GeneralException;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;

public class PersonalBudgetException extends GeneralException {

	private PersonalBudgetException(String userMessage, String technicalMessage, Exception rootException,
			ExceptionType type, ExceptionLocation location) {
		super(userMessage, technicalMessage, rootException);
		setType(type);
		setLocation(location);
	}

	public static PersonalBudgetException buildUserException(String userMessage) {
		return new PersonalBudgetException(userMessage, userMessage, null, ExceptionType.BUSINESS, null);
	}

	public static PersonalBudgetException buildTechnicalException(String technicalMessage) {
		return new PersonalBudgetException(null, technicalMessage, null, ExceptionType.TECHNICAL, null);
	}

	public static PersonalBudgetException buildTechnicalException(String technicalMessage, Exception rootException,
			ExceptionLocation location) {
		return new PersonalBudgetException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, location);
	}

	public static PersonalBudgetException buildTechnicalDataException(String technicalMessage) {
		return new PersonalBudgetException(null, technicalMessage, null, ExceptionType.TECHNICAL,
				ExceptionLocation.DATA);
	}

	public static PersonalBudgetException buildTechnicalBusinessLogicException(String technicalMessage) {
		return new PersonalBudgetException(null, technicalMessage, null, ExceptionType.TECHNICAL,
				ExceptionLocation.BUSINESS_LOGIC);
	}

	public static PersonalBudgetException buildBusinessLogicException(String bussinesMessage) {
		return new PersonalBudgetException(bussinesMessage, null, null, ExceptionType.BUSINESS,
				ExceptionLocation.BUSINESS_LOGIC);
	}

	public static PersonalBudgetException buildTechnicalDataException(String technicalMessage,
			Exception rootException) {
		return new PersonalBudgetException(null, technicalMessage, rootException, ExceptionType.TECHNICAL,
				ExceptionLocation.DATA);
	}

	public static PersonalBudgetException build(String userMessage, String technicalMessage) {
		return new PersonalBudgetException(userMessage, technicalMessage, null, null, null);
	}

	public static PersonalBudgetException build(String userMessage, String technicalMessage, Exception rootException) {
		return new PersonalBudgetException(userMessage, technicalMessage, rootException, null, null);
	}

	private static final long serialVersionUID = 625249639280789375L;

	private ExceptionType type;
	private ExceptionLocation location;

	private void setType(ExceptionType type) {
		this.type = UtilObject.getUtilObject().getDefault(type, ExceptionType.GENERAL);
	}

	private void setLocation(ExceptionLocation location) {
		this.location = UtilObject.getUtilObject().getDefault(location, ExceptionLocation.GENERAL);
		;
	}

	public ExceptionType getType() {
		return type;
	}

	public ExceptionLocation getLocation() {
		return location;
	}
}