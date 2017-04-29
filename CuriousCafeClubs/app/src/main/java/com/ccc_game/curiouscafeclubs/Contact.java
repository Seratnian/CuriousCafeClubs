package com.ccc_game.curiouscafeclubs;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

/**
 * Created by Sebastian on 28.04.2017.
 */

public class Contact
{
    private Context context;
    private String contactName;
    private int imageId;

    Contact(Context context, int imageId, String contactName)
    {
        this.context = context;
        this.imageId = imageId;
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public int getImageId() {
        return imageId;
    }

    public LinearLayout getLayout()
    {
        LinearLayout layout = new LinearLayout(context);
        layout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.setGravity(Gravity.CENTER);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView image = new ImageView(context);
        image.setImageResource(imageId);
        layout.addView(image);

        TextView name = new TextView(context);
        name.setText(contactName);
        name.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1f));
        layout.addView(name);

        return layout;
    }
}


/*
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:orientation="horizontal">

        <ImageView
            android:id="@+id/imageView15"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:srcCompat="@drawable/face_16" />

        <TextView
            android:id="@+id/textView16"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/name_03" />
    </LinearLayout>
 */