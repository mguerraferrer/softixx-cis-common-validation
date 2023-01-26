package mx.softixx.cis.common.validation.constraint;

import java.util.Collection;
import java.util.Map;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import mx.softixx.cis.common.core.collection.ArrayUtils;
import mx.softixx.cis.common.core.collection.ListUtils;
import mx.softixx.cis.common.core.collection.MapUtils;
import mx.softixx.cis.common.core.data.StringUtils;
import mx.softixx.cis.common.core.validator.ValidatorUtils;
import mx.softixx.cis.common.validation.annotation.NotDuplicated;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
public class NotDuplicatedValidator implements ConstraintValidator<NotDuplicated, Object> {

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		if (!ValidatorUtils.isEmpty(obj)) {
			var hasDuplicateValues = false;
			if (obj.getClass().isArray()) {
				hasDuplicateValues = ArrayUtils.hasDuplicateValues((Object[]) obj);
			} else if (obj instanceof Collection<?> collection) {
				hasDuplicateValues = ListUtils.hasDuplicateValues(collection);
			} else if (obj instanceof Map<?, ?> map) {
				hasDuplicateValues = MapUtils.hasDuplicateValues(map);
			} else if (obj instanceof String str && StringUtils.hasValue(str) && str.contains(",")) {
				hasDuplicateValues = ListUtils.hasDuplicateValues(ListUtils.toList(str));
			}
			return !hasDuplicateValues;
		}
		return true;
	}

}