package com.ai.opt.base.exception;

import java.io.Serializable;

public class RPCSystemException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    public RPCSystemException(Throwable e) {
        super(e);
    }

    public RPCSystemException(String errorMessage, Throwable e) {
        super(errorMessage, e);
    }
}
