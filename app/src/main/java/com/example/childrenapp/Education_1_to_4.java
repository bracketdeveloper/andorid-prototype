package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class Education_1_to_4 extends AppCompatActivity {
    Button btnAudio, btnAbcVideo, btnCountingVideo;
    private MediaPlayer audioPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_1_to_4);

        playAudio();
        btnAudio = findViewById(R.id.btn_audio_1_4);
        btnAbcVideo = findViewById(R.id.btn_abc_tune);
        btnCountingVideo = findViewById(R.id.btn_counting_tune);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
            }
        });

        btnAbcVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openAbcVideoActivity();
            }
        });
        btnCountingVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openCountingVideoActivity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopAudio();
    }

    public void playAudio(){

        if (audioPlayer == null){
            audioPlayer = MediaPlayer.create(this, R.raw.section_1_to_4);
            audioPlayer.start();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    audioPlayer = null;
                }
            }, 3864);   //5 seconds

        }
    }

    public void stopAudio(){
        if (audioPlayer != null) {
            audioPlayer.release();
            audioPlayer = null;
        }
    }

    public void openAbcVideoActivity(){
        Intent activityIntent = new Intent(this, AbcVideoActivity.class);
        startActivity(activityIntent);
    }

    public void openCountingVideoActivity(){
        Intent activityIntent = new Intent(this, CountingVideoActivity.class);
        startActivity(activityIntent);
    }



}
