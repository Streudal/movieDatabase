package com.a000webhost.tastreu.moviedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.lightBlue);
    }
}
