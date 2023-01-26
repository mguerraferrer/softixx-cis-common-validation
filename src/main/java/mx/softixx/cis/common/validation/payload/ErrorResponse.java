package mx.softixx.cis.common.validation.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.softixx.cis.common.validation.exception.CustomException;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	private String errorMessage;
	private String errorCode;
	private Integer httpStatus;
	
	public static final <T extends CustomException> ErrorResponse errorBuild(T exception) {
		return ErrorResponse
				.builder()
				.errorMessage(exception.getMessage())
				.errorCode(exception.getErrorCode())
				.httpStatus(exception.getHttpStatus().value())
				.build();
	}
	
}