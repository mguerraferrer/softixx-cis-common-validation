package mx.softixx.cis.common.validation.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.val;
import mx.softixx.cis.common.validation.payload.ErrorResponse;

@Data
@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
public class CustomException extends RuntimeException {
	private final HttpStatus httpStatus;
	private final String errorCode;

	public CustomException() {
		this.httpStatus = null;
		this.errorCode = null;
	}
	
	public CustomException(String message) {
		super(message);
		this.httpStatus = null;
		this.errorCode = null;
	}
	
	public CustomException(String message, HttpStatus httpStatus, String errorCode) {
		super(message);
		this.httpStatus = httpStatus;
		this.errorCode = errorCode;
	}
	
	public static final CustomException notFound(String message, String errorCode) {
		return new CustomException(message, HttpStatus.NOT_FOUND, errorCode);
	}
	
	public static final CustomException internalServerError() {
		val message = "Internal Server Error";
		val code = "INTERNAL_SERVER_ERROR";
		return new CustomException(message, HttpStatus.INTERNAL_SERVER_ERROR, code);
	}
	
	public static final CustomException buildException(ErrorResponse errorResponse) {
		val errorMessage = errorResponse.getErrorMessage();
		val code = errorResponse.getErrorCode();
		val status = HttpStatus.valueOf(errorResponse.getHttpStatus());
		
		return CustomException.buildException(errorMessage, status, code);
	}
	
	public static final CustomException buildException(String message, HttpStatus httpStatus, String errorCode) {
		return new CustomException(message, httpStatus, errorCode);
	}
	
	public static final Map<String, Object> populateProperties(CustomException ex) {
		val properties = new HashMap<String, Object>();
		properties.put("errorCode", ex.getErrorCode());
		return properties;
	}
	
	public static final Map<String, Object> populateProperties(String errorCode) {
		val properties = new HashMap<String, Object>();
		properties.put("errorCode", errorCode);
		return properties;
	}

}