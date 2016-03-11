package com.ai.opt.base.vo;

import java.io.Serializable;

/**
 * 参数基础类.
 * Date: 2015年10月19日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author zhangchao
 */
public class BaseInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	/**
	 * 租户密码，可选
	 */
	private String tenantPwd;

	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTenantPwd() {
		return tenantPwd;
	}
	public void setTenantPwd(String tenantPwd) {
		this.tenantPwd = tenantPwd;
	}
	
	
}
