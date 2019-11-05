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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        random = findViewById(R.id.random);
        result = findViewById(R.id.result);
    }

    public int number;

    public void rollDice(){


        switch (number){
            case 1:
                random.setText(question[0]);
                break;
            case 2:
                random.setText(question[1]);
                break;
            case 3:
                random.setText(question[2]);
                break;
            case 4:
                random.setText(question[3]);
                break;
            case 5:
                random.setText(question[4]);
                break;
            case 6:
                random.setText(question[5]);
                break;

        }


    }

    public void buttonClick(View view) {

        try {

            TextView dice = this.findViewById(R.id.buttonClick);

            Random r = new Random();
            number = r.nextInt(7);
            dice.setText(Integer.toString(number));

            int n = Integer.parseInt(numberInput.getText().toString());

            if (n < 1 || n > 6) {
                Toast.makeText(this, "Invalid input number", Toast.LENGTH_SHORT).show();
            } else if (n == number) {
                Toast.makeText(this, "Congratulations, you guessed the number", Toast.LENGTH_SHORT).show();
                counter = counter + 1;
                result.setText(Integer.toString(counter));
            }

            rollDice();
        }
        catch (Exception e){
            Toast.makeText(this,"Please enter number from 1 to 6 ",Toast.LENGTH_SHORT).show();
        }
    }


    public void im_feeling_luckey() {

        Random RN = new Random();
        random.setText(question[RN.nextInt(question.length)]);
    }

    /*public void buttonClick2(View view) {
        im_feeling_luckey();
    }*/

    public void next(View view){
        openActivity2();
    }

    public void openActivity2(){
        Intent intent = new Intent(this, New_iceBreaker.class);
        startActivity(intent);
    }

}



