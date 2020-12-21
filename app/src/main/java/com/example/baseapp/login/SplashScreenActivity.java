package com.example.baseapp.login;

import android.content.Intent;
import android.os.Bundle;

import com.example.baseapp.home.HomeActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;

import com.example.baseapp.R;

public class SplashScreenActivity extends AppCompatActivity {

    private PresenterLogin presenterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        presenterLogin = new PresenterLogin();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                if (presenterLogin.isSignIn())
                    intent = new Intent(getApplicationContext(), HomeActivity.class);
                else
                    intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}