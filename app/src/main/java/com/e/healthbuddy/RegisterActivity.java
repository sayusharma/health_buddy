package com.e.healthbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void onClickRegisterNow(View view){
        if(validate()){
            Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    private boolean validate() {
        TextInputEditText name,age,medications,allergies,pass;
        name = findViewById(R.id.nameText);
        pass = findViewById(R.id.passRegText);
        age = findViewById(R.id.ageText);
        medications = findViewById(R.id.currMedicationsText);
        allergies = findViewById(R.id.allergiesText);
        if(TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(age.getText()) || TextUtils.isEmpty(allergies.getText())
            || TextUtils.isEmpty(medications.getText())  || TextUtils.isEmpty(pass.getText())){
            Toast.makeText(getApplicationContext(),"FIELDS CANNOT BE EMPTY!",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;

    }
}