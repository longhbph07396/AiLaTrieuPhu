package com.aa.ailtriuph.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.aa.ailtriuph.R;
import com.aa.ailtriuph.base.BaseActivity;

public class M1_0ChaoActivity extends BaseActivity implements View.OnClickListener {
    private ImageView imgvIcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        startAnimation();

    }

    private void startAnimation() {
        Animation animation = makeAnimation(R.anim.m1_0_ic_xoay_zoom, imgvIcon);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

               chuyenMHmakeTime(M2_0LoginActivity.class ,500);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }

    //Ánh xạ các thành phần
    private void initView() {
        imgvIcon = (ImageView) findViewById(R.id.imgvIcon);
    }

    @Override
    public void onClick(View v) {

    }


}
