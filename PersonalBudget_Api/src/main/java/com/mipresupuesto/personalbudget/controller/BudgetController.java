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

import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.controller.response.Response;
import com.mipresupuesto.personalbudget.controller.response.dto.Message;
import com.mipresupuesto.personalbudget.crosscuting.exception.PersonalBudgetException;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {

	@Autowired
	private CreateBudgetPort createBudgetPort;

	/*
	 * @Autowired private CreateBudgetCommand createBudgetCommand;
	 */

	@PostMapping
	public ResponseEntity<Response<BudgetDTO>> createBudget(@RequestBody BudgetDTO budget) {
		Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		response.setData(new ArrayList<>());
		ArrayList<String> messages = new ArrayList<>();
		try {
			createBudgetPort.execute(budget);
			response.addData(budget);
			statusCode = HttpStatus.OK;
			response.addMessage(Message.createErrorMessage("Budget created Succesfully"));
		} catch (PersonalBudgetException exception) {
			messages.add(exception.getMessage());
		} catch (Exception exception) {
			statusCode=HttpStatus.BAD_REQUEST;
			messages.add(exception.getMessage());
			response.addMessage(Message.createErrorMessage("Error al crer el presupuesto"));
		}

		return new ResponseEntity<Response<BudgetDTO>>(response, statusCode);
		
	}
	/*
	 * @PostMapping public ResponseEntity<BudgetDTO> create(@RequestBody BudgetDTO
	 * budget){
	 * 
	 * try { createBudgetCommand.exceute(budget); } catch (Exception e) {
	 * System.out.println(e.getStackTrace()); }
	 * 
	 * return new ResponseEntity<>(budget, HttpStatus.CREATED);
	 * 
	 * }
	 */

	@GetMapping
	public String saludar() {
		return ("Hola mundo");
	}
	/*
	 * @GetMapping(path = "/budgets") public List<BudgetDTO> list() { return
	 * createBudgetPort.li; }
	 */

}
