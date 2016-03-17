package com.ai.opt.base.exception;

import java.io.Serializable;

public class RPCSystemException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 异常代码
     */
    private String errorCode;

    /**
     * 异常信息
     */
    private String errorMessage;

    /**
     * 异常详情
     */
    private String errorDetail;
    

    public RPCSystemException(Throwable e) {
        super(e);
    }

    public RPCSystemException(String errorMessage, Throwable e) {
        super(errorMessage, e);
    }
    /**
     * 异常构造器
     * @param errorCode 异常代码
     * @param errorMessage 异常信息
     * @ServiceMethod
     */
    public RPCSystemException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * 异常构造器
     * @param errorCode 异常代码
     * @param errorMessage 异常信息
     * @param errorDetail 异常详情
     * @ServiceMethod
     */
    public RPCSystemException(String errorCode, String errorMessage, String errorDetail) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
    }
    
    /**
     * 异常构造器
     * @param errorCode 异常代码
     * @param errorMessage 异常信息
     * @param rawException 原始异常信息
     */
    public RPCSystemException(String errorCode, String errorMessage, Exception rawException) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.setStackTrace(rawException.getStackTrace());
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
