package mx.softixx.cis.common.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import mx.softixx.cis.common.core.message.MessageUtils;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationRequriedFieldsConflictException extends CustomException {

	public ValidationRequriedFieldsConflictException(String fieldOne, String fieldTwo) {
		super(MessageUtils.getMessage("validator.text.exception.requried.fields.conflict", new String[] { fieldOne, fieldTwo }),
				HttpStatus.BAD_REQUEST, "VALIDATION_REQURIED_FIELDS_CONFLICT");
	}

	public ValidationRequriedFieldsConflictException(String message) {
		super(message, HttpStatus.BAD_REQUEST, "VALIDATION_REQURIED_FIELDS_CONFLICT");
	}

}