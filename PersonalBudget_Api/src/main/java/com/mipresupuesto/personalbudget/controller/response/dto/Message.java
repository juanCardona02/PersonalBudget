package com.mipresupuesto.personalbudget.controller.response.dto;

import com.mipresupuesto.personalbudget.controller.response.enumeration.MessageLevel;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;
import com.mipresupuesto.personalbudget.crosscuting.util.text.UtilText;

public class Message {
	
	private String text;
	private String title;
	private MessageLevel level;
	

	private Message(String text, String title, MessageLevel level) {
		setText(text);
		setTitle(title);
		setLeve(level);
	}
	
	public static Message createMessage(String text, String title, MessageLevel level) {
		return new Message(text,title,level);
	}
	
	public static Message createMessage(String text,MessageLevel level) {
		return new Message(text,text,level);
	}
	public static Message createFatalMessage(final String text) {
		return new Message(text,text,MessageLevel.FATAL);
	}
	public static Message createErrorMessage(final String text) {
		return new Message(text,text,MessageLevel.ERROR);	
	}
	public static Message createWarningMessage(String text) {
		return new Message(text,text,MessageLevel.WARNING);
	}
	public static Message createInformationMessage(String text) {
		return new Message(text,text,MessageLevel.INFORMATION);
	}
	
	public static Message createSuccesMessage(String text) {
		return new Message(text,text,MessageLevel.SUCCES);
	}
	
	private void setText(String text) {
		
		if(UtilText.isNull(text)){
			this.text=UtilText.EMPTY;
		}
		UtilText.trim(text);
	}

	public String getText() {
		return text;
	}

	public String getTitle() {
		return title;
	}
	
	public MessageLevel getLevel() {
		return level;
	}

	private void setTitle(String title) {
		
		if(UtilText.isNull(title)){
			this.title=UtilText.EMPTY;
		}
		UtilText.trim(title);
	}

	private void setLeve(MessageLevel leve) {
		
		if(UtilObject.getUtilObject().isNull(leve)) {
			this.level = MessageLevel.FATAL;
		}
		this.level = level;
	}

}
