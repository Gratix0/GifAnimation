package com.example.giff;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenAnim extends AppCompatActivity {
    private ImageView imgAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_anim);

        imgAnim = findViewById(R.id.animationView);

        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
        imgAnim.startAnimation(blinkAnimation);
    }
}