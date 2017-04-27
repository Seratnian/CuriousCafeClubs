package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Calender extends AppCompatActivity {
    Calender currentView = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        int[] day_ids =
                {
                        R.id.day_01,
                        R.id.day_02,
                        R.id.day_03,
                        R.id.day_04,
                        R.id.day_05,
                        R.id.day_06,
                        R.id.day_07,
                        R.id.day_08,
                        R.id.day_09,
                        R.id.day_p,
                };

        for (int id : day_ids) {
            ImageButton day = (ImageButton) findViewById(id);
            day.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(currentView, Chatrooms.class);
                    startActivity(intent);
                }
            });
        }
    }
}
