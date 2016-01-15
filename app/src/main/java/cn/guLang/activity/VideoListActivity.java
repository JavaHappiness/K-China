package cn.guLang.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import cn.guLang.adapter.CommonAdapter;
import cn.guLang.adapter.CustomVPAdapter;
import cn.guLang.adapter.ViewHolder;
import cn.guLang.bean.FragmentItemBean;
import cn.guLang.bean.ZhuanTiBean;
import cn.guLang.china.R;
import cn.guLang.customview.ScrollListView;
import cn.guLang.customview.SlidingTabLayout;
import cn.guLang.fragment.ImageFragment;
import cn.guLang.utils.LogUtils;
import cn.guLang.utils.StatusBarCompat;

/**
 * class summary:视频列表Activity
 * Created by JackHappiness
 * Data 2016/1/7
 * Version 1.0
 */
public class VideoListActivity extends BaseActivity {
    @Bind(R.id.listView)
    ScrollListView listView;
    private List<ZhuanTiBean.DataEntity.CategoryListEntity> list = new ArrayList<>();
    private CommonAdapter<ZhuanTiBean.DataEntity.CategoryListEntity> adapter;

    @Override
    protected void setView() {
        setContentView(R.layout.activity_video_list);
    }

    @Override
    protected void initView() {
        adapter = new CommonAdapter<ZhuanTiBean.DataEntity.CategoryListEntity>(activity, list, R.layout.item_image) {
            @Override
            public void convert(ViewHolder helper, final ZhuanTiBean.DataEntity.CategoryListEntity item) {
                helper.setText(R.id.tv_title, item.getTitle());
                Picasso.with(activity).load(item.getImgUrl()).placeholder(R.mipmap.default_bg).error(R.mipmap.default_bg).into(helper.<ImageView>getView(R.id.iv_item));
                helper.<ImageView>getView(R.id.iv_item).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (item.getCategory().equals("7")) {
                            Intent intent = new Intent(activity, VideoNOTabActivity.class);
                            intent.putExtra("json", item.getListUrl());
                            intent.putExtra("type", item.getCategory());
                            startActivity(intent);
                        } else if (item.getCategory().equals("6")) {
                            Intent intent = new Intent(activity, VideoNOTabActivity.class);
                            intent.putExtra("json", item.getListUrl());
                            intent.putExtra("type", item.getCategory());
                            startActivity(intent);
                        }
                    }
                });
            }
        };
        listView.setAdapter(adapter);
    }

    @Override
    protected void fillData() {
        //获取数据
        String url = getIntent().getStringExtra("json");
        LogUtils.e("url", url);
        Ion.with(this).load(url).as(new TypeToken<ZhuanTiBean>() {
        }).setCallback(new FutureCallback<ZhuanTiBean>() {
            @Override
            public void onCompleted(Exception e, ZhuanTiBean result) {
                if (result != null) {
                    list.addAll(result.getData().getCategoryList());
                    adapter.notifyDataSetChanged();
                }
            }
        });
        //顶部ToolBar
        toolbar.setTitle(getIntent().getStringExtra("title"));
        toolbar.setNavigationIcon(R.mipmap.actionbar_back);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
