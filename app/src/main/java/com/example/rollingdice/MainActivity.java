package com.example.rollingdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view){
        TextView dice = this.findViewById(R.id.buttonClick);

        Random r = new Random();
        int number = r.nextInt(7);
        dice.setText(Integer.toString(number));
    }
}
