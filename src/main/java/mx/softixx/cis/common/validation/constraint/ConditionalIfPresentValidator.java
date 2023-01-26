package mx.softixx.cis.common.validation.constraint;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.val;
import mx.softixx.cis.common.validation.annotation.ConditionalIfPresent;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class ConditionalIfPresentValidator implements ConstraintValidator<ConditionalIfPresent, Object> {
	
	private String field;
	private String conditionalField;
	private String message;
	
	@Override
    public void initialize(ConditionalIfPresent constraintAnnotation) {
		field = constraintAnnotation.field();
		conditionalField = constraintAnnotation.conditionalField();
        message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		val fieldValue = new BeanWrapperImpl(obj).getPropertyValue(field);
		val conditionalFieldValue = new BeanWrapperImpl(obj).getPropertyValue(conditionalField);
		
		if (fieldValue != null && conditionalFieldValue != null) {
			setConstraintError(conditionalField, context);
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