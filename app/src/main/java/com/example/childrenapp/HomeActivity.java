package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Handler;

public class HomeActivity extends AppCompatActivity {
    private Button btnEducation, btnEntertainment, btnAudio;
    private MediaPlayer optionPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        playOptionAudio();

        btnEducation = findViewById(R.id.btn_education);
        btnEntertainment = findViewById(R.id.btn_entertainment);
        btnAudio = findViewById(R.id.btn_audio_home);

        btnEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEducationActivity();
            }
        });

        btnEntertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEntertainmentActivity();
            }
        });

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playOptionAudio();
            }
        });
//        optionPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                optionPlayer = null;
//            }
//        });
    }

    public void openEducationActivity(){
        if(optionPlayer != null){
            optionPlayer.release();
            optionPlayer = null;
        }
        Intent educationIntent = new Intent(this, Education.class);
        startActivity(educationIntent);
    }
    public void openEntertainmentActivity(){
        if(optionPlayer != null){
            optionPlayer.release();
            optionPlayer = null;
        }
        Intent entertainmentIntent = new Intent(this, Entertainment.class);
        startActivity(entertainmentIntent);
    }

    public void playOptionAudio(){

        if (optionPlayer == null){
            optionPlayer = MediaPlayer.create(this, R.raw.select_option);
            optionPlayer.start();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    optionPlayer = null;
                }
            }, 1560);   //5 seconds

        }

    }
}
