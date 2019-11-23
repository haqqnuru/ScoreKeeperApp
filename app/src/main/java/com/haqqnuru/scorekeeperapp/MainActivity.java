package com.haqqnuru.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pantherScore = 0;
    int vikingScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // panthers scoring
    public void displayForPanthers(int score) {
        TextView panthers = findViewById(R.id.pantherScore);
        panthers.setText(String.valueOf(score));
    }

    public void panthersTouchDown(View view) {
        pantherScore += 6;
        displayForPanthers(pantherScore);
    }

    public void panthersExtra(View view) {
        pantherScore += 1;
        displayForPanthers(pantherScore);
    }

    public void panthersExtra2(View view) {
        pantherScore += 2;
        displayForPanthers(pantherScore);
    }

    public void panthersFieldGoal(View view) {
        pantherScore += 3;
        displayForPanthers(pantherScore);
    }

    public void panthersSafety(View view) {
        pantherScore += 2;
        displayForPanthers(pantherScore);
    }

    // viking scoring
    public void displayForViking(int score) {
        TextView viking = findViewById(R.id.vikingScore);
        viking.setText(String.valueOf(score));
    }

    public void vikingsTouchDown(View view) {
        vikingScore += 6;
        displayForViking(vikingScore);
    }

    public void vikingsExtra(View view) {
        vikingScore++;
        displayForViking(vikingScore);
    }

    public void vikingsExtra2(View view) {
        vikingScore += 2;
        displayForViking(vikingScore);
    }

    public void vikingsFieldGoal(View view) {
        vikingScore += 3;
        displayForViking(vikingScore);
    }

    public void vikingsSafety(View view) {
        vikingScore += 2;
        displayForViking(vikingScore);
    }

    // reset
    public void reset(View view) {
        pantherScore = 0;
        vikingScore = 0;
        displayForViking(vikingScore);
        displayForPanthers(pantherScore);
    }
}