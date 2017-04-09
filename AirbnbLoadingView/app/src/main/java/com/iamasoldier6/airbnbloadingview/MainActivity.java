package com.iamasoldier6.airbnbloadingview;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.iv_loading);
        mAnimationDrawable = (AnimationDrawable) mImageView.getBackground();
        mAnimationDrawable.start();
    }
    
}
