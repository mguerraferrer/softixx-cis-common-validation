package mx.softixx.cis.common.validation.exception;

import lombok.val;

public final class CustomExceptionUtils {
	
	private CustomExceptionUtils() {		
	}
	
	public static String exceptionClassName(CustomException exception) {
        try {
        	val className = exception.getClass().getName();
            int index = className.lastIndexOf(".");
            if (index != -1) {
                return className.substring(index + 1, className.length());
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
	
	public static String exceptionHttpStatus(CustomException exception) {
		if (exception.getHttpStatus() != null) {
			return exception.getHttpStatus().toString();
		}
		return null;
	}
	
}