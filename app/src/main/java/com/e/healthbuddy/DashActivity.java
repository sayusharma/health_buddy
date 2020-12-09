package com.e.healthbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
    }
    public void onClickFever(View view){
        Intent intent = new Intent(DashActivity.this,DiseaseActivity.class);
        intent.putExtra("label",0);
        startActivity(intent);
    }
    public void onClickCold(View view){
        Intent intent = new Intent(DashActivity.this,DiseaseActivity.class);
        intent.putExtra("label",1);
        startActivity(intent);
    }
}