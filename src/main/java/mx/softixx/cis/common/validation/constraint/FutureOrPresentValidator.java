package mx.softixx.cis.common.validation.constraint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import mx.softixx.cis.common.core.datetime.LocalDateTimeUtils;
import mx.softixx.cis.common.core.datetime.LocalDateUtils;
import mx.softixx.cis.common.core.datetime.LocalTimeUtils;
import mx.softixx.cis.common.core.validator.ValidatorUtils;
import mx.softixx.cis.common.validation.annotation.FutureOrPresent;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class FutureOrPresentValidator implements ConstraintValidator<FutureOrPresent, Object> {
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		if (ValidatorUtils.isEmpty(obj)) {
			return true;
		}
		
		if (obj instanceof LocalTime lt) {
			return LocalTimeUtils.isFutureOrPresent(lt);
		} else if (obj instanceof LocalDate ld) {
			return LocalDateUtils.isFutureOrPresent(ld);
		} else if (obj instanceof LocalDateTime ldt) {
			return LocalDateTimeUtils.isFutureOrPresent(ldt);
		}
		
		return false;
	}

}