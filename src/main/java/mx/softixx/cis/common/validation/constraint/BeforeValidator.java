package mx.softixx.cis.common.validation.constraint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.BeanWrapperImpl;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.val;
import mx.softixx.cis.common.core.datetime.LocalDateTimeUtils;
import mx.softixx.cis.common.core.datetime.LocalDateUtils;
import mx.softixx.cis.common.core.datetime.LocalTimeUtils;
import mx.softixx.cis.common.validation.annotation.Before;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class BeforeValidator implements ConstraintValidator<Before, Object> {
	
	private String from;
	private String to;
	private String message;
	
	@Override
    public void initialize(Before constraintAnnotation) {
		from = constraintAnnotation.from();
		to = constraintAnnotation.to();
        message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		val fromValue = new BeanWrapperImpl(obj).getPropertyValue(from);
		val toValue = new BeanWrapperImpl(obj).getPropertyValue(to);
		
		if (fromValue == null && toValue == null) {
			return true;
		}
		
		if (fromValue != null && toValue != null) {
			if (fromValue instanceof LocalTime fromLt && toValue instanceof LocalTime toLt) {
				return validateTime(fromLt, toLt, context);
			} else if (fromValue instanceof LocalDate fromLd && toValue instanceof LocalDate toLd) {
				return validateDate(fromLd, toLd, context);
			} else if (fromValue instanceof LocalDateTime fromLdt && toValue instanceof LocalDateTime toLdt) {
				return validateDateTime(fromLdt, toLdt, context);
			}
		} else if (fromValue == null) {
			setConstraintError(from, context, ValidatorMessage.REQUIRED);
		} else {
			setConstraintError(to, context, ValidatorMessage.REQUIRED);
		}
		return false;
	}
	
	private boolean validateTime(LocalTime fromLt, LocalTime toLt, ConstraintValidatorContext context) {
		val isBefore = LocalTimeUtils.isBefore(fromLt, toLt);
		if (!isBefore) {
			setConstraintError(from, context, message);
		}
		return isBefore;
	}
	
	private boolean validateDate(LocalDate fromLd, LocalDate toLd, ConstraintValidatorContext context) {
		val isBefore = LocalDateUtils.isBefore(fromLd, toLd);
		if (!isBefore) {
			setConstraintError(from, context, message);
		}
		return isBefore;
	}
	
	private boolean validateDateTime(LocalDateTime fromLdt, LocalDateTime toLdt, ConstraintValidatorContext context) {
		val isBefore = LocalDateTimeUtils.isBefore(fromLdt, toLdt);
		if (!isBefore) {
			setConstraintError(from, context, message);
		}
		return isBefore;
	}
	
	private void setConstraintError(String field, final ConstraintValidatorContext context, String message) {
		context.buildConstraintViolationWithTemplate(message)
		   	   .addPropertyNode(field)
		   	   .addConstraintViolation()
		   	   .disableDefaultConstraintViolation();
	}

}