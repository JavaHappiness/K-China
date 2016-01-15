package cn.guLang.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import cn.guLang.bean.BigImgEntity;
import cn.guLang.china.R;
import cn.trinea.android.common.util.ListUtils;

/**
 * class summary:图片轮播
 * Created by JackHappiness
 * Data 2016/1/8
 * Version 1.0
 */
public class SlideShowView extends FrameLayout implements ViewPager.OnPageChangeListener {
    //放轮播图片的ImageView 的list
    private List<ImageView> imageViewsList = new ArrayList<>();
    //放圆点的View的list
    private List<View> dotViewsList = new ArrayList<>();
    boolean isAutoPlay = false;
    private ViewPager viewPager;
    //当前轮播页
    private int currentItem = 0;
    //定时任务
    private ScheduledExecutorService scheduledExecutorService;

    private Context context;
    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            viewPager.setCurrentItem(currentItem);
        }

    };

    public SlideShowView(Context context, List<String> list) {
        super(context, null);
        this.context = context;
    }

    public SlideShowView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SlideShowView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    /**
     * 开始轮播图切换
     */
    public void startPlay() {
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new SlideShowTask(), 1, 4, TimeUnit.SECONDS);
    }

    /**
     * 初始化Views等UI
     */
    public void showView(final Context context, final List<BigImgEntity> imageUrls) {
        if (ListUtils.isEmpty(imageUrls))
            return;
        LayoutInflater.from(context).inflate(R.layout.layout_slideshow, this, true);
        LinearLayout dotLayout = (LinearLayout) findViewById(R.id.dotLayout);
        dotLayout.removeAllViews();
        // 热点个数与图片特殊相等
        for (int i = 0; i < imageUrls.size(); i++) {
            ImageView view = (ImageView) View.inflate(context, R.layout.showview_item, null);
            view.setTag(imageUrls.get(i));
            imageViewsList.add(view);
            ImageView dotView = new ImageView(context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.leftMargin = 4;
            params.rightMargin = 4;
            dotLayout.addView(dotView, params);
            dotViewsList.add(dotView);
        }
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setFocusable(true);
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public void destroyItem(View container, int position, Object object) {
                ((ViewPager) container).removeView(imageViewsList.get(position));
            }

            @Override
            public Object instantiateItem(View container, int position) {
                ImageView imageView = imageViewsList.get(position);
                Picasso.with(context).load(imageUrls.get(position).getImgUrl()).placeholder(R.mipmap.default_bg).error(R.mipmap.default_bg).into(imageView);
                ((ViewPager) container).addView(imageView);
                return imageView;
            }

            @Override
            public int getCount() {
                return imageViewsList.size();
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                return arg0 == arg1;
            }
        });
        viewPager.setOnPageChangeListener(this);
    }


    @Override
    public void onPageScrollStateChanged(int arg0) {
        switch (arg0) {
            case 1:// 手势滑动，空闲中
                isAutoPlay = false;
                break;
            case 2:// 界面切换中
                isAutoPlay = true;
                break;
            case 0:// 滑动结束，即切换完毕或者加载完毕
                // 当前为最后一张，此时从右向左滑，则切换到第一张
                if (viewPager.getCurrentItem() == viewPager.getAdapter().getCount() - 1 && !isAutoPlay) {
                    viewPager.setCurrentItem(0);
                }
                // 当前为第一张，此时从左向右滑，则切换到最后一张
                else if (viewPager.getCurrentItem() == 0 && !isAutoPlay) {
                    viewPager.setCurrentItem(viewPager.getAdapter().getCount() - 1);
                }
                break;
        }
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int pos) {
        currentItem = pos;
        for (int i = 0; i < dotViewsList.size(); i++) {
            if (i == pos) {
                dotViewsList.get(pos).setBackgroundResource(R.mipmap.dot_focus);
            } else {
                dotViewsList.get(i).setBackgroundResource(R.mipmap.dot_blur);
            }
        }
    }

    /**
     * 执行轮播图切换任务
     */
    private class SlideShowTask implements Runnable {

        @Override
        public void run() {
            synchronized (viewPager) {
                currentItem = (currentItem + 1) % imageViewsList.size();
                handler.obtainMessage().sendToTarget();
            }
        }

    }

}