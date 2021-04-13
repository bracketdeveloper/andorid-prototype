package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class entertainment_video_2 extends AppCompatActivity {
    VideoView entertainmentVideo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_video_2);
        entertainmentVideo2 = findViewById(R.id.entertainment_video_2);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.entertainment_video_2;

        Uri uri = Uri.parse(videoPath);
        entertainmentVideo2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        entertainmentVideo2.setMediaController(mediaController);
        mediaController.setAnchorView(entertainmentVideo2);
        entertainmentVideo2.start();
    }
}
