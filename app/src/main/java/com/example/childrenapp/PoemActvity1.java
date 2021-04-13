package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PoemActvity1 extends AppCompatActivity {
    VideoView poemVideo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_actvity1);

        poemVideo1 = findViewById(R.id.poem_video_1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.poem_1;

        Uri uri = Uri.parse(videoPath);
        poemVideo1.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        poemVideo1.setMediaController(mediaController);
        mediaController.setAnchorView(poemVideo1);
        poemVideo1.start();
    }
}
