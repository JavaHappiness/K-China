package cn.guLang.bean;

import java.util.List;

/**
 * class summary:
 * Created by JackHappiness
 * Data 2016/1/6
 * Version 1.0
 */
public class TestVideo<T> {
    private String title_type;
    private List<T> list;
    private String moreUrl;

    public String getMoreUrl() {
        return moreUrl;
    }

    public void setMoreUrl(String moreUrl) {
        this.moreUrl = moreUrl;
    }

    public String getTitle_type() {
        return title_type;
    }

    public void setTitle_type(String title_type) {
        this.title_type = title_type;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
