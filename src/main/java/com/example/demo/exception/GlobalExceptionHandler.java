package com.example.demo.exception;

import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ApiException resourceNotFoundExceptionHandler(ResourceNotFoundException exception)
	{
		return new ApiException(404,exception.getMessage() , ZonedDateTime.now());
	}
	
	
	
}
