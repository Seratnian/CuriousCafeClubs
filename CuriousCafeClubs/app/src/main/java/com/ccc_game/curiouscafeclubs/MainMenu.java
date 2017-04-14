package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    MainMenu currentView = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.ccc_game.curiouscafeclubs.R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(com.ccc_game.curiouscafeclubs.R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(com.ccc_game.curiouscafeclubs.R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button storyButton = (Button) findViewById(com.ccc_game.curiouscafeclubs.R.id.storyButton);
        storyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, GameMenu.class);
                startActivity(intent);
            }
        });
    }
}
