package com.itcap.entity;

/**
 * Created by cmhy on 2018/7/4.
 */
public class BaseDoMain {

    private boolean sort;//是否排序
    private String direction;//排序方向
    private boolean limit;//是否分页
    private int page;//页数
    private int count;//每页数量

    public boolean isSort() {
        return sort;
    }

    public void setSort(boolean sort) {
        this.sort = sort;
    }

    public boolean isLimit() {
        return limit;
    }

    public void setLimit(boolean limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
