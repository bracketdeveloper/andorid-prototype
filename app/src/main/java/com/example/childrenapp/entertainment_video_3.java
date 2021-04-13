package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class entertainment_video_3 extends AppCompatActivity {
    VideoView entertainmentVideo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_video_3);
        entertainmentVideo3 = findViewById(R.id.entertainment_video_3);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.entertainment_video_2;

        Uri uri = Uri.parse(videoPath);
        entertainmentVideo3.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        entertainmentVideo3.setMediaController(mediaController);
        mediaController.setAnchorView(entertainmentVideo3);
        entertainmentVideo3.start();
    }
}
