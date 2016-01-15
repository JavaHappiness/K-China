
package cn.guLang.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import butterknife.Bind;
import cn.guLang.bean.ItemListEntity;
import cn.guLang.bean.VideoItemDetail;
import cn.guLang.bean.VideoListBean;
import cn.guLang.bean.VideoPlayBean;
import cn.guLang.china.R;
import cn.guLang.utils.LogUtils;
import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.MediaPlayer.OnBufferingUpdateListener;
import io.vov.vitamio.MediaPlayer.OnInfoListener;
import io.vov.vitamio.MediaPlayer.OnPreparedListener;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

/**
 * 视频播放
 *
 * @author JackHappiness
 */

public class VideoPlayActivity extends BaseActivity implements OnInfoListener, OnBufferingUpdateListener,
        OnPreparedListener, io.vov.vitamio.MediaPlayer.OnCompletionListener {

    @Bind(R.id.buffer)
    VideoView mVideoView;
    @Bind(R.id.probar)
    ProgressBar mProgressBar;
    @Bind(R.id.load_rate)
    TextView mLoadRate;
    private MediaController mediaController;
    String id;
    String listUrl;

    @Override
    protected void setView() {
        if (!LibsChecker.checkVitamioLibs(this))
            return;
        setContentView(R.layout.activity_play_videobuffer);
    }

    @Override
    protected void initView() {
        mediaController = new MediaController(this);
    }

    @Override
    protected void fillData() {
        if (getIntent().getIntExtra("type", 1) == 1) {
            VideoItemDetail.VideoEntity bean = (VideoItemDetail.VideoEntity) getIntent().getSerializableExtra("bean");
            id = bean.getVid();
            listUrl = null;
        } else {
            ItemListEntity bean = (ItemListEntity) getIntent().getSerializableExtra("bean");
            id = bean.getVid();
            listUrl = bean.getListUrl();
        }
        if (!TextUtils.isEmpty(id)) {
            playVideo();
        } else if (!TextUtils.isEmpty(listUrl)) {
            Ion.with(activity).load(listUrl).as(new TypeToken<VideoListBean>() {
            }).setCallback(new FutureCallback<VideoListBean>() {
                @Override
                public void onCompleted(Exception e, VideoListBean result) {
                    if (result != null) {
                        id = result.getData().getItemList().get(0).getItemId();
                        playVideo();
                    }
                }
            });
        }

    }

    //播放视频
    private void playVideo() {
        LogUtils.e("videoPlay", "简介路径：" + "http://vdn.apps.cntv.cn/api/getHttpVideoInfo.do?pid=" + id);
        Ion.with(this).load("http://vdn.apps.cntv.cn/api/getHttpVideoInfo.do?pid=" + id).as(new TypeToken<VideoPlayBean>() {
        }).setCallback(new FutureCallback<VideoPlayBean>() {
            @Override
            public void onCompleted(Exception e, VideoPlayBean result) {
                if (result != null) {
                    mVideoView.setVideoPath(result.getHls_url());
                    mVideoView.setMediaController(mediaController);
                    mVideoView.requestFocus();
                    mVideoView.setOnInfoListener(VideoPlayActivity.this);
                    mVideoView.setOnBufferingUpdateListener(VideoPlayActivity.this);
                    mVideoView.setOnPreparedListener(VideoPlayActivity.this);
                    mVideoView.setOnCompletionListener(VideoPlayActivity.this);
                }
            }
        });
    }

    @Override
    public void onBufferingUpdate(MediaPlayer mp, int percent) {
        mLoadRate.setText(percent + "%");
    }

    @Override
    public boolean onInfo(MediaPlayer mp, int what, int extra) {
        switch (what) {
            /**
             * 暂停
             */
            case MediaPlayer.MEDIA_INFO_BUFFERING_START:
                if (mVideoView.isPlaying()) {
                    mVideoView.pause();
                    mProgressBar.setVisibility(View.VISIBLE);
                    mLoadRate.setText("");
                    mLoadRate.setVisibility(View.VISIBLE);
                }
                break;
            /**
             * 播放
             */
            case MediaPlayer.MEDIA_INFO_BUFFERING_END:
                mVideoView.start();
                mProgressBar.setVisibility(View.GONE);
                mLoadRate.setVisibility(View.GONE);
                break;
        }
        return true;
    }

    /**
     * 播放回调
     */
    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setPlaybackSpeed(1.0f);
    }

    /**
     * 播放完成
     */
    @Override
    public void onCompletion(MediaPlayer mp) {

    }

}
