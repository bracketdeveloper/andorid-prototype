package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class entertainment_1_to_4 extends AppCompatActivity {
    Button btnAudio, btnDogVideo, btnCinderellaVideo;
    private MediaPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_1_to_4);

        playAudio();
        btnAudio = findViewById(R.id.btn_entertainment_audio_1_4);
        btnDogVideo = findViewById(R.id.btn_doctor_video);
        btnCinderellaVideo = findViewById(R.id.btn_cinderella_video);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
            }
        });

        btnDogVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openDoctorVideoActivity();
            }
        });
        btnCinderellaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openCinderellaVideoActivity();
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

    public void openDoctorVideoActivity(){
        Intent activityIntent = new Intent(this, DoctorVideoActivity.class);
        startActivity(activityIntent);
    }

    public void openCinderellaVideoActivity(){
        Intent activityIntent = new Intent(this, CinderellaVideoActivity.class);
        startActivity(activityIntent);
    }

}
