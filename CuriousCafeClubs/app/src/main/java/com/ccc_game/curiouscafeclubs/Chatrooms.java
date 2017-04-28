package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Chatrooms extends AppCompatActivity {
    Chatrooms currentView = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatrooms);

        ImageButton activeChatButton = (ImageButton) findViewById(R.id.activeChatButton);
        activeChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, Chat.class);
                startActivity(intent);
            }
        });

        Button visualNovelButton = (Button) findViewById(R.id.visualNovelButton);
        visualNovelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, VisualNovel.class);
                startActivity(intent);
            }
        });
    }
}
