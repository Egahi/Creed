package com.example.android.creed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class easyQuizActivity extends AppCompatActivity {
    // user score
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_quiz);
    }

    /**
     * display result for easy version
     */
    public void displayResultEasy(View view) {
        calculateScoreEasy();

        String finalScore = getString(R.string.quiz_score) + " " + score + getString(R.string.percentage_sign);

        // display score as a toast
        Toast.makeText(this, finalScore, Toast.LENGTH_LONG).show();

        // display questions reference
        TextView scoreView = (TextView) findViewById(R.id.reference_label);
        scoreView.setText(getString(R.string.reference));

        // disable Done button after click
        Button button = (Button) findViewById(R.id.done_easy);
        button.setEnabled(false);

        // make button invisible
        button.setVisibility(view.INVISIBLE);

        // reset score
        score = 0;
    }

    /**
     * increases the score by a value of 1
     */
    public void updateScore() {
        score++;
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
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_one);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_two_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_two);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_three_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_three);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_four_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_four);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_five_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_five);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_six_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_six);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_seven_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_seven);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_eight_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_eight);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        // checkboxes for question 9
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.question_nine_a);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.question_nine_answer1);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.question_nine_answer2);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.question_nine_d);

        // grade as passed if and only if the 2 correct options are picked and no other
        if (checkBox2.isChecked() && checkBox3.isChecked() && !checkBox1.isChecked() && !checkBox4.isChecked()) {
            checkBox2.setTextColor(getResources().getColor(R.color.green));
            checkBox3.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            // set wrong selections to color red
            if (checkBox1.isChecked()) {
                checkBox1.setTextColor(getResources().getColor(R.color.red));
            }
            if (checkBox2.isChecked()) {
                checkBox2.setTextColor(getResources().getColor(R.color.red));
            }
            if (checkBox3.isChecked()) {
                checkBox3.setTextColor(getResources().getColor(R.color.red));
            }
            if (checkBox4.isChecked()) {
                checkBox4.setTextColor(getResources().getColor(R.color.red));
            }
        }

        radioButton = (RadioButton) findViewById(R.id.question_ten_answer);
        if (radioButton.isChecked()) {
            radioButton.setTextColor(getResources().getColor(R.color.green));
            updateScore();
        } else {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.question_ten);
            radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            if (radioButton != null) {
                radioButton.setTextColor(getResources().getColor(R.color.red));
            }
        }

        // convert score to percentage
        score *= 10;
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
