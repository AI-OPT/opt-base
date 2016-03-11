package com.ai.opt.base.vo;

import java.io.Serializable;

/**
 * 交易请求报文头<br>
 * Date: 2015年8月12日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author mayt
 */
public class RequestHeader implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 系统ID
     */
    private String systemId;

    /**
     * 渠道ID
     */
    private String applyChlId;

    /**
     * 工号
     */
    private Long operId;

    /**
     * 省分代码
     */
    private String provinceCode;

    /**
     * 地市代码
     */
    private String cityCode;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getApplyChlId() {
        return applyChlId;
    }

    public void setApplyChlId(String applyChlId) {
        this.applyChlId = applyChlId;
    }
}
