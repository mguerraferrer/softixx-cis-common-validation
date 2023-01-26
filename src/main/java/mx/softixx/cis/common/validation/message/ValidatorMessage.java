package mx.softixx.cis.common.validation.message;

public final class ValidatorMessage {

	private ValidatorMessage() {
	}

	/**
	 * <p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Solicitud no válida
	 * <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: Bad request
	 * </p>
	 */
	public static final String BAD_REQUEST = "validation.bad.request";

	/**
	 * <p>
	 * Used for Java Bean Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: El valor de este
	 * campo es requerido <br>
	 * Value in <i>validator-messages_en_US.properties</i> file:
	 */
	public static final String REQUIRED = "{validator.text.required}";
	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: El valor de este
	 * campo es requerido <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: <br>
	 */
	public static final String REQUIRED_MESSAGE = "validator.text.required";

	/**
	 * <p>
	 * Used for Java Bean Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Este campo no debe
	 * existir o su valor debe ser nulo <br>
	 * Value in <i>validator-messages_en_US.properties</i> file:
	 */
	public static final String NULLABLE = "{validator.text.nullable}";
	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Este campo no debe
	 * existir o su valor debe ser nulo <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: <br>
	 */
	public static final String NULLABLE_MESSAGE = "validator.text.nullable";

	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: El {0} es requerido
	 * <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: <br>
	 */
	public static final String REQUIRED_M_MESSAGE = "validator.text.required.m";

	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: La {0} es requerida
	 * <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: <br>
	 */
	public static final String REQUIRED_F_MESSAGE = "validator.text.required.f";

	// ##### Value in validator-messages_es_MX.properties file: no puede estar vacío
	// ##### validator-messages_en_US.properties:
	public static final String NOT_EMPTY = "{validator.text.not.empty}";
	public static final String NOT_EMPTY_MESSAGE = "validator.text.not.empty";

	// ##### Value in validator-messages_es_MX.properties file: El valor de este
	// campo no es
	// válido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FIELD = "{validator.text.invalid.field}";
	public static final String INVALID_FIELD_MESSAGE = "validator.text.invalid.field";

	// ##### Value in validator-messages_es_MX.properties file: El {0} no es válido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_M_MESSAGE = "validator.text.invalid.field";

	// ##### Value in validator-messages_es_MX.properties file: La {0} no es válida
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_F_MESSAGE = "validator.text.invalid.field";

	// ##### Value in validator-messages_es_MX.properties file: Formato no válido
	// ##### validator-messages_en_US.properties: Invalid format
	public static final String INVALID_FORMAT = "{validator.text.invalid.format}";
	public static final String INVALID_FORMAT_MESSAGE = "validator.text.invalid.format";

	// ##### Value in validator-messages_es_MX.properties file: Formato no válido.
	// Considere como
	// válido {format}
	// ##### validator-messages_en_US.properties: Invalid format. Consider as valid
	// {format}
	public static final String INVALID_FORMAT_DETAIL = "{validator.text.invalid.format.detail}";
	public static final String INVALID_FORMAT_DETAIL_MESSAGE = "validator.text.invalid.format.detail";

	// ##### Value in validator-messages_es_MX.properties file: Este campo solo
	// acepta letras
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_ALPHABETIC = "{validator.text.alphabetic.field}";
	public static final String INVALID_ALPHABETIC_MESSAGE = "validator.text.alphabetic.field";

	// ##### Value in validator-messages_es_MX.properties file: Este campo solo
	// acepta números
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_NUMERIC = "{validator.text.numeric.field}";
	public static final String INVALID_NUMERIC_MESSAGE = "validator.text.numeric.field";

	// ##### Value in validator-messages_es_MX.properties file: El correo
	// especificado no es
	// válido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_EMAIL = "{validator.text.invalid.email}";
	public static final String INVALID_EMAIL_MESSAGE = "validator.text.invalid.email";

	// ##### Value in validator-messages_es_MX.properties file: El teléfono
	// especificado no es
	// válido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_PHONE = "{validator.text.invalid.phone}";
	public static final String INVALID_PHONE_MESSAGE = "validator.text.invalid.phone";

	// ##### Value in validator-messages_es_MX.properties file: El teléfono
	// especificado no es
	// válido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_ZIP_CODE = "{validator.text.invalid.zip.code}";
	public static final String INVALID_ZIP_CODE_MESSAGE = "validator.text.invalid.zip.code";

	/**
	 * <b>Message definition</b><br>
	 * Value in validator-messages_es_MX.properties file: La fecha especificada no
	 * es válida o se encuentra fuera de rango<br>
	 * validator-messages_en_US.properties: The specified date is invalid or out of
	 * range
	 * <p>
	 * <b>Note:</b> Use this directly in java bean validations
	 * </p>
	 */
	public static final String INVALID_DATE_OUT_RANGE = "{validator.text.invalid.date.out.range}";

