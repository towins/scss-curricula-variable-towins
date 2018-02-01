package org.towins.scss.dto.vo;

import org.forten.dto.PageInfo;

import java.util.Collection;

public class QueryList<T> {
    private Collection<T> list;
    private PageInfo pageInfo;

    public QueryList() {
    }

    public QueryList(Collection list, PageInfo pageInfo) {
        this.list = list;
        this.pageInfo = pageInfo;
    }

    public Collection getList() {
        return list;
    }

    public void setList(Collection list) {
        this.list = list;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
    public boolean isEmptyData() {
        return this.list == null || this.list.size() == 0;
    }
    @Override
    public String toString() {
        return "QueryList{" +
                "list=" + list +
                ", pageInfo=" + pageInfo +
                '}';
    }
}
