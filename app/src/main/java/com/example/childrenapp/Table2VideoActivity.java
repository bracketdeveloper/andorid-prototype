package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Table2VideoActivity extends AppCompatActivity {
    VideoView table2Video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2_video);

        table2Video = findViewById(R.id.table_2_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.table_2;

        Uri uri = Uri.parse(videoPath);
        table2Video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        table2Video.setMediaController(mediaController);
        mediaController.setAnchorView(table2Video);
        table2Video.start();
    }
}
