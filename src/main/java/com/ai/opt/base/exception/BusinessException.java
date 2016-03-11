package com.ai.opt.base.exception;

public class BusinessException extends GenericException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
