package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class DoctorVideoActivity extends AppCompatActivity {
    VideoView doctorVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_video);

        doctorVideo = findViewById(R.id.doctor_video);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.doctor_song;

        Uri uri = Uri.parse(videoPath);
        doctorVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        doctorVideo.setMediaController(mediaController);
        mediaController.setAnchorView(doctorVideo);
        doctorVideo.start();
    }
}
