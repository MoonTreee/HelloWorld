package com.muke.employee.domain;

import java.util.List;

/**
 * Created by Tree on 2017/3/14.
 * 分页封装的类
 * 当前页数
 * 每页显示的记录数
 * 总共记录数
 * 总共页数
 */
public class PageBean<T> {
    private int currPage;
    private int pageSize;
    private int totalCount;
    private int totalPage;
    private List<T> list;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
