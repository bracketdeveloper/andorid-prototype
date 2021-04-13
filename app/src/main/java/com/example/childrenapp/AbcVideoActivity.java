package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class AbcVideoActivity extends AppCompatActivity {
    VideoView abcVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc_video);

        abcVideo = findViewById(R.id.abc_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.abc_video;

        Uri uri = Uri.parse(videoPath);
        abcVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        abcVideo.setMediaController(mediaController);
        mediaController.setAnchorView(abcVideo);
        abcVideo.start();
    }
}
