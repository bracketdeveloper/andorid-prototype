package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Education_Video_2 extends AppCompatActivity {
    VideoView educationVideo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education__video_2);
        educationVideo2 = findViewById(R.id.education_video_2);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.education_video_2;

        Uri uri = Uri.parse(videoPath);
        educationVideo2.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        educationVideo2.setMediaController(mediaController);
        mediaController.setAnchorView(educationVideo2);
        educationVideo2.start();
    }
}
