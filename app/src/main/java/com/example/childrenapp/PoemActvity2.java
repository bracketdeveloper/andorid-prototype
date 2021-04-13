package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PoemActvity2 extends AppCompatActivity {
    VideoView poemVideo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_actvity2);
        poemVideo2 = findViewById(R.id.entertainment_video_1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.poem_2;

        Uri uri = Uri.parse(videoPath);
        poemVideo2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        poemVideo2.setMediaController(mediaController);
        mediaController.setAnchorView(poemVideo2);
        poemVideo2.start();
    }
}
