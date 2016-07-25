package com.ai.opt.base.vo;

import java.util.Collections;
import java.util.Map;

/**
 * 服务返回map基本信息<br>
 * Date: 2016年2月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author mayt
 */
public class BaseMapResponse<K,V> extends BaseResponse {
    private static final long serialVersionUID = 1L;
    
    private Map<K,V> result = Collections.emptyMap();
    
    public Map<K, V> getResult() {
		return result;
	}

	public void setResult(Map<K, V> result) {
		this.result = result;
	}
}
