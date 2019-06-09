package com.powerbridge.codegen.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.powerbridge.core.advice.GlobalExceptionHandler;
import com.powerbridge.core.dto.AjaxResult;

/**
 * @Description: 全局统一异常
 * @author: shunhe@powerbridge.com
 * @Date: 2018年4月16日下午5:43:10
 */
@ControllerAdvice
public class MyExceptionHandler extends GlobalExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
		return super.handleExceptionInternal(ex, body, headers, status, request);
	}

	@Override
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public AjaxResult jsonHandler(HttpServletRequest request, Exception e){
		return super.jsonHandler(request, e);
	}
}
