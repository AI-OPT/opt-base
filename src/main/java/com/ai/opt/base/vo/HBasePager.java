package com.ai.opt.base.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 针对HBase的分页器<br>
 * Date: 2016年4月12日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author mayt
 */
public class HBasePager<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 每页显示条数
     */
    private int pageSize;

    /**
     * 起始行
     */
    private String startRow;

    /**
     * 上一行
     */
    private String previousRow;

    /**
     * 结果集
     */
    private List<T> result;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public String getStartRow() {
        return startRow;
    }

    public void setStartRow(String startRow) {
        this.startRow = startRow;
    }

    public String getPreviousRow() {
        return previousRow;
    }

    public void setPreviousRow(String previousRow) {
        this.previousRow = previousRow;
    }

}
