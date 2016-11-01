package com.ai.opt.base.vo;

import java.util.Collections;
import java.util.List;

/**
 * 服务返回list基本信息<br>
 * Date: 2016年2月26日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author mayt
 */
public class BaseListResponse<T> extends BaseResponse {
    private static final long serialVersionUID = 1L;
    
    private List<T> result = Collections.emptyList();

    public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

}
