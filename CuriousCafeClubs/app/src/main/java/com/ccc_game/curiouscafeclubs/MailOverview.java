package com.ccc_game.curiouscafeclubs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MailOverview extends AppCompatActivity
{

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
        int[] successfull = {
                R.drawable.face_13, R.drawable.face_14, R.drawable.face_15, R.drawable.face_16,
                R.drawable.face_17, R.drawable.face_18, R.drawable.face_19
        };
        int[] failed = {
                R.drawable.face_20
        };
        // TODO


        GridView gridUnread = (GridView) findViewById(R.id.gridUnread);
        gridUnread.setAdapter(new ImageAdapter(this, unread));

        GridView gridRead = (GridView) findViewById(R.id.gridRead);
        gridRead.setAdapter(new ImageAdapter(this, read));

        GridView gridSuccess = (GridView) findViewById(R.id.gridSuccess);
        gridSuccess.setAdapter(new ImageAdapter(this, successfull));

        GridView gridFailed = (GridView) findViewById(R.id.gridFailed);
        gridFailed.setAdapter(new ImageAdapter(this, failed));

    }
}