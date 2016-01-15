package cn.guLang.activity;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;

import java.lang.ref.WeakReference;

import butterknife.ButterKnife;
import cn.guLang.china.CustomApplication;
import cn.guLang.china.R;
import cn.guLang.utils.StatusBarCompat;

/**
 * class summary:所有Activity的基类
 * Created by JackHappiness
 * Data 2015/12/28
 * Version 1.0
 */
public abstract class BaseActivity extends AppCompatActivity {
    private WeakReference<Activity> activitys;
    public CustomApplication mApplication;
    public BaseActivity activity;
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setView();
        StatusBarCompat.compat(this, getResources().getColor(R.color.colorPrimary));
        toolbar = ButterKnife.findById(this, R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
        activity = this;
        ButterKnife.bind(this);
        mApplication = (CustomApplication) getApplicationContext();
        activitys = new WeakReference<Activity>(this);
        mApplication.pushTask(activitys);
        initView();
        fillData();
    }

    //填充布局
    protected abstract void setView();

    //查找控件
    protected abstract void initView();

    //填充数据
    protected abstract void fillData();

    //获取ActionBar的高度
    protected int getActionBarSize() {
        TypedValue typedValue = new TypedValue();
        int[] textSizeAttr = new int[]{R.attr.actionBarSize};
        int indexOfAttrTextSize = 0;
        TypedArray a = obtainStyledAttributes(typedValue.data, textSizeAttr);
        int actionBarSize = a.getDimensionPixelSize(indexOfAttrTextSize, -1);
        a.recycle();
        return actionBarSize;
    }

    //获取屏幕内容高度
    protected int getScreenHeight() {
        return findViewById(android.R.id.content).getHeight();
    }

    @Override
    protected void onDestroy() {
        mApplication.removeTask(activitys);
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
