package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Table3VideoActivity extends AppCompatActivity {
    VideoView table3Video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table3_video);
        table3Video = findViewById(R.id.table_3_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.table_3;

        Uri uri = Uri.parse(videoPath);
        table3Video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        table3Video.setMediaController(mediaController);
        mediaController.setAnchorView(table3Video);
        table3Video.start();
    }
}
