package cn.guLang.activity;

import android.content.Intent;
import android.text.TextUtils;
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
import cn.guLang.adapter.ViewHolder;
import cn.guLang.bean.ItemListEntity;
import cn.guLang.bean.TestVideo;
import cn.guLang.bean.Type6Bean;
import cn.guLang.bean.VideoItemDetail;
import cn.guLang.bean.VideoSubItem;
import cn.guLang.bean.VideoTypeBean;
import cn.guLang.china.R;
import cn.guLang.customview.GridViewWithHeaderAndFooter;
import cn.guLang.customview.SlideShowView;
import cn.guLang.utils.LogUtils;
import cn.trinea.android.common.util.ListUtils;

/**
 * class summary:视频没有导航条
 * Created by JackHappiness
 * Data 2016/1/8
 * Version 1.0
 */
public class VideoNOTabActivity extends BaseActivity {
    @Bind(R.id.slideshowView)
    SlideShowView showView;
    @Bind(R.id.listView)
    ListView listView;
    private CommonAdapter<TestVideo> adapter;
    private List<TestVideo> mList = new ArrayList<>();

    @Override
    protected void setView() {
        setContentView(R.layout.activity_notab);
    }

    @Override
    protected void initView() {
        //创建适配器
        adapter = new CommonAdapter<TestVideo>(activity, mList, R.layout.video_list_item_type) {
            @Override
            public void convert(ViewHolder helper, TestVideo item) {
                helper.setText(R.id.tv_title, item.getTitle_type());
                //更多
                if (!TextUtils.isEmpty(item.getMoreUrl())) {
                    helper.getView(R.id.ll_more).setVisibility(View.VISIBLE);
                } else {
                    helper.getView(R.id.ll_more).setVisibility(View.GONE);
                }
                //视频列表
                GridViewWithHeaderAndFooter gridView = helper.getView(R.id.gridView);
                final List<ItemListEntity> itemListEntities = item.getList();
                final CommonAdapter<ItemListEntity> itemListEntityCommonAdapter = new CommonAdapter<ItemListEntity>(activity, itemListEntities, R.layout.video_item) {
                    @Override
                    public void convert(final ViewHolder helper, final ItemListEntity item) {
                        final List<VideoItemDetail.VideoEntity> subs = new ArrayList<>();
                        helper.setText(R.id.tv_title, item.getTitle());
                        if (!TextUtils.isEmpty(item.getImgUrl())) {
                            Picasso.with(activity).load(item.getImgUrl()).placeholder(R.mipmap.default_bg).error(R.mipmap.default_bg).into(helper.<ImageView>getView(R.id.iv_cover));
                        } else {
                            //获取栏目首个视频
                            Ion.with(activity).load("http://api.cntv.cn/video/videolistById?serviceId=cbox&vsid=" + item.getVsetId() + "&em=01&n=1").as(new TypeToken<VideoItemDetail>() {
                            }).setCallback(new FutureCallback<VideoItemDetail>() {
                                @Override
                                public void onCompleted(Exception e, VideoItemDetail result) {
                                    if (result != null) {
                                        subs.addAll(result.getVideo());
                                        Picasso.with(activity).load(result.getVideo().get(0).getImg()).placeholder(R.mipmap.default_bg).error(R.mipmap.default_bg).into(helper.<ImageView>getView(R.id.iv_cover));
                                    }
                                }
                            });
                        }
                        //跳转播放
                        helper.<ImageView>getView(R.id.iv_cover).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(activity, VideoPlayActivity.class);
                                if (TextUtils.isEmpty(item.getImgUrl())) {
                                    if (!ListUtils.isEmpty(subs)) {
                                        intent.putExtra("bean", subs.get(0));
                                        intent.putExtra("type", 1);
                                        startActivity(intent);
                                    }
                                } else {
                                    intent.putExtra("bean", item);
                                    intent.putExtra("type", 2);
                                    startActivity(intent);
                                }
                            }
                        });

                    }
                };
                gridView.setAdapter(itemListEntityCommonAdapter);
            }
        };
        listView.setAdapter(adapter);
    }

    @Override
    protected void fillData() {
        String url = getIntent().getStringExtra("json");
        String type = getIntent().getStringExtra("type");
        if (type.equals("7")) {
            Ion.with(activity).load(url).as(new TypeToken<VideoTypeBean>() {
            }).setCallback(new FutureCallback<VideoTypeBean>() {
                @Override
                public void onCompleted(Exception e, final VideoTypeBean result) {
                    //分类列表
                    if (result != null) {
                        showView.showView(activity, result.getData().getBigImg());
                        showView.startPlay();
                        //加载视频列表
                        for (int i = 0; i < result.getData().getItemList().size(); i++) {
                            final ItemListEntity item = result.getData().getItemList().get(i);
                            //获取数据
                            Ion.with(activity).load(item.getListUrl()).as(new TypeToken<VideoSubItem>() {
                            }).setCallback(new FutureCallback<VideoSubItem>() {
                                @Override
                                public void onCompleted(Exception e, VideoSubItem videoType) {
                                    //分类视频
                                    if (videoType != null) {
                                        TestVideo testVideo = new TestVideo();
                                        testVideo.setTitle_type(item.getTitle());
                                        testVideo.setList(videoType.getData().getItemList());
                                        testVideo.setMoreUrl(item.getMoreUrl());
                                        mList.add(testVideo);
                                    }
                                    adapter.notifyDataSetChanged();
                                }
                            });

                        }
                    }
                }
            });
        } else if (type.equals("6")) {
            Ion.with(activity).load(url).as(new TypeToken<Type6Bean>() {
            }).setCallback(new FutureCallback<Type6Bean>() {
                @Override
                public void onCompleted(Exception e, Type6Bean result) {
                    //分类列表
                    if (result != null) {
                        showView.showView(activity, result.getData().getBigImg());
                        showView.startPlay();
                        List<Type6Bean.DataEntity.ColumnListEntity> list = result.getData().getColumnList();
                        for (int i = 0; i < list.size(); i++) {
                            final Type6Bean.DataEntity.ColumnListEntity item = list.get(i);
                            //获取数据
                            Ion.with(activity).load(item.getLinkUrl()).as(new TypeToken<VideoSubItem>() {
                            }).setCallback(new FutureCallback<VideoSubItem>() {
                                @Override
                                public void onCompleted(Exception e, VideoSubItem videoType) {
                                    //分类视频
                                    if (videoType != null) {
                                        TestVideo testVideo = new TestVideo();
                                        testVideo.setTitle_type(item.getTitle());
                                        testVideo.setList(videoType.getData().getItemList());
                                        testVideo.setMoreUrl(item.getMoreUrl());
                                        mList.add(testVideo);
                                    }
                                    adapter.notifyDataSetChanged();
                                }
                            });
                        }
                    }
                }
            });
        }

    }
}
