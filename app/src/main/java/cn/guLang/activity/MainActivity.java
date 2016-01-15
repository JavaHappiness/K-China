package cn.guLang.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;

import com.bigkoo.pickerview.OptionsPickerView;
import com.bigkoo.pickerview.listener.OnDismissListener;
import com.github.ksoichiro.android.observablescrollview.ObservableGridView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;
import com.github.ksoichiro.android.observablescrollview.ScrollUtils;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
import cn.guLang.adapter.CustomVPAdapter;
import cn.guLang.bean.FragmentItemBean;
import cn.guLang.china.R;
import cn.guLang.customview.SlidingTabLayout;
import cn.guLang.fragment.ImageFragment;

/**
 * class summary:主界面Activity
 * Created by JackHappiness
 * Data 2015/12/28
 * Version 1.0
 */
public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private CustomVPAdapter adapter;
    private boolean isShow = true;
    //浮动按钮
    @Bind(R.id.fab)
    FloatingActionButton fab;
    private OptionsPickerView pvOptions;

    @OnClick(R.id.fab)
    void setFab() {

        if (isShow) {
            hideFab();
            isShow = false;
            pvOptions.show();
        } else {
            isShow = true;
        }

    }

    //侧滑
    @Bind(R.id.drawer_layout)
    DrawerLayout drawer;
    @Bind(R.id.nav_view)
    NavigationView navigationView;
    //ViewPage
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.sliding_tabs)
    SlidingTabLayout slidingTabLayout;
    @Bind(R.id.header)
    View mHeaderView;

    private List<FragmentItemBean<Fragment>> fragmentList = new ArrayList<>();

    @Override
    protected void setView() {
        setContentView(R.layout.activity_main);
    }

    private String[] titles = {"明星", "美女", "搞笑", "摄影"};

    @Override
    protected void initView() {
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        for (int i = 1; i < titles.length + 1; i++) {
            ImageFragment fragment = new ImageFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key", titles[i - 1]);
            bundle.putInt("position", i);
            fragment.setArguments(bundle);
            fragmentList.add(new FragmentItemBean<Fragment>(fragment, titles[i - 1]));
        }

        ViewCompat.setElevation(mHeaderView, getResources().getDimension(R.dimen.toolbar_elevation));
        //初始化ViewPager
        adapter = new CustomVPAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(4);
        slidingTabLayout.setCustomTabView(R.layout.tab_indicator, android.R.id.text1);
        slidingTabLayout.setSelectedIndicatorColors(getResources().getColor(android.R.color.white));
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setViewPager(viewPager);
    }

    @Override
    protected void fillData() {
        //选项选择器
        final ArrayList<String> list = new ArrayList<>();
        if (pvOptions == null) {
            pvOptions = new OptionsPickerView(this);
        }
        for (String title : titles) {
            list.add(title);
        }
        pvOptions.setPicker(list);
        pvOptions.setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss(Object o) {
                showFab();
                isShow = true;
            }
        });
        pvOptions.setOnoptionsSelectListener(new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3) {
                showFab();
                isShow = true;
                Intent intent = new Intent(MainActivity.this, ImageListActivity.class);
                intent.putExtra("key", list.get(options1));
                startActivity(intent);
            }
        });
    }

    //返回键
    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //toolbar 选项点击事件
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(activity, VideoTypeActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void showFab() {
        if (fab != null) {
            fab.animate().scaleX(1.0f);
            fab.animate().scaleY(1.0f);
            fab.animate().translationX(0);
        }
    }

    public void hideFab() {
        if (fab != null) {
            fab.animate().scaleX(0.1f);
            fab.animate().scaleY(0.1f);
            fab.animate().translationX(200);
        }
    }

}
