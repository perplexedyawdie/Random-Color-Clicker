package com.example.inkrediblemachine.randomcolors;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.view.View;

import android.os.Bundle;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    android.widget.Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button6);
        btn2 = findViewById(R.id.button7);
        btn3 = findViewById(R.id.button8);
        btn4 = findViewById(R.id.button9);
        btn5 = findViewById(R.id.button10);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random rnd = new Random();
                btn1.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random rnd = new Random();
                btn2.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random rnd = new Random();
                btn3.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random rnd = new Random();
                btn4.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random rnd = new Random();
                btn5.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

            }

        });


    }

}
