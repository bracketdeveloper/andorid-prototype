package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;


public class Entertainment extends AppCompatActivity {
    private Button btnAudio, btn1To4Age, btn5To7Age, btn8Age;
    private MediaPlayer ageRangePlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        playAgeRangeAudio();

        btnAudio = findViewById(R.id.btn_audio_entertainment);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgeRangeAudio();
            }
        });
        btn1To4Age = findViewById(R.id.btn_entertainment_1_to_4_age);
        btn5To7Age = findViewById(R.id.btn_entertainment_5_to_7_age);
        btn8Age = findViewById(R.id.btn_entertainment_8_age);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgeRangeAudio();
            }
        });

        btn1To4Age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAgeRangeAudio();
                open1To4AgeActivity();
            }
        });
        btn5To7Age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAgeRangeAudio();
                open5To7AgeActivity();
            }
        });
        btn8Age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAgeRangeAudio();
                open8AgeActivity();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (ageRangePlayer != null){
            ageRangePlayer.release();
            ageRangePlayer = null;
        }

    }
    public void playAgeRangeAudio(){
        if (ageRangePlayer == null){
            ageRangePlayer = MediaPlayer.create(this, R.raw.entertainment_section);
            ageRangePlayer.start();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    ageRangePlayer = null;
                }
            }, 4176);   //5 seconds

        }

    }

    public void open1To4AgeActivity(){
        Intent activityIntent = new Intent(this, entertainment_1_to_4.class);
        startActivity(activityIntent);
    }

    public void open5To7AgeActivity(){
        Intent activityIntent = new Intent(this, entertainment_4_to_7.class);
        startActivity(activityIntent);
    }

    public void open8AgeActivity(){
        Intent activityIntent = new Intent(this, entertainment_8.class);
        startActivity(activityIntent);
    }

    public void stopAgeRangeAudio(){
        if (ageRangePlayer !=null){
            ageRangePlayer.release();
            ageRangePlayer = null;
        }

    }
}
