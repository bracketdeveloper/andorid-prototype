package com.example.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class education_4_to_7 extends AppCompatActivity {
    private Button btnAudio, btnTable2, btnTable3, btnTable4;
    private MediaPlayer audioPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_4_to_7);
        playAudio();
        btnAudio = findViewById(R.id.btn_audio_5_7);
        btnTable2 = findViewById(R.id.btn_2_table);
        btnTable3 = findViewById(R.id.btn_3_table);
        btnTable4 = findViewById(R.id.btn_4_table);

        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio();
            }
        });

        btnTable2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openTable2VideoActivity();
            }
        });
        btnTable3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openTable3VideoActivity();
            }
        });
        btnTable4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAudio();
                openTable4VideoActivity();
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

    public void openTable2VideoActivity(){
        Intent activityIntent = new Intent(this, Table2VideoActivity.class);
        startActivity(activityIntent);
    }

    public void openTable3VideoActivity(){
        Intent activityIntent = new Intent(this, Table3VideoActivity.class);
        startActivity(activityIntent);
    }
    public void openTable4VideoActivity(){
        Intent activityIntent = new Intent(this, Table4VideoActivity.class);
        startActivity(activityIntent);
    }

}
