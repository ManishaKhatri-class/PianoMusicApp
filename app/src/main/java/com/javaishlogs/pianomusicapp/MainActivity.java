package com.javaishlogs.pianomusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //Buttons
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn6;
    private Button btn7;
    // Helpful Constants
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int m1SoundId;
    private int m2SoundId;
    private int m3SoundId;
    private int m4SoundId;
    private int m5SoundId;
    private int m6SoundId;
    private int m7SoundId;
    private SoundPool mSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
         //ToDo: Action bar
        getSupportActionBar().setTitle("MuSiCo - Play Music Like a Game!");
        // TODO: Create a new SoundPool
        final SoundPool mSound = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        m1SoundId = mSound.load(getApplicationContext(), R.raw.note1_c, 1);
        m2SoundId = mSound.load(getApplicationContext(), R.raw.note2_d, 1);
        m3SoundId = mSound.load(getApplicationContext(), R.raw.note3_e, 1);
        m4SoundId = mSound.load(getApplicationContext(), R.raw.note4_f, 1);
        m5SoundId = mSound.load(getApplicationContext(), R.raw.note5_g, 1);
        m6SoundId = mSound.load(getApplicationContext(), R.raw.note6_a, 1);
        m7SoundId = mSound.load(getApplicationContext(), R.raw.note7_b, 1);
        Log.e(TAG, "ID:  "+m1SoundId );
        Log.e(TAG, "ID:  "+m2SoundId );
        Log.e(TAG, "ID:  "+m3SoundId );
        Log.e(TAG, "ID:  "+m4SoundId );
        Log.e(TAG, "ID:  "+m5SoundId );
        Log.e(TAG, "ID:  "+m6SoundId );
        Log.e(TAG, "ID:  "+m7SoundId );

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m1SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m2SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m3SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m4SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m5SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m6SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSound.play(m7SoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);

            }
        });
    }




}