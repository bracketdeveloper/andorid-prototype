package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class Education_Video_1 extends AppCompatActivity {
    VideoView educationVideo1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education__video_1);

        educationVideo1 = findViewById(R.id.education_video_1);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.education_video_1;

        Uri uri = Uri.parse(videoPath);
        educationVideo1.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        educationVideo1.setMediaController(mediaController);
        mediaController.setAnchorView(educationVideo1);
        educationVideo1.start();
    }
}
