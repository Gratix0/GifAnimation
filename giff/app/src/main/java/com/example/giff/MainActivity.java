package com.example.giff;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button start, end;
    private ImageView capy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        capy = findViewById(R.id.iv);

        AnimationDrawable capybara_animation = (AnimationDrawable) capy.getDrawable();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capybara_animation.start();
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capybara_animation.stop();
            }
        });
    }
}