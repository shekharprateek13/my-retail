/**
 * Author: Akhauri Prateek Shekhar 
 */
package my.retail.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerController extends ResponseEntityExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlerController.class);
	

	@ExceptionHandler(value = { HttpClientErrorException.class, NullPointerException.class })
    protected ResponseEntity<Object> handleConflicts(RuntimeException ex, WebRequest request) {
		logger.error("No Records Found for Request URL: "+ request);
        Map<String,String> errorMap = new HashMap<String,String>();
        errorMap.put("error","No Records found.");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);		
        return handleExceptionInternal(ex, errorMap,httpHeaders, HttpStatus.NOT_FOUND, request);
    }
    
    @ExceptionHandler(value = { org.springframework.web.method.annotation.MethodArgumentTypeMismatchException.class })
    protected ResponseEntity<Object> handleInvalidArguments(RuntimeException ex, WebRequest request) {
    	logger.error("Invalid Parameters for Request URL: "+ request);
        Map<String,String> errorMap = new HashMap<String,String>();
        errorMap.put("error","Input argument [id] should be Integer.");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);		
        return handleExceptionInternal(ex, errorMap,httpHeaders, HttpStatus.BAD_REQUEST, request);
    }
    
    @ExceptionHandler(value = { RestClientException.class })
    protected ResponseEntity<Object> handleInvalidURL(RuntimeException ex, WebRequest request) {
    	logger.error("Unable to fetch data from External API for Request URL"+ request);
        Map<String,String> errorMap = new HashMap<String,String>();
        errorMap.put("error","Unable to fetch data from External API. Please try again after sometime");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);		
        return handleExceptionInternal(ex, errorMap,httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
    
    @ExceptionHandler(value = { com.mongodb.MongoSocketOpenException.class })
    protected ResponseEntity<Object> handleNullPointerException(RuntimeException ex, WebRequest request) {
    	logger.error("Unable to connect to database for Request URL"+ request);
        Map<String,String> errorMap = new HashMap<String,String>();
        errorMap.put("error","Unable to connect to database");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);		
        return handleExceptionInternal(ex, errorMap,httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
    
    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<Object> handleOtherExceptions(RuntimeException ex, WebRequest request) {
    	logger.error("Application is down for Request URL"+ request);
        Map<String,String> errorMap = new HashMap<String,String>();
        errorMap.put("error","Application is down. Please try again after sometime.");
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);		
        return handleExceptionInternal(ex, errorMap,httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
