package com.mipresupuesto.personalbudget.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.application.command.implementation.CreateBudgetCommand;
import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.crosscuting.exception.PersonalBudgetException;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
	
	@Autowired
	private CreateBudgetPort createBudgetPort;
	

	
	@Autowired
	private CreateBudgetCommand createBudgetCommand;
	
	
	@PostMapping
	public ResponseEntity<BudgetDTO> create(@RequestBody BudgetDTO budget) {
		HttpStatus statusCode = HttpStatus.BAD_REQUEST;
		
		ArrayList<String> messages = new ArrayList<>();
		try {
			createBudgetPort.exceute(budget);
			statusCode = HttpStatus.OK;
			messages.add("Budget created Succesfully");
		}catch(PersonalBudgetException exception){
			messages.add(exception.getMessage());
		}catch(Exception exception){
			messages.add(exception.getMessage());
		}
        return new ResponseEntity<>(budget,statusCode);

	}
	
	/*
	@PostMapping
	public ResponseEntity<BudgetDTO> create(@RequestBody BudgetDTO budget){
		
		try {
			createBudgetCommand.exceute(budget);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
        return new ResponseEntity<>(budget, HttpStatus.CREATED);

	}*/
	
	
	@GetMapping
	public String saludar() {
		return ("Hola mundo");
	}
	/*
    @GetMapping(path = "/budgets")
    public List<BudgetDTO> list() {
        return createBudgetPort.li;
    }*/

}
