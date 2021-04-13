package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class CinderellaVideoActivity extends AppCompatActivity {
    VideoView cinderellaVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinderella_video);

        cinderellaVideo = findViewById(R.id.cinderella_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.entertainment_video_1;

        Uri uri = Uri.parse(videoPath);
        cinderellaVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        cinderellaVideo.setMediaController(mediaController);
        mediaController.setAnchorView(cinderellaVideo);
        cinderellaVideo.start();
    }
}
