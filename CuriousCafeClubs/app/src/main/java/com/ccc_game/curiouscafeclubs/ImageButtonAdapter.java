package com.ccc_game.curiouscafeclubs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;

/**
 * Created by Sebastian on 30.04.2017.
 */

public class ImageButtonAdapter extends BaseAdapter {
    private Context context;
    private TypedArray images;

    public ImageButtonAdapter(Context context, TypedArray images)
    {
        this.context = context;
        this.images = images;
    }
    public ImageButtonAdapter(Context context, int imageArrayId)
    {
        this.context = context;
        this.images = context.getResources().obtainTypedArray(imageArrayId);
    }

    @Override
    public int getCount() {
        return images.length();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageButton imageButton;
        if (convertView == null)
        {
            imageButton = new ImageButton(context);
            imageButton.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageButton.setScaleType(ImageButton.ScaleType.CENTER_CROP);
            imageButton.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageButton = (ImageButton) convertView;
        }
        imageButton.setImageDrawable(images.getDrawable(position));
        return imageButton;
    }
}
