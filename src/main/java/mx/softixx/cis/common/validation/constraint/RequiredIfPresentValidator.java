package mx.softixx.cis.common.validation.constraint;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.val;
import mx.softixx.cis.common.validation.annotation.RequiredIfPresent;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class RequiredIfPresentValidator implements ConstraintValidator<RequiredIfPresent, Object> {
	
	private String field;
	private String requiredField;
	private String message;
	
	@Override
    public void initialize(RequiredIfPresent constraintAnnotation) {
		field = constraintAnnotation.field();
		requiredField = constraintAnnotation.requiredField();
        message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		val fieldValue = new BeanWrapperImpl(obj).getPropertyValue(field);
		val requiredFieldValue = new BeanWrapperImpl(obj).getPropertyValue(requiredField);
		
		if (fieldValue != null && requiredFieldValue == null) {
			setConstraintError(requiredField, context);
			return false;
		}
		return true;
	}
	
	private void setConstraintError(String field, final ConstraintValidatorContext context) {
		context.buildConstraintViolationWithTemplate(message)
		   	   .addPropertyNode(field)
		   	   .addConstraintViolation()
		   	   .disableDefaultConstraintViolation();
	}

}