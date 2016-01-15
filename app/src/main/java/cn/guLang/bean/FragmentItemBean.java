package cn.guLang.bean;

/**
 * class summary:Fragment 条目实体类
 * Created by JackHappiness
 * Data 2015/12/28
 * Version 1.0
 */
public class FragmentItemBean<T> {
    private T cls;
    private String title;

    public FragmentItemBean(T cls, String title) {
        this.cls = cls;
        this.title = title;
    }

    public T getCls() {
        return cls;
    }

    public void setCls(T cls) {
        this.cls = cls;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
