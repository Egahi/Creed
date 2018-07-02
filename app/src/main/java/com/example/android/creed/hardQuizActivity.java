package com.example.android.creed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class hardQuizActivity extends AppCompatActivity {
    // user score
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_quiz);
    }


    /**
     * display result for hard version
     */
    public void displayResultHard(View view) {
        calculateScoreHard();

        String finalScore = getString(R.string.quiz_score) + " " + score + getString(R.string.percentage_sign);

        // display score as a toast
        Toast.makeText(this, finalScore, Toast.LENGTH_LONG).show();

        TextView scoreView = (TextView) findViewById(R.id.reference_label);
        scoreView.setText(getString(R.string.reference));

        // reset score
        score = 0;
    }

    /**
     * calculates the score of the user
     * highlights correct answers green and wrong answers red
     */
    public void calculateScoreHard() {
        // figure user's answer to question one
        EditText answerField = (EditText) findViewById(R.id.question_one_answer);
        String answer = answerField.getText().toString();

        if (answer.toLowerCase().equals(getString(R.string.one_answer).toLowerCase())) {

            // set the color of the correct answer to green
            answerField.setTextColor(getResources().getColor(R.color.green));

            // update score if answer is correct
            updateScore();
        }

        // set color of wrong answer to red, skip if field is blank
        else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question two
        answerField = (EditText) findViewById(R.id.question_two_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.two_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question three
        answerField = (EditText) findViewById(R.id.question_three_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.three_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question four
        answerField = (EditText) findViewById(R.id.question_four_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.four_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question five
        answerField = (EditText) findViewById(R.id.question_five_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.five_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question six
        answerField = (EditText) findViewById(R.id.question_six_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.six_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question seven
        answerField = (EditText) findViewById(R.id.question_seven_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.seven_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question eight
        answerField = (EditText) findViewById(R.id.question_eight_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.eight_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question nine
        answerField = (EditText) findViewById(R.id.question_nine_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.nine_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question ten
        answerField = (EditText) findViewById(R.id.question_ten_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.ten_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else if (!answer.equals("")) {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // convert score to percentage
        score *= 10;
    }

    /**
     * increases the score by a value of 1
     */
    public void updateScore() {
        score++;
    }

    /**
     * resets the score and displays the first page
     */
    public void resetQuiz(View view) {
        score = 0;

        Intent intent = new Intent(this, MainActivity.class);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
