package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class education_8 extends AppCompatActivity {
    Button btnAudio, btnVideo1, btnVideo2, btnVideo3;
    private MediaPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_8);
        playAudio();
        btnAudio = findViewById(R.id.btn_education_8_audio);
        btnVideo1 = findViewById(R.id.btn_video_1);
        btnVideo2 = findViewById(R.id.btn_video_2);
        btnVideo3 = findViewById(R.id.btn_video_3);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
            }
        });
        btnVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openVideo1Activity();
            }
        });
        btnVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openVideo2Activity();
            }
        });
        btnVideo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openVideo3Activity();
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
            audioPlayer = MediaPlayer.create(this, R.raw.section_8);
            audioPlayer.start();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    audioPlayer = null;
                }
            }, 3744);   //5 seconds

        }
    }

    public void stopAudio(){
        if (audioPlayer != null) {
            audioPlayer.release();
            audioPlayer = null;

        }
    }

    public void openVideo1Activity(){
        Intent activityIntent = new Intent(this, Education_Video_1.class);
        startActivity(activityIntent);
    }

    public void openVideo2Activity(){
        Intent activityIntent = new Intent(this, Education_Video_2.class);
        startActivity(activityIntent);
    }

    public void openVideo3Activity(){
        Intent activityIntent = new Intent(this, Education_Video_3.class);
        startActivity(activityIntent);
    }
}
