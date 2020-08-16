package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ObjectExceptionController {

	@ExceptionHandler(value = ObjectNotFoundException.class)
	public ResponseEntity<Object> exception(ObjectNotFoundException exception) {
		return new ResponseEntity<>("Object not found", HttpStatus.NOT_FOUND);
	}

}
