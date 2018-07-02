package com.example.android.creed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class complexitySelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexity_selector);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String message = getString(R.string.hello);
        message += " " + userName;

        // Welcome User
        TextView textView = (TextView) findViewById(R.id.welcome_text);
        textView.setText(message);
    }

    /**
     * display quiz questions based on difficulty level selected
     */
    public void displayQuizQuestion(View view) {
        Intent intentEasy = new Intent(this, easyQuizActivity.class);
        Intent intentHard = new Intent(this, hardQuizActivity.class);

        // figure out if hard option was picked
        RadioButton radioButton = (RadioButton) findViewById(R.id.hard_option);
        boolean hardOption = radioButton.isChecked();

        // figure out if easy option was picked
        radioButton = (RadioButton) findViewById(R.id.easy_option);
        boolean easyOption = radioButton.isChecked();

        // hard option picked
        if (hardOption && intentHard.resolveActivity(getPackageManager()) != null) {
            startActivity(intentHard);
        }
        // easy option picked
        else if (easyOption && intentEasy.resolveActivity(getPackageManager()) != null) {
            startActivity(intentEasy);
        }
        // prompt user to pick a version
        else {
            Toast.makeText(this, getString(R.string.difficulty_level_prompt), Toast.LENGTH_SHORT).show();
        }
    }
}