package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Education_Video_3 extends AppCompatActivity {
    VideoView educationVideo3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education__video_3);
        educationVideo3 = findViewById(R.id.education_video_3);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.education_video_3;

        Uri uri = Uri.parse(videoPath);
        educationVideo3.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        educationVideo3.setMediaController(mediaController);
        mediaController.setAnchorView(educationVideo3);
        educationVideo3.start();
    }
}
