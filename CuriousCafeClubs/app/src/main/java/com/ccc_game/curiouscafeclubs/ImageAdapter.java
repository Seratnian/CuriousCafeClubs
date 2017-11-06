package com.ccc_game.curiouscafeclubs;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by Sebastian on 21.04.2017.
 */

class ImageAdapter extends BaseAdapter {
    private Context context;
    private TypedArray images;

    public ImageAdapter(Context context, TypedArray images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length();
    }

    @Override
    public Object getItem(int position) {
        return images.getDrawable(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageDrawable(images.getDrawable(position));
        return imageView;
    }

}