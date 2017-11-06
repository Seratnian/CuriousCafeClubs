package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GameMenu extends AppCompatActivity {
    GameMenu currentView = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView chatroomsButton = (ImageView) findViewById(R.id.chatroomsButton);
        chatroomsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, Calender.class);
                startActivity(intent);
            }
        });

        ImageView messagesButton = (ImageView) findViewById(R.id.messagesButton);
        messagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, Messages.class);
                startActivity(intent);
            }
        });

        ImageView mailsButton = (ImageView) findViewById(R.id.mailsButton);
        mailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, MailOverview.class);
                startActivity(intent);
            }
        });

        ImageView phoneButton = (ImageView) findViewById(R.id.phonesButton);
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, PhoneCalls.class);
                startActivity(intent);
            }
        });

        ImageView guestListButton = (ImageView) findViewById(R.id.guestListButton);
        guestListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, GuestList.class);
                startActivity(intent);
            }
        });

        ImageView photosButton = (ImageView) findViewById(R.id.photosButton);
        photosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, AlbumOverview.class);
                startActivity(intent);
            }
        });
    }
}