	/**
	 * <b>Message definition</b><br>
	 * Value in validator-messages_es_MX.properties file: La fecha especificada no
	 * es válida o se encuentra fuera de rango<br>
	 * validator-messages_en_US.properties: The specified date is invalid or out of
	 * range
	 */
	public static final String INVALID_DATE_OUT_RANGE_MESSAGE = "validator.text.invalid.date.out.range";

	/**
	 * <b>Message definition</b><br>
	 * Value in validator-messages_es_MX.properties file: {from} debe ser menor que
	 * {to}<br>
	 * validator-messages_en_US.properties: {from} must be less than {to}
	 * <p>
	 * <b>Note:</b> Use this directly in java bean validations
	 * </p>
	 */
	public static final String INVALID_BEFORE = "{validator.text.invalid.before}";

	/**
	 * <b>Message definition</b><br>
	 * Value in validator-messages_es_MX.properties file: {from} debe ser menor que
	 * {to}<br>
	 * validator-messages_en_US.properties: {from} must be less than {to}
	 */
	public static final String INVALID_BEFORE_MESSAGE = "validator.text.invalid.before";

	/**
	 * <b>Message definition</b><br>
	 * Value in validator-messages_es_MX.properties file: {to} debe ser mayor que
	 * {from}<br>
	 * validator-messages_en_US.properties: {to} must be greater than {from}
	 * <p>
	 * <b>Note:</b> Use this directly in java bean validations
	 * </p>
	 */
	public static final String INVALID_AFTER = "{validator.text.invalid.after}";

	/**
	 * <b>Message definition</b><br>
	 * Value in validator-messages_es_MX.properties file: {to} debe ser mayor que
	 * {from}<br>
	 * validator-messages_en_US.properties: {to} must be greater than {from}
	 */
	public static final String INVALID_AFTER_MESSAGE = "validator.text.invalid.after";

	// ##### Value in validator-messages_es_MX.properties file: El valor de este
	// campo debe ser
	// mayor que
	// {min}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FIELD_GREATER_THAN_VALUE = "{validator.text.invalid.field.greater.than.value}";
	// ##### Value in validator-messages_es_MX.properties file: El valor de este
	// campo debe ser
	// mayor que
	// {0}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FIELD_GREATER_THAN_MESSAGE = "validator.text.invalid.field.greater.than";
	// ##### Value in validator-messages_es_MX.properties file: El valor de este
	// campo debe ser
	// mayor que
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FIELD_GREATER_THAN_VALIDATION = "validator.text.invalid.field.greater.than.validation";

	/**
	 * Value in <i>validator-messages_es_MX.properties</i> file: El mínimo de
	 * caracteres permitido es {min} <br>
	 * Value in <i>validator-messages_en_US.properties</i> file:
	 * 
	 */
	public static final String INVALID_MIN_LENGTH = "{validator.text.field.min.invalid.length}";
	// ##### Value in validator-messages_es_MX.properties file: El mínimo de
	// caracteres permitido
	// es {0}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MIN_LENGTH_MESSAGE = "validator.text.field.min.length";
	// ##### Value in validator-messages_es_MX.properties file: El mínimo de
	// caracteres permitido
	// es
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MIN_LENGTH_VALIDATION = "validator.text.field.min.validation";

	// ##### Value in validator-messages_es_MX.properties file: El máximo de
	// caracteres permitido
	// es {max}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MAX_LENGTH = "{validator.text.field.max.invalid.length}";
	// ##### Value in validator-messages_es_MX.properties file: El máximo de
	// caracteres permitido
	// es {0}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MAX_LENGTH_MESSAGE = "validator.text.field.max.length";
	// ##### Value in validator-messages_es_MX.properties file: El máximo de
	// caracteres permitido
	// es
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MAX_LENGTH_VALIDATION = "validator.text.field.max.validation";

	// ##### Value in validator-messages_es_MX.properties file: Este campo debe
	// contener entre
	// {min} y {max}
	// caracteres
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MIN_MAX_LENGTH = "{validator.text.field.min.max.invalid.length}";
	// ##### Value in validator-messages_es_MX.properties file: Este campo debe
	// contener entre {0}
	// y {1}
	// caracteres
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MIN_MAX_LENGTH_MESSAGE = "validator.text.field.min.max.length";
	// ##### Value in validator-messages_es_MX.properties file: Este campo debe
	// contener entre
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MIN_MAX_LENGTH_VALIDATION = "validator.text.field.min.max.validation";

	public static final String INVALID_LENGTH = "{validator.text.field.invalid.length}";
	public static final String INVALID_LENGTH_MESSAGE = "validator.text.field.length";
	public static final String INVALID_LENGTH_VALIDATION = "validator.text.field.length.validation";

