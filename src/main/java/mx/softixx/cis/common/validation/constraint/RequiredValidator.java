package mx.softixx.cis.common.validation.constraint;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.val;
import mx.softixx.cis.common.core.data.StringUtils;
import mx.softixx.cis.common.validation.annotation.Required;
import mx.softixx.cis.common.validation.exception.ValidationRequriedFieldsConflictException;
import mx.softixx.cis.common.validation.exception.ValidationRequriedFieldsException;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class RequiredValidator implements ConstraintValidator<Required, Object> {
	
	private String fieldOne;
	private String fieldTwo;
	private String message;
	
	@Override
    public void initialize(Required constraintAnnotation) {
		fieldOne = constraintAnnotation.fieldOne();
		fieldTwo = constraintAnnotation.fieldTwo();
        message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		val fieldOneValue = new BeanWrapperImpl(obj).getPropertyValue(fieldOne);
		val fieldTwoValue = new BeanWrapperImpl(obj).getPropertyValue(fieldTwo);
		
		evaluate(fieldOneValue, fieldTwoValue);
		return true;
	}
	
	private void evaluate(Object fieldOneValue, Object fieldTwoValue) {
		if (fieldOneValue == null && fieldTwoValue == null) {
			if (StringUtils.hasValue(message)) {
				throw new ValidationRequriedFieldsException(message);
			}
			throw new ValidationRequriedFieldsException(fieldOne, fieldTwo);
		} else if (fieldOneValue != null && fieldTwoValue != null) {
			if (StringUtils.hasValue(message)) {
				throw new ValidationRequriedFieldsConflictException(message);
			}
			throw new ValidationRequriedFieldsConflictException(fieldOne, fieldTwo);
		}
	}

}