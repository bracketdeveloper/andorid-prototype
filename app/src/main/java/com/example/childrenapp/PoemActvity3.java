package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class PoemActvity3 extends AppCompatActivity {
    VideoView poemVideo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_actvity3);
        poemVideo3 = findViewById(R.id.entertainment_video_1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.poem_3;

        Uri uri = Uri.parse(videoPath);
        poemVideo3.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        poemVideo3.setMediaController(mediaController);
        mediaController.setAnchorView(poemVideo3);
        poemVideo3.start();
    }
}
