package com.mipresupuesto.personalbudget.controller.response;

import java.util.ArrayList;
import java.util.List;

import com.mipresupuesto.personalbudget.controller.response.dto.Message;
import com.mipresupuesto.personalbudget.crosscuting.util.object.UtilObject;


public class Response<D> {
	private List<D> data;
	private List<Message> messages;

	
	public Response() {
		super();
	}
	
	public Response(List<D> data, List<Message> messages) {
		super();
		this.data = data;
		this.messages = messages;
	}
	
	public void addMessage(final Message message) {
		if(message != null) {
			getMessage().add(message);
		}
	}
	public List<Message> getMessage() {
		if(messages != null) {
			this.messages= new ArrayList<>();
		}
		return messages;
	}
	public List<D> getData() {
		return data;
	}
	public void setData(List<D> data) {
		this.data = UtilObject.getUtilObject().getDefault(data, new ArrayList<>());
	}
	public List<Message> getMessages() {
		return messages;
	}
	/*
	public void setMessages(List<String> messages) {
		this.messages = UtilObject.getUtilObject().getDefault(new Message(), new ArrayList<>());
	}*/
	public void addData(D data) {
		this.data.add(data);
	}
	
	
}