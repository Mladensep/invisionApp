package com.example.invisionapp.activity.activity.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.invisionapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashScreenActivity extends AppCompatActivity {

    //private final int SPLASH_DISPLAY_LENGTH = 2500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);


        ButterKnife.bind(this);

//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                /* Create an Intent that will start the Menu-Activity. */
//                Intent mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
//                SplashScreenActivity.this.startActivity(mainIntent);
//                SplashScreenActivity.this.finish();
//            }
//        }, SPLASH_DISPLAY_LENGTH);
    }

    @OnClick(R.id.splash)
    public void next() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
