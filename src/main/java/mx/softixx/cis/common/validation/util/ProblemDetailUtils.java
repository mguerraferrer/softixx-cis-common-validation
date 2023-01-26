package mx.softixx.cis.common.validation.util;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.validation.BindingResult;

import jakarta.validation.ConstraintViolation;
import lombok.val;
import mx.softixx.cis.common.core.message.MessageUtils;
import mx.softixx.cis.common.core.validator.ValidatorUtils;
import mx.softixx.cis.common.validation.payload.FieldError;

public final class ProblemDetailUtils {

	private ProblemDetailUtils() {
	}

	public static ProblemDetail problemDetail(HttpStatus status, String message) {
		return ProblemDetail.forStatusAndDetail(status, message);
	}

	public static ProblemDetail problemDetail(HttpStatus status, String message, Map<String, Object> properties) {
		val problemDetail = ProblemDetail.forStatusAndDetail(status, message);
		populateDetails(problemDetail, properties);
		return problemDetail;
	}

	public static ProblemDetail problemDetail(ProblemDetail problemDetail, Map<String, Object> properties) {
		populateDetails(problemDetail, properties);
		return problemDetail;
	}

	public static ProblemDetail notFound(String message) {
		return problemDetail(HttpStatus.NOT_FOUND, message);
	}

	public static ProblemDetail notFound(String message, Map<String, Object> properties) {
		val problemDetail = notFound(message);
		populateDetails(problemDetail, properties);
		return problemDetail;
	}

	public static ProblemDetail preconditionFailed(String message) {
		return problemDetail(HttpStatus.PRECONDITION_FAILED, message);
	}

	public static ProblemDetail preconditionFailed(String message, Map<String, Object> properties) {
		val problemDetail = preconditionFailed(message);
		populateDetails(problemDetail, properties);
		return problemDetail;
	}

	public static ProblemDetail badRequest() {
		return badRequest(MessageUtils.getMessage("validator.text.failed.to.read.request"));
	}
	
	public static ProblemDetail badRequest(String message) {
		return problemDetail(HttpStatus.BAD_REQUEST, message);
	}
	
	public static ProblemDetail badRequest(String message, Map<String, Object> properties) {
		return problemDetail(HttpStatus.BAD_REQUEST, message, properties);
	}
	
	public static ProblemDetail badRequest(BindingResult bindingResult) {
		val errors = bindingResult.getFieldErrors().stream().map(FieldError::new).toList();
		return badRequest(errors);
	}

	public static ProblemDetail badRequest(Set<ConstraintViolation<?>> violation) {
		val errors = violation.stream().map(FieldError::new).toList();
		return badRequest(errors);
	}

	public static ProblemDetail badRequest(List<FieldError> fieldErrors) {
		val properties = Map.of("errors", fieldErrors, "timestamp", LocalDateTime.now());
		return problemDetail(HttpStatus.BAD_REQUEST, FieldError.DETAIL, properties);
	}

	public static ProblemDetail conflict() {
		return conflict(MessageUtils.getMessage("validator.text.no.info.description"));
	}
	
	public static ProblemDetail conflict(Map<String, Object> properties) {
		return conflict(MessageUtils.getMessage("validator.text.no.info.description"), properties);
	}

	public static ProblemDetail conflict(String message) {
		return problemDetail(HttpStatus.CONFLICT, message);
	}
	
	public static ProblemDetail conflict(String message, Map<String, Object> properties) {
		return problemDetail(HttpStatus.CONFLICT, message, properties);
	}

	public static ProblemDetail internalServerError() {
		return internalServerError(MessageUtils.getMessage("validator.text.unexpected.error"));
	}

	public static ProblemDetail internalServerError(String message) {
		return problemDetail(HttpStatus.INTERNAL_SERVER_ERROR, message);
	}

	private static void populateDetails(final ProblemDetail problemDetail, Map<String, Object> properties) {
		if (ValidatorUtils.isNotEmpty(properties)) {
			properties.entrySet().stream().filter(entry -> ValidatorUtils.isNotEmpty(entry.getValue()))
					.forEach(entry -> problemDetail.setProperty(entry.getKey(), entry.getValue()));
		}
	}

}