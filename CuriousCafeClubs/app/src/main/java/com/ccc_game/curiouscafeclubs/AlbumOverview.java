package com.ccc_game.curiouscafeclubs;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class AlbumOverview extends AppCompatActivity {
    AlbumOverview currentView = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_overview);

        GridView gridView = (GridView) findViewById(R.id.albumGrid);
        gridView.setAdapter(new ImageAdapter(this, getResources().obtainTypedArray(R.array.albumImages)));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent = new Intent(currentView, Gallery.class);
                intent.putExtra(Gallery.ARG_IMAGE_ARRAY_ID, R.array.albumImages);
                intent.putExtra(Gallery.ARG_SECTION_NUMBER, position);
                startActivity(intent);
            }
        });

        /*
        ImageView photosButton = (ImageView) findViewById(R.id.photosButton);
        photosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentView, AlbumOverview.class);
                startActivity(intent);
            }
        });
        */

    }
}
