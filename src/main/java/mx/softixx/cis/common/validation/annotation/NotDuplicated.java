package mx.softixx.cis.common.validation.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import mx.softixx.cis.common.validation.constraint.NotDuplicatedValidator;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
@Documented
@Constraint(validatedBy = { NotDuplicatedValidator.class })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface NotDuplicated {
	/**
	 * @return the error message template
	 */
	String message() default ValidatorMessage.DUPLICATED;

	/**
	 * @return the groups the constraint belongs to
	 */
	Class<?>[] groups() default {};

	/**
	 * @return the payload associated to the constraint
	 */
	Class<? extends Payload>[] payload() default {};
	
	/**
	 * Defines several {@link NotDuplicate} annotations on the same element.
	 *
	 * @see NotDuplicate
	 */
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
	@Retention(RUNTIME)
	@Documented
	@interface List {
		NotDuplicated[] value();
	}

}