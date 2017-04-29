package com.ccc_game.curiouscafeclubs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MailOverview extends AppCompatActivity
{
    MailOverview currentView = this;
    Map<String, List<String>> mails = new LinkedHashMap<String, List<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_overview);

        // TODO: get mail images
        int[] unread = {
                R.drawable.face_01, R.drawable.face_02, R.drawable.face_03, R.drawable.face_04,
                R.drawable.face_05, R.drawable.face_06, R.drawable.face_07
        };
        int[] read = {
                R.drawable.face_08, R.drawable.face_09, R.drawable.face_10, R.drawable.face_11,
                R.drawable.face_12
        };
        int[] successful = {
                R.drawable.face_13, R.drawable.face_14, R.drawable.face_15, R.drawable.face_16,
                R.drawable.face_17, R.drawable.face_18, R.drawable.face_19
        };
        int[] failed = {
                R.drawable.face_20
        };
        // TODO

        int[][] images = { unread, read, successful, failed };
        Context context = this;
        initChildren(context, (GridLayout) findViewById(R.id.gridUnread), unread);
        initChildren(context, (GridLayout) findViewById(R.id.gridRead), read);
        initChildren(context, (GridLayout) findViewById(R.id.gridSuccess), successful);
        initChildren(context, (GridLayout) findViewById(R.id.gridFailed), failed);
    }

    private void initChildren(Context context, GridLayout grid, int[] imgIds)
    {
        for (int imgId : imgIds)
        {
            ImageView view = new ImageView(context);
            view.setImageResource(imgId);
            view.setLayoutParams(new GridView.LayoutParams(85, 85));
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setPadding(8, 8, 8, 8);

            view.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                Intent intent = new Intent(currentView, MailDetail.class);
                startActivity(intent);
                }
            });

            grid.addView(view);
        }
    }
}





























