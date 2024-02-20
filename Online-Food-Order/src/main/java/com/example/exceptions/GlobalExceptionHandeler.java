package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandeler {

	@ExceptionHandler()
	public ResponseEntity<String> resourcrNotFoundExceptionHandeler(Exception ex) {

		String massage = " Thies id is does not exist ";
		return new ResponseEntity<>(massage, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handelMethodeArgNotValidException(Exception ex) {

		String message = "Not Valid Filed!!";
		return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);

	}

}