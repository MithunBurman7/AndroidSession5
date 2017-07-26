package com.example.mithunburman.blinkeffectdemo;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 // Declaring variables or Objects by Mithun Burman as on 26.07.2017.
    private TextView blink;
    private Button  tapbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blink = (TextView) findViewById(R.id.blink);
        tapbtn = (Button) findViewById(R.id.tapbtn);
        tapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liveBlinkeffect();
            }
        });
    }

        private void liveBlinkeffect(){

        ObjectAnimator animation = ObjectAnimator.ofInt(blink, "backgroundColor", Color.BLUE, Color.WHITE, Color.BLUE);
            animation.setDuration(2000);
            // Setting duration for effect 'liveliness'.
            animation.setEvaluator(new ArgbEvaluator());
            animation.setRepeatMode(Animation.REVERSE);
            // Settting repeat mode for blink effect.
            animation.setRepeatCount(Animation.INFINITE);
            // Setting Infinite counting for blinking effect.
            animation.start(); // It will start blink effect.

           }
    }

