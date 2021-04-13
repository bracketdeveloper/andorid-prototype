package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class entertainment_video_1 extends AppCompatActivity {
    VideoView entertainmentVideo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_video_1);

        entertainmentVideo1 = findViewById(R.id.entertainment_video_1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.entertainment_video_1;

        Uri uri = Uri.parse(videoPath);
        entertainmentVideo1.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        entertainmentVideo1.setMediaController(mediaController);
        mediaController.setAnchorView(entertainmentVideo1);
        entertainmentVideo1.start();
    }
}
