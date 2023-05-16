package com.example.giff;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class FrameAnim extends AppCompatActivity {

    private ImageView animationCP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_anim);

        animationCP = findViewById(R.id.frame_anim);

        AnimationDrawable frameAnimation = (AnimationDrawable) animationCP.getDrawable();
        frameAnimation.start();

    }
}