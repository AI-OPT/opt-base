package com.ai.opt.base.vo;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.context.i18n.LocaleContextHolder;

import com.ai.paas.ipaas.i18n.ZoneContextHolder;

/**
 * 参数基础类.
 * Date: 2016年11月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author gucl
 */
public class BaseInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public BaseInfo() {
		// set in the web
		if (null != LocaleContextHolder.getLocale()) {
			locale = LocaleContextHolder.getLocale();
		}
		if (null != ZoneContextHolder.getZone()) {
			timeZone = TimeZone.getTimeZone(ZoneContextHolder.getZone());
		}
	}
	
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	/**
	 * 租户密码，可选
	 */
	private String tenantPwd;
	
	/**
	 * 区域属性
	 */
	private Locale locale;

	private TimeZone timeZone;
	
	

	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public TimeZone getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}
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
