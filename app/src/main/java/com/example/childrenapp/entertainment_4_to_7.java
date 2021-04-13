package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class entertainment_4_to_7 extends AppCompatActivity {
    Button btnAudio, btnPoem1, btnPoem2, btnPoem3;
    private MediaPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_4_to_7);

        playAudio();
        btnAudio = findViewById(R.id.btn_entertainment_audio_1_4);
        btnPoem1 = findViewById(R.id.btn_poem_1);
        btnPoem2 = findViewById(R.id.btn_poem_2);
        btnPoem3 = findViewById(R.id.btn_poem_3);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
            }
        });

        btnPoem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openPoem1Activity();
            }
        });
        btnPoem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openPoem2Activity();
            }
        });
        btnPoem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openPoem3Activity();
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
            audioPlayer = MediaPlayer.create(this, R.raw.section_5_to_7);
            audioPlayer.start();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    audioPlayer = null;
                }
            }, 4128);   //5 seconds

        }
    }

    public void stopAudio(){
        if (audioPlayer != null) {
            audioPlayer.release();
            audioPlayer = null;
        }
    }

    public void openPoem1Activity(){
        Intent activityIntent = new Intent(this, PoemActvity1.class);
        startActivity(activityIntent);
    }

    public void openPoem2Activity(){
        Intent activityIntent = new Intent(this, PoemActvity2.class);
        startActivity(activityIntent);
    }
    public void openPoem3Activity(){
        Intent activityIntent = new Intent(this, PoemActvity3.class);
        startActivity(activityIntent);
    }
}
