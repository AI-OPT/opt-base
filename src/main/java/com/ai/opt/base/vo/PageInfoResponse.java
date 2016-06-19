package com.ai.opt.base.vo;

import java.util.List;

/**
 * 分页对象,继承BaseResponse.<br>
 * 用于dubbo服务返回分页信息<br>
 *
 * @param <T> 结果集的数据类型
 *
 * Date: 2016年5月9日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author liutong5
 */
public class PageInfoResponse<T> extends BaseResponse {
    private static final long serialVersionUID = 1L;

    /**
     * 请求查询的页码
     */
    private Integer pageNo = 1;

    /**
     * 每页显示条数
     */
    private Integer pageSize;

    /**
     * 结果集
     */
    private List<T> result;

    /**
     * 总条数
     */
    private int count = 0;

    /**
     * 总页数
     */
    private int pageCount;
    
    private int startRowIndex;
    private int endRowIndex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    /**
     * 获取开始行
     * 
     * @return
     * @author gucl
     */
    public int getStartRowIndex() {
    	startRowIndex=(this.getPageNo() - 1) * this.getPageSize();
        return startRowIndex;
    }

    /**
     * 获取结束行
     * 
     * @return
     * @author gucl
     */
    public int getEndRowIndex() {
    	endRowIndex=this.getPageNo() * this.getPageSize();
        return endRowIndex;
    }

    /**
     * 获取最大页数
     *
     * @return
     * @author gucl
     */
    public int getPageCount() {
        int quotient = this.getCount() / this.getPageSize();
        int remainder = this.getCount() % this.getPageSize();
        pageCount = quotient;
        return remainder > 0? ++pageCount:pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
