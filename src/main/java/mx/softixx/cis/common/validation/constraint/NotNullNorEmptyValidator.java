package mx.softixx.cis.common.validation.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.val;
import mx.softixx.cis.common.core.validator.ValidatorUtils;
import mx.softixx.cis.common.validation.annotation.NotNullNorEmpty;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class NotNullNorEmptyValidator implements ConstraintValidator<NotNullNorEmpty, Object> {
	
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		if (ValidatorUtils.isEmpty(obj)) {
			return false;
		}
		
		if (obj instanceof String) {
			val str = obj.toString().trim();
			return ValidatorUtils.isNotEmpty(str);
		}
		
		return true;
	}

}