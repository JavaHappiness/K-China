package cn.guLang.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.github.ksoichiro.android.observablescrollview.CacheFragmentStatePagerAdapter;

import java.util.List;

import cn.guLang.bean.FragmentItemBean;
import cn.guLang.fragment.ImageFragment;

/**
 * class summary:ViewPage 适配器
 * Created by JackHappiness
 * Data 2015/12/28
 * Version 1.0
 */
public class CustomVPAdapter extends FragmentStatePagerAdapter {
    private final List<FragmentItemBean<Fragment>> list;

    public CustomVPAdapter(FragmentManager fm, List<FragmentItemBean<Fragment>> list) {
        super(fm);
        this.list = list;
    }

    //获取Fragment的数量
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position).getCls();
    }
}
