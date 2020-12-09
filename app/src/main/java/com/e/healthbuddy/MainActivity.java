package com.e.healthbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickRegister(View view){
            Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent);
    }
    public void onClickLogin(View view){
        Intent intent = new Intent(MainActivity.this,DashActivity.class);
        startActivity(intent);
    }
}