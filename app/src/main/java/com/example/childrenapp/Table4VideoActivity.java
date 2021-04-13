package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Table4VideoActivity extends AppCompatActivity {
    VideoView table4Video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table4_video);

        table4Video = findViewById(R.id.table_4_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.table_4;

        Uri uri = Uri.parse(videoPath);
        table4Video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        table4Video.setMediaController(mediaController);
        mediaController.setAnchorView(table4Video);
        table4Video.start();
    }
}
