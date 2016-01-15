package cn.guLang.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import cn.guLang.adapter.CommonAdapter;
import cn.guLang.adapter.ViewHolder;
import cn.guLang.bean.ConstantBean;
import cn.guLang.bean.VideoType;
import cn.guLang.china.R;
import cn.guLang.customview.BackScrollView;
import cn.guLang.customview.GridViewWithHeaderAndFooter;
import cn.guLang.customview.SlideShowView;

/**
 * class summary:视频分类界面
 * Created by JackHappiness
 * Data 2016/1/8
 * Version 1.0
 */
public class VideoTypeActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    @Bind(R.id.backScrollView)
    BackScrollView scrollView;
    @Bind(R.id.slideshowView)
    SlideShowView showView;
    @Bind(R.id.gridView)
    GridView gridView;
    private List<VideoType.DataEntity.CategoryListEntity> lilst = new ArrayList<>();
    private CommonAdapter<VideoType.DataEntity.CategoryListEntity> adapter;

    @Override
    protected void setView() {
        setContentView(R.layout.activity_video_type);
    }

    @Override
    protected void initView() {
        //设置适配器
        adapter = new CommonAdapter<VideoType.DataEntity.CategoryListEntity>(activity, lilst, R.layout.video_type_item) {
            @Override
            public void convert(ViewHolder helper, VideoType.DataEntity.CategoryListEntity item) {
                helper.setText(R.id.tv_title, item.getTitle());
                Picasso.with(activity).load(item.getImgUrl()).placeholder(R.mipmap.icon_time).error(R.mipmap.icon_time).into(helper.<ImageView>getView(R.id.iv_item));
            }
        };
        gridView.setAdapter(adapter);
    }

    @Override
    protected void fillData() {
        //获取数据
        Ion.with(activity).load(ConstantBean.VIDEO_TYPE).as(new TypeToken<VideoType>() {
        }).setCallback(new FutureCallback<VideoType>() {
            @Override
            public void onCompleted(Exception e, VideoType result) {
                if (result != null) {
                    showView.showView(activity, result.getData().getBigImg());
                    showView.startPlay();
                    lilst.addAll(result.getData().getCategoryList());
                    adapter.notifyDataSetChanged();
                    scrollView.smoothScrollTo(0, 0);
                }
            }
        });
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //点击跳转
        VideoType.DataEntity.CategoryListEntity item = lilst.get(position);
        Intent intent = null;
        if (item.getCategory().equals("7")) {
            intent = new Intent(activity, VideoNOTabActivity.class);
            intent.putExtra("json", item.getListUrl());
            intent.putExtra("type", item.getCategory());
        } else if (item.getCategory().equals("8")) {

        } else {
            intent = new Intent(activity, VideoListActivity.class);
            intent.putExtra("json", item.getListUrl());
            intent.putExtra("title",item.getTitle());
         }
        startActivity(intent);
    }
}
