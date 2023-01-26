package mx.softixx.cis.common.validation.payload;

import jakarta.validation.ConstraintViolation;

public record FieldError(String field, String message) {
	
	public static final String DETAIL = "Validation error";
	
	public FieldError(org.springframework.validation.FieldError error) {
		this(cleanField(error.getField()), error.getDefaultMessage());
	}
	
	public FieldError(ConstraintViolation<?> violation) {
		this(cleanField(violation.getPropertyPath().toString()), violation.getMessage());
	}
	
	private static String cleanField(String fieldName) {
		return fieldName.replace("create.request.", "")
						.replace("update.request.", "");
	}
	
}