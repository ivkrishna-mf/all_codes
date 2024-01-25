package com.ione.exception.handlers;

import java.net.URI;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;

import com.ione.exceptions.NoFruitsFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
//	@org.springframework.web.bind.annotation.ExceptionHandler(NoFruitsFoundException.class)
//	public ResponseEntity<String> handleNoFruitsFoundException(NoFruitsFoundException ex, WebRequest request){
//		
//		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NO_CONTENT);
//	}
	
	
//	public ProblemDetail handleException(Exception ex, WebRequest request) {
//		
//		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
//		
//		problemDetail.setTitle("error");
//		problemDetail.setType(URI.create(""));
//		
//		return problemDetail;
//		
//	}
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity handleDataIntegrityException(DataIntegrityViolationException ex) {
		return  new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		
		
	}

}
