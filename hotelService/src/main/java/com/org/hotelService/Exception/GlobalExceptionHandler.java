package com.org.hotelService.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.org.hotelService.payLoad.ApiResponse;



@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException .class)
	public ResponseEntity<ApiResponse>handlerResourceNotFoundException(ResourceNotFoundException e)
	{
		
		String msg=e.getMessage();
		
		ApiResponse response  = ApiResponse.builder().message(msg).success(true).status(HttpStatus.NOT_FOUND).build();
		
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
		
	}

}
