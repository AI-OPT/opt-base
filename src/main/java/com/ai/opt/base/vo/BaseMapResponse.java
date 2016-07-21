package com.ai.opt.base.vo;

import java.io.Serializable;
import java.util.Map;

/**
 * 服务返回基本信息<br>
 * Date: 2016年2月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author mayt
 */
public class BaseMapResponse<K,V> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<K,V> result;
    
    public Map<K, V> getResult() {
		return result;
	}

	public void setResult(Map<K, V> result) {
		this.result = result;
	}

	/**
     * 服务返回报文头信息
     */
    private ResponseHeader responseHeader;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }
}
