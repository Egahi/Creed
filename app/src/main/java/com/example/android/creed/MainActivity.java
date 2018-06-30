package com.example.android.creed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import junit.runner.Version;

public class MainActivity extends AppCompatActivity {
    String userName;

    //user score
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * display the difficult selection page
     */
    public void displayDifficultyLevelPage (View view) {
        setContentView(R.layout.difficulty_level);
    }

    /**
     * display quiz questions based on difficulty level selected
     */
    public void displayQuizQuestion(View view) {
        // figure out name of user
        EditText nameField = (EditText) findViewById(R.id.name_field);
        userName = nameField.getText().toString();

        // figure out if hard option was picked
        RadioButton radioButton = (RadioButton) findViewById(R.id.hard_option);
        boolean hardOption = radioButton.isChecked();

        // figure out if easy option was picked
        radioButton = (RadioButton) findViewById(R.id.easy_option);
        boolean easyOption = radioButton.isChecked();

        // hard option picked
        if (hardOption) {
            setContentView(R.layout.quiz);
        }
        // easy option picked
        else if (easyOption) {
            setContentView(R.layout.quiz_multiple_choice);
        }
        // prompt user to pick a version
        else {
            Toast.makeText(this, getString(R.string.difficulty_level_prompt), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * display result for hard version
     */
    public void displayResultHard (View view) {
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

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.one_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question two
        answerField = (EditText) findViewById(R.id.question_two_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.two_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question three
        answerField = (EditText) findViewById(R.id.question_three_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.three_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question four
        answerField = (EditText) findViewById(R.id.question_four_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.four_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question five
        answerField = (EditText) findViewById(R.id.question_five_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.five_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question six
        answerField = (EditText) findViewById(R.id.question_six_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.six_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question seven
        answerField = (EditText) findViewById(R.id.question_seven_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.seven_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question eight
        answerField = (EditText) findViewById(R.id.question_eight_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.eight_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question nine
        answerField = (EditText) findViewById(R.id.question_nine_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.nine_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        // figure user's answer to question ten
        answerField = (EditText) findViewById(R.id.question_ten_answer);
        answer = answerField.getText().toString();

        // update score if answer is correct
        if (answer.toLowerCase().equals(getString(R.string.ten_answer).toLowerCase())) {
            answerField.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            answerField.setTextColor(getResources().getColor(R.color.red));
        }

        score *= 10;
    }

    /**
     * increases the score by a value of 1
     */
    public void updateScore() {
        score++;
    }

    /**
     * display result for easy version
     */
    public void displayResultEasy (View view) {
        calculateScoreEasy();

        String finalScore = getString(R.string.quiz_score) + " " + score + getString(R.string.percentage_sign);

        // display score as a toast
        Toast.makeText(this, finalScore, Toast.LENGTH_LONG).show();

        TextView scoreView = (TextView) findViewById(R.id.reference_label);
        scoreView.setText(getString(R.string.reference));

        // reset score
        score = 0;
    }

    /**
     * calculates the score of the user for the multiple choice format
     * highlights wrongs answers in red and correct answers in green
     */
    private void calculateScoreEasy() {
        // figure out if the right option was checked and update the score
        RadioButton radioButton = (RadioButton) findViewById(R.id.question_one_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_one);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_two_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_two);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_three_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_three);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_four_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_four);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_five_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_five);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_six_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_six);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_seven_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_seven);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_eight_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_eight);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_nine_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_nine);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        radioButton = (RadioButton) findViewById(R.id.question_ten_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        }
        else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_ten);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            radioButton.setTextColor(getResources().getColor(R.color.red));
        }

        // convert score to percentage
        score *= 10;
    }

    /**
     * resets the score and displays the first page
     */
    public void resetQuiz(View view) {
        score = 0;
        setContentView(R.layout.activity_main);
    }
}