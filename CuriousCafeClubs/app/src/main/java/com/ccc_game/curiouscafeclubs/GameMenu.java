package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class GameMenu extends AppCompatActivity {
    GameMenu currentView = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button chatroomsButton = (Button) findViewById(R.id.chatroomsButton);
        chatroomsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, Calender.class);
                startActivity(intent);
            }
        });

        Button messagesButton = (Button) findViewById(R.id.messagesButton);
        messagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, Messages.class);
                startActivity(intent);
            }
        });

        Button mailsButton = (Button) findViewById(R.id.mailsButton);
        mailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, MailOverview.class);
                startActivity(intent);
            }
        });

        Button phoneButton = (Button) findViewById(R.id.phoneButton);
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, PhoneCalls.class);
                startActivity(intent);
            }
        });
    }
}