	// ##### Value in validator-messages_es_MX.properties file: El máximo de dígitos
	// permitido es
	// {max}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MAX_DIGIT_LENGTH = "{validator.text.field.max.invalid.digits.length}";
	// ##### Value in validator-messages_es_MX.properties file: El máximo de dígitos
	// permitido es
	// {0}
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MAX_DIGIT_LENGTH_MESSAGE = "validator.text.field.max.digits.length";
	// ##### Value in validator-messages_es_MX.properties file: El máximo de dígitos
	// permitido es
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_MAX_DIGIT_LENGTH_VALIDATION = "validator.text.field.max.digits.validation";
	// ##### Value in validator-messages_es_MX.properties file: Este campo debe
	// contener {0}
	// dígitos
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_DIGIT_LENGTH_MESSAGE = "validator.text.field.min.max.digits.length";

	// ##### Value in validator-messages_es_MX.properties file: tiene que
	// corresponder a la
	// expresión
	// regular
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_REGEXP_VALIDATION = "validator.text.field.regexp";

	// ##### Value in validator-messages_es_MX.properties file: Debe seleccionar una
	// imagen
	// ##### validator-messages_en_US.properties:
	public static final String SINGLE_FILE_IMG_MISSING_MESSAGE = "validator.text.single.file.img.missing";
	// ##### Value in validator-messages_es_MX.properties file: Debe seleccionar al
	// menos una
	// imagen
	// ##### validator-messages_en_US.properties:
	public static final String MULTIPLE_FILE_IMG_MISSING_MESSAGE = "validator.text.multiple.file.img.missing";
	// ##### Value in validator-messages_es_MX.properties file: Debe seleccionar un
	// archivo
	// ##### validator-messages_en_US.properties:
	public static final String SINGLE_FILE_MISSING_MESSAGE = "validator.text.single.file.missing";
	// ##### Value in validator-messages_es_MX.properties file: Debe seleccionar al
	// menos un
	// archivo
	// ##### validator-messages_en_US.properties:
	public static final String MULTIPLE_FILE_MISSING_MESSAGE = "validator.text.multiple.file.missing";
	// ##### Value in validator-messages_es_MX.properties file: Extensión de archivo
	// no válida
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FILE_EXTENSION_MESSAGE = "validator.text.invalid.file.extension";
	// ##### Value in validator-messages_es_MX.properties file: El tamaño del
	// archivo excede el
	// permitido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FILE_SIZE_MESSAGE = "validator.text.invalid.file.size";
	// ##### Value in validator-messages_es_MX.properties file: Tamaño de archivo
	// inválido
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FILE_SIZE_VALIDATION = "validator.text.invalid.file.size.validation";
	// ##### Value in validator-messages_es_MX.properties file: Tamaño de archivo
	// inválido (Excede
	// {0}KB)
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FILE_SIZE_KB_MESSAGE = "validator.text.invalid.file.size.kb";
	// ##### Value in validator-messages_es_MX.properties file: Tamaño de archivo
	// inválido (Excede
	// {0}MB)
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FILE_SIZE_MB_MESSAGE = "validator.text.invalid.file.size.mb";
	// ##### Value in validator-messages_es_MX.properties file: Tamaño de archivo
	// inválido (Excede
	// {0}GB)
	// ##### validator-messages_en_US.properties:
	public static final String INVALID_FILE_SIZE_GB_MESSAGE = "validator.text.invalid.file.size.gb";

	/**
	 * <p>
	 * Used for Java Bean Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Si el campo {field}
	 * tiene valor, el campo {conditionalField} no debe existir o su valor debe ser
	 * nulo <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: If the field
	 * {field} has a value, the field {conditionalField} must not exist or its value
	 * must be null
	 */
	public static final String CONDITIONAL = "{validator.text.conditional}";

	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Si el campo {field}
	 * tiene valor, el campo {conditionalField} no debe existir o su valor debe ser
	 * nulo <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: If the field
	 * {field} has a value, the field {conditionalField} must not exist or its value
	 * must be null
	 */
	public static final String CONDITIONAL_MESSAGE = "validator.text.conditional";

	/**
	 * <p>
	 * Used for Java Bean Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Alguno de los
	 * campos {field} o {conditionalField} no puede ser nulo <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: One of the fields
	 * {field} or {conditionalField} cannot be null
	 */
	public static final String CONDITIONAL_NULLABLE = "{validator.text.conditional.nullable}";

	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Alguno de los
	 * campos {field} o {conditionalField} no puede ser nulo <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: One of the fields
	 * {field} or {conditionalField} cannot be null
	 */
	public static final String CONDITIONAL_NULLABLE_MESSAGE = "validator.text.conditional.nullable";

	/**
	 * <p>
	 * Used for Java Bean Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Este campo no puede
	 * contener valores duplicados <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: This field cannot
	 * contain duplicate values
	 */
	public static final String DUPLICATED = "{validator.text.duplicated}";

	/**
	 * <p>
	 * Used for Error Validation
	 * </p>
	 * Value in <i>validator-messages_es_MX.properties</i> file: Este campo no puede
	 * contener valores duplicados <br>
	 * Value in <i>validator-messages_en_US.properties</i> file: This field cannot
	 * contain duplicate values
	 */
	public static final String DUPLICATED_MESSAGE = "validator.text.duplicated";

}