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
import mx.softixx.cis.common.validation.annotation.After;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class AfterValidator implements ConstraintValidator<After, Object> {
	
	private String from;
	private String to;
	private String message;
	
	@Override
    public void initialize(After constraintAnnotation) {
		from = constraintAnnotation.from();
		to = constraintAnnotation.to();
        message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		val fromValue = new BeanWrapperImpl(obj).getPropertyValue(from);
		val toValue = new BeanWrapperImpl(obj).getPropertyValue(to);
		
		if (fromValue == null && toValue != null) {
			setConstraintError(from, context, ValidatorMessage.REQUIRED);
		} else if (fromValue != null && toValue == null) {
			setConstraintError(to, context, ValidatorMessage.REQUIRED);
		} else {
			if (fromValue instanceof LocalTime fromLt && toValue instanceof LocalTime toLt) {
				return validateTime(fromLt, toLt, context);
			} else if (fromValue instanceof LocalDate fromLd && toValue instanceof LocalDate toLd) {
				return validateDate(fromLd, toLd, context);
			} else if (fromValue instanceof LocalDateTime fromLdt && toValue instanceof LocalDateTime toLdt) {
				return validateDateTime(fromLdt, toLdt, context);
			}
		}
		return true;
	}
	
	private boolean validateTime(LocalTime fromLt, LocalTime toLt, ConstraintValidatorContext context) {
		val isAfter = LocalTimeUtils.isAfter(fromLt, toLt);
		if (!isAfter) {
			setConstraintError(to, context, message);
		}
		return isAfter;
	}
	
	private boolean validateDate(LocalDate fromLd, LocalDate toLd, ConstraintValidatorContext context) {
		val isAfter = LocalDateUtils.isAfter(fromLd, toLd);
		if (!isAfter) {
			setConstraintError(to, context, message);
		}
		return isAfter;
	}
	
	private boolean validateDateTime(LocalDateTime fromLdt, LocalDateTime toLdt, ConstraintValidatorContext context) {
		val isAfter = LocalDateTimeUtils.isAfter(fromLdt, toLdt);
		if (!isAfter) {
			setConstraintError(to, context, message);
		}
		return isAfter;
	}
	
	private void setConstraintError(String field, final ConstraintValidatorContext context, String message) {
		context.buildConstraintViolationWithTemplate(message)
		   	   .addPropertyNode(field)
		   	   .addConstraintViolation()
		   	   .disableDefaultConstraintViolation();
	}

}