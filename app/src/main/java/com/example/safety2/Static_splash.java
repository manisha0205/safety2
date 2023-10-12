package com.example.safety2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Static_splash extends AppCompatActivity {
    final   TextView textView=findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_splash);
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(textView, "alpha",0f, 1f);
        fadeIn.setDuration(1000);
        fadeIn.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeIn.start();
            }
        });
    }
}