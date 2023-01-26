package mx.softixx.cis.common.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import mx.softixx.cis.common.core.message.MessageUtils;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationRequriedFieldsException extends CustomException {

	public ValidationRequriedFieldsException(String fieldOne, String fieldTwo) {
		super(MessageUtils.getMessage("validator.text.exception.requried.fields", new String[] { fieldOne, fieldTwo }),
				HttpStatus.BAD_REQUEST, "VALIDATION_REQURIED_FIELDS");
	}

	public ValidationRequriedFieldsException(String message) {
		super(message, HttpStatus.BAD_REQUEST, "VALIDATION_REQURIED_FIELDS");
	}

}