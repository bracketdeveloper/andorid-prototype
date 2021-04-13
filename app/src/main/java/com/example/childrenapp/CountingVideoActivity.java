package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class CountingVideoActivity extends AppCompatActivity {
    VideoView countingVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_video);

        countingVideo = findViewById(R.id.counting_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.counting_video;

        Uri uri = Uri.parse(videoPath);
        countingVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        countingVideo.setMediaController(mediaController);
        mediaController.setAnchorView(countingVideo);
        countingVideo.start();
    }
}
