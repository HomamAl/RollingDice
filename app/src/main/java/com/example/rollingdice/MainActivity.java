package com.example.rollingdice;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView numberInput;
    TextView message;
    TextView result;
    int counter = 0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        message = findViewById(R.id.message);

        result = findViewById(R.id.result);
    }




    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void buttonClick(View view) {

        TextView dice = this.findViewById(R.id.buttonClick);

        Random r = new Random();
        int number = r.nextInt(7);
        dice.setText(Integer.toString(number));

        int n = Integer.parseInt(numberInput.getText().toString());

        if (n < 1 || n > 6){
            Toast.makeText(this, "Invalid input number", Toast.LENGTH_SHORT).show();
        }else if (n == number){
            Toast.makeText(this, "Congratulations, you guessed the number", Toast.LENGTH_SHORT).show();
            counter = counter + 1;
            result.setText(Integer.toString(counter));
        }




    }

}

