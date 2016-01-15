package cn.guLang.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.nineoldandroids.animation.ObjectAnimator;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.OnClick;
import cn.guLang.adapter.CommonAdapter;
import cn.guLang.adapter.ViewHolder;
import cn.guLang.bean.ImageBean;
import cn.guLang.china.R;
import cn.guLang.customview.ScrollListView;
import cn.guLang.utils.ActivityUtils;
import cn.guLang.utils.LogUtils;
import cn.guLang.utils.ScreenUtil;
import cn.trinea.android.common.util.ListUtils;
import io.codetail.animation.SupportAnimator;
import io.codetail.animation.ViewAnimationUtils;
import io.codetail.animation.arcanimator.ArcAnimator;
import io.codetail.animation.arcanimator.Side;
import io.codetail.widget.RevealFrameLayout;

/**
 * class summary:
 * Created by JackHappiness
 * Data 2015/12/29
 * Version 1.0
 */
public class ImageListActivity extends BaseActivity {
    @Bind(R.id.lv_detial)
    ScrollListView recyclerView;
    private ArrayList<ImageBean.DataEntity> list = new ArrayList<>();
    private CommonAdapter<ImageBean.DataEntity> adapter;
    @Bind(R.id.backdrop)
    ImageView backImage;
    @Bind(R.id.collapsing_toolbar)
    CollapsingToolbarLayout mCollapsingToolbarLayout;
    private SupportAnimator mAnimator;
    @Bind(R.id.card_search)
    CardView mCardView;
    @Bind(R.id.iv_bottom_search)
    ImageView iv_bottom_search;
    @Bind(R.id.fl_content_all)
    RevealFrameLayout frameLayout;
    @Bind(R.id.view_hide)
    View view_hide;

    @OnClick(R.id.view_hide)
    void setView_hide() {
        iv_bottom_search.performClick();
    }

    //浮动按钮
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @OnClick(R.id.fab)
    void setFab() {
        view_hide.setVisibility(View.VISIBLE);
        ArcAnimator.createArcAnimator(fab, ScreenUtil.getScreenWidth() / 2, ScreenUtil.getStatusHeight() /*+ (toolbar.getHeight() / 2)*/, 45.0f, Side.LEFT)
                .setDuration(500)
                .start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mCardView.setVisibility(View.VISIBLE);
                fab.setVisibility(View.GONE);
                iv_bottom_search.performClick();
            }
        }, 600);
    }

    @OnClick(R.id.iv_bottom_search)
    void setSearch() {
        initSearch();
    }

    private void initSearch() {
        if (mAnimator != null && !mAnimator.isRunning()) {
            mAnimator = mAnimator.reverse();
            float curTranslationX = iv_bottom_search.getTranslationX();
            final ObjectAnimator animator = ObjectAnimator.ofFloat(iv_bottom_search, "translationX", curTranslationX, 0);
            animator.setDuration(600);
            mAnimator.addListener(new SupportAnimator.AnimatorListener() {
                @Override
                public void onAnimationStart() {
                    animator.start();
                }

                @Override
                public void onAnimationEnd() {
                    mAnimator = null;
                    fab.setVisibility(View.VISIBLE);
                    mCardView.setVisibility(View.GONE);
                    ArcAnimator.createArcAnimator(fab, ScreenUtil.getScreenWidth() - fab.getWidth() / 2 - ScreenUtil.dip2px(16), ScreenUtil.getScreenHeight() - fab.getHeight() * 2 - ScreenUtil.dip2px(10), 45.0f, Side.LEFT)
                            .setDuration(500)
                            .start();
                    view_hide.setVisibility(View.GONE);
                    ActivityUtils.hideSoftInput(activity);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            //searchData();
                        }
                    }, 500);

                }

                @Override
                public void onAnimationCancel() {

                }

                @Override
                public void onAnimationRepeat() {

                }
            });
        } else if (mAnimator != null) {
            mAnimator.cancel();
            return;
        } else {
            int cx = mCardView.getRight();
            int cy = mCardView.getBottom();
            float curTranslationX = iv_bottom_search.getTranslationX();
            final ObjectAnimator animator = ObjectAnimator.ofFloat(iv_bottom_search, "translationX", curTranslationX, cx / 2 - ScreenUtil.dip2px(24));
            animator.setDuration(600);
            float radius = r(mCardView.getWidth(), mCardView.getHeight());
            mAnimator = ViewAnimationUtils.createCircularReveal(mCardView, cx / 2, cy - ScreenUtil.dip2px(32), ScreenUtil.dip2px(20), radius);
            mAnimator.addListener(new SupportAnimator.AnimatorListener() {
                @Override
                public void onAnimationStart() {
                    animator.start();
                }

                @Override
                public void onAnimationEnd() {

                }

                @Override
                public void onAnimationCancel() {

                }

                @Override
                public void onAnimationRepeat() {

                }
            });
        }
        mAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        mAnimator.setDuration(600);
        mAnimator.start();
    }

    static float r(int a, int b) {
        return (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_select_list);
    }

    @Override
    protected void initView() {
        adapter = new CommonAdapter<ImageBean.DataEntity>(this, list, R.layout.item_image) {
            @Override
            public void convert(ViewHolder helper, final ImageBean.DataEntity item) {
                helper.setText(R.id.tv_title, item.getAbs());
                final ImageView iv_item = (ImageView) helper.getView(R.id.iv_item);
                Ion.with(activity)
                        .load(item.getImage_url())
                        .withBitmap()
                        .intoImageView(iv_item);
                iv_item.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(ImageListActivity.this, ImageDetailActivity.class);
                        intent.putExtra("item", item);
                        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(ImageListActivity.this, iv_item, "image").toBundle());
                    }
                });

            }
        };
        recyclerView.setAdapter(adapter);
        String title = getIntent().getStringExtra("key");
        mCollapsingToolbarLayout.setTitle(title);
        toolbar.findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        LogUtils.i(title);
        Ion.with(this)
                .load("http://image.baidu.com/channel/listjson?pn=0&rn=12&tag1=" + title + "&ftags=&sorttype=0&ie=utf8&oe=utf-8&image_id=&tag2=")
                .as(new TypeToken<ImageBean>() {
                })
                .setCallback(new FutureCallback<ImageBean>() {
                    @Override
                    public void onCompleted(Exception e, ImageBean result) {
                        if (result != null && !ListUtils.isEmpty(result.getData())) {
                            LogUtils.i(result.getData().size() + "");
                            result.getData().remove(result.getData().size() - 1);
                            list.addAll(result.getData());
                            adapter.notifyDataSetChanged();
                            //设置顶部图片
                            Ion.with(activity)
                                    .load(result.getData().get(0).getImage_url())
                                    .withBitmap()
                                    .intoImageView(backImage);
                        }
                    }
                });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void fillData() {
        frameLayout.setPadding(0, ScreenUtil.getStatusHeight(), 0, 0);
    }
}
