package com.lutful.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            VideoPlayer.Video_url = "https://www.youtube.com/watch?v=9CpRC_JkM04";
            Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
            startActivity(myIntent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.Video_url = "https://www.youtube.com/watch?v=hvJtguJyZtc";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.Video_url = "https://www.youtube.com/watch?v=bNZJCb1FK1w";
                Intent myIntent = new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);

            }
        });






    }
}