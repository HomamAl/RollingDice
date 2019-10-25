package com.example.rollingdice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class New_iceBreaker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ice_breaker);
    }

    public void previous(View view){
        startActivity(new Intent(New_iceBreaker.this,MainActivity.class));
    }
}
