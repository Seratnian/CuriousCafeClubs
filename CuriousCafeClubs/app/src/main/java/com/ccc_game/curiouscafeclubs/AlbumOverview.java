package com.ccc_game.curiouscafeclubs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class AlbumOverview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_overview);

        GridView grid = (GridView) findViewById(R.id.albumGrid);
        ImageButtonAdapter iba = new ImageButtonAdapter(grid.getContext(), R.array.albumImages);
        grid.setAdapter(iba);
    }
}
