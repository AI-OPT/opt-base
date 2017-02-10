package com.ai.opt.base.exception;

/**
 * BusinessException封装异常
 * Date: 2017年2月9日 <br>
 * Copyright (c) 2017 asiainfo.com <br>
 * 
 * @author
 */
public class BusinessException extends GenericException {

    private static final long serialVersionUID = 1L;

    /**
     * @param errorCode
     * 错误码
     * @param errorMessage
     * 异常信息
     */
    public BusinessException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    
    public BusinessException(String message) {
        super(message);
        this.errorMessage = message;
    }
    
    public BusinessException(Exception oriEx) {
        super(oriEx);
    }
    
    
    public BusinessException(Throwable oriEx) {
        super(oriEx);
    }
    
    public BusinessException(String message, Exception oriEx) {
        super(message, oriEx);
        this.errorMessage = message;
    }
    public BusinessException(String message, Throwable oriEx) {
        super(message, oriEx);
        this.errorMessage = message;
    }

}
