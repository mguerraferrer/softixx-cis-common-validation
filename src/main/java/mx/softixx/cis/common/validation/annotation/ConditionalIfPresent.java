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
import mx.softixx.cis.common.validation.constraint.ConditionalIfPresentValidator;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

/**
 * @author Maikel Guerra Ferrer - mguerraferrer@gmail.com
 *
 */
@Documented
@Constraint(validatedBy = { ConditionalIfPresentValidator.class })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
public @interface ConditionalIfPresent {
	/**
	 * @return the error message template
	 */
	String message() default ValidatorMessage.CONDITIONAL;
	
	/**
	 * @return the field that determines conditional validation
	 */
	String field() default "";
	
	/**
	 * @return the field to evaluate
	 */
	String conditionalField() default "";

	/**
	 * @return the groups the constraint belongs to
	 */
	Class<?>[] groups() default {};

	/**
	 * @return the payload associated to the constraint
	 */
	Class<? extends Payload>[] payload() default {};
	
	/**
	 * Defines several {@link ConditionalIfPresent} annotations on the same element.
	 *
	 * @see ConditionalIfPresent
	 */
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
	@Retention(RUNTIME)
	@Documented
	@interface List {
		ConditionalIfPresent[] value();
	}

}