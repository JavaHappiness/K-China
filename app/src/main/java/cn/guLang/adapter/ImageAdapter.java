package cn.guLang.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.guLang.activity.ImageDetailActivity;
import cn.guLang.bean.ImageBean;
import cn.guLang.china.R;
import cn.guLang.customview.RatioImageView;

/**
 * class summary:图片适配器
 * Created by JackHappiness
 * Data 2015/12/29
 * Version 1.0
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHold> {
    private Activity parentActivity;
    private ArrayList<ImageBean.DataEntity> list;

    public ImageAdapter(Activity parentActivity, ArrayList<ImageBean.DataEntity> list) {
        this.parentActivity = parentActivity;
        this.list = list;
    }

    @Override
    public ViewHold onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image, parent, false);
        return new ImageAdapter.ViewHold(v);
    }

    @Override
    public void onBindViewHolder(final ViewHold holder, final int position) {
        Picasso.with(parentActivity).load(list.get(position).getImage_url())
                .placeholder(R.mipmap.default_bg).error(R.mipmap.default_bg).into(holder.iv_item);
        holder.titleView.setText(list.get(position).getAbs());
        holder.iv_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parentActivity, ImageDetailActivity.class);
                intent.putExtra("item", list.get(position));
                parentActivity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(parentActivity, holder.iv_item, "image").toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHold extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_item)
        RatioImageView iv_item;
        @Bind(R.id.tv_title)
        TextView titleView;

        public ViewHold(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            iv_item.setOriginalSize(50, 50);

        }
    }
}