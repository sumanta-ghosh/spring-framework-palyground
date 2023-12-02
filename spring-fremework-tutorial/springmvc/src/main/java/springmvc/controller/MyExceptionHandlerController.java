package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandlerController {
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ NullPointerException.class })
	public String exceptionHandler() {
		return "null-error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)

	@ExceptionHandler({ NumberFormatException.class })
	public String formatExceptionHandler() {
		return "format-error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ Exception.class })
	public String generalExceptionHandler() {
		return "error";
	}
}
