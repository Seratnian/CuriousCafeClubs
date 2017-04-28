package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MailOverview extends AppCompatActivity
{
    MailOverview currentView = this;
    List<String> categories;
    List<String> mailList;
    Map<String, List<String>> mails = new LinkedHashMap<String, List<String>>();
    ExpandableListView expListView;

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

        GridView gridUnread = (GridView) findViewById(R.id.gridUnread);
        gridUnread.setAdapter(new ImageAdapter(this, unread));

        GridView gridRead = (GridView) findViewById(R.id.gridRead);
        gridRead.setAdapter(new ImageAdapter(this, read));

        GridView gridSuccess = (GridView) findViewById(R.id.gridSuccess);
        gridSuccess.setAdapter(new ImageAdapter(this, successful));

        GridView gridFailed = (GridView) findViewById(R.id.gridFailed);
        gridFailed.setAdapter(new ImageAdapter(this, failed));

        for (int[] imgs : images)
        {
            for (int img_id : imgs)
            {
                ImageView view = (ImageView) findViewById(img_id);
                view.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                    Intent intent = new Intent(currentView, MailDetail.class);
                    startActivity(intent);
                    }
                });

            }
        }
    }
}





























