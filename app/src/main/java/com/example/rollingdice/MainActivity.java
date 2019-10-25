package com.example.rollingdice;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView numberInput;
    TextView result;
    TextView random;
    int counter = 0;

    String[] question = {"If you could go anywhere in the world, where would you go?",
            "If you were stranded on a desert island, what three things would you want to take with you?",
            "If you could eat only one food for the rest of your life, what would that be?",
            "If you won a million dollars, what is the first thing you would buy?",
            "If you could spaned the day with one fictional character, who would it be?",
            "If you found a magic lantern and a genie gave you three wishes, what would you wish?"};


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        random = findViewById(R.id.random);
        result = findViewById(R.id.result);
    }

    public int number;

    public void roll_the_dice() {

        TextView dice = this.findViewById(R.id.buttonClick);

        Random r = new Random();
        number = r.nextInt(7);
        dice.setText(Integer.toString(number));
    }


    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

    public void buttonClick(View view) {

        roll_the_dice();

        int n = Integer.parseInt(numberInput.getText().toString());

        if (n < 1 || n > 6) {
            Toast.makeText(this, "Invalid input number", Toast.LENGTH_SHORT).show();
        } else if (n == number) {
            Toast.makeText(this, "Congratulations, you guessed the number", Toast.LENGTH_SHORT).show();
            counter = counter + 1;
            result.setText(Integer.toString(counter));
        }
    }


    public void im_feeling_luckey() {

        Random RN = new Random();
        random.setText(question[RN.nextInt(question.length)]);
    }

    public void buttonClick2(View view) {
        im_feeling_luckey();
    }

    public void next(View view){
        openActivity2();
    }

    public void openActivity2(){
        Intent intent = new Intent(this, New_iceBreaker.class);
        startActivity(intent);
    }

}



