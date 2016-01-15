package cn.guLang.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.ProgressCallback;

import java.io.File;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.OnClick;
import cn.guLang.bean.ImageBean;
import cn.guLang.china.R;
import cn.guLang.utils.LogUtils;
import cn.trinea.android.common.util.ToastUtils;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * class summary:图片大图界面
 * Created by JackHappiness
 * Data 2015/12/29
 * Version 1.0
 */
public class ImageDetailActivity extends BaseActivity {
    @Bind(R.id.picture)
    ImageView mImageView;
    private ImageBean.DataEntity item;
    private PhotoViewAttacher mPhotoViewAttacher;
    @Bind(R.id.collapsing_toolbar)
    CollapsingToolbarLayout mCollapsingToolbarLayout;
    @Bind(R.id.back)
    TextView textView;

    @OnClick(R.id.back)
    void back() {
        finish();
    }

    @OnClick(R.id.rb_edit)
    void rb_edit() {

    }


    @OnClick(R.id.rb_down)
    void rb_down() {
        Ion.with(this)
                .load(item.getImage_url())
                .progressBar(new ProgressBar(activity))
                .progress(new ProgressCallback() {
                    @Override
                    public void onProgress(long l, long l1) {
                        LogUtils.i(l + "/" + l1);
                    }
                })
                .write(new File(getFilesDir(), System.currentTimeMillis() + ".jpg")).setCallback(new FutureCallback<File>() {
            @Override
            public void onCompleted(Exception e, File result) {
                ToastUtils.show(activity, "下载成功！");
            }
        });

    }

    @OnClick(R.id.rb_collect)
    void rb_collect() {
        LogUtils.i("rb_edit");
    }

    @OnClick(R.id.rb_share)
    void rb_share() {
        shareText();
    }

    @Override
    protected void setView() {
        setContentView(R.layout.activity_picture);
    }

    @Override
    protected void initView() {
        item = (ImageBean.DataEntity) getIntent().getSerializableExtra("item");
        // init image view
        ViewCompat.setTransitionName(mImageView, "image");
        Ion.with(this).load(item.getImage_url()).intoImageView(mImageView);
        textView.setText(item.getAbs());
    }

    @Override
    protected void fillData() {

    }

    //分享文字
    public void shareText() {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, item.getAbs() + item.getImage_url());
        shareIntent.setType("text/plain");
        //设置分享列表的标题，并且每次都显示分享列表
        startActivity(Intent.createChooser(shareIntent, "分享到"));
    }

    //分享单张图片
    public void shareSingleImage(View view) {
        String imagePath = Environment.getExternalStorageDirectory() + File.separator + "test.jpg";
        //由文件得到uri
        Uri imageUri = Uri.fromFile(new File(imagePath));
        Log.d("share", "uri:" + imageUri);  //输出：file:///storage/emulated/0/test.jpg
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
        shareIntent.setType("image/*");
        startActivity(Intent.createChooser(shareIntent, "分享到"));
    }

    //分享多张图片
    public void shareMultipleImage(View view) {
        ArrayList<Uri> uriList = new ArrayList<>();
        String path = Environment.getExternalStorageDirectory() + File.separator;
        uriList.add(Uri.fromFile(new File(path + "australia_1.jpg")));
        uriList.add(Uri.fromFile(new File(path + "australia_2.jpg")));
        uriList.add(Uri.fromFile(new File(path + "australia_3.jpg")));
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND_MULTIPLE);
        shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, uriList);
        shareIntent.setType("image/*");
        startActivity(Intent.createChooser(shareIntent, "分享到"));
    }
}
