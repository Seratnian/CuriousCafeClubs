package com.ccc_game.curiouscafeclubs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Context context = this;
        setContentView(R.layout.activity_messages);

        // TODO name Buttons according to clubs
        int[] imageButtonIds = { R.id.clubLeaderButton_01, R.id.clubLeaderButton_02, R.id.clubLeaderButton_03, R.id.clubLeaderButton_04 };
        // TODO

        for (int imagebuttonId : imageButtonIds)
        {
            ImageButton messagesButton = (ImageButton) findViewById(imagebuttonId);
            messagesButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Chat.class);
                    startActivity(intent);
                }
            });
        }
    }
}
