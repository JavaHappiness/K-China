package cn.guLang.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import cn.guLang.bean.ConstantBean;
import cn.guLang.bean.ImageBean;
import cn.guLang.china.R;
import cn.guLang.adapter.ImageAdapter;
import cn.guLang.utils.LogUtils;
import cn.trinea.android.common.util.ListUtils;
import kale.adapter.recycler.CommonRcvAdapter;

import static android.support.v7.widget.GridLayoutManager.*;

/**
 * class summary:图片Fragment
 * Created by JackHappiness
 * Data 2015/12/28
 * Version 1.0
 */
public class ImageFragment extends BaseFragment {
    private static final String ARG = "key";
    private ArrayList<ImageBean.DataEntity> list = new ArrayList<>();
    private ImageAdapter adapter;
    private static String title;
    private int position;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gridview, container, false);
        Activity parentActivity = getActivity();
        Bundle bundle = getArguments();
        title = bundle.getString("key");
        position = bundle.getInt("position");
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_image);
        if (position == 1) {
            LinearLayoutManager layoutManager = new LinearLayoutManager(parentActivity, LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(layoutManager);
        } else if (position == 2) {
            StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        } else if (position == 3) {
            GridLayoutManager layoutManager = new GridLayoutManager(parentActivity, 2);
            recyclerView.setLayoutManager(layoutManager);
        } else if (position == 4) {
            StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        }
        adapter = new ImageAdapter(parentActivity, list);
        recyclerView.setAdapter(adapter);
        LogUtils.i(title);
        Ion.with(getContext())
                .load("http://image.baidu.com/channel/listjson?pn=0&rn=12&tag1=" + title + "&ftags=&sorttype=0&ie=utf8&oe=utf-8&image_id=&tag2=")
                .as(new TypeToken<ImageBean>() {
                })
                .setCallback(new FutureCallback<ImageBean>() {
                    @Override
                    public void onCompleted(Exception e, ImageBean result) {
                        if (result!=null&&!ListUtils.isEmpty(result.getData())) {
                            LogUtils.i(result.getData().size() + "");
                            result.getData().remove(result.getData().size() - 1);
                            list.addAll(result.getData());
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
        return view;
    }
}
