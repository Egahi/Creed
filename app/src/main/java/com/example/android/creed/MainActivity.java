package com.example.android.creed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.creed.MESSAGE";
   int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * display the difficulty level selection page
     */
    public void displayComplexitySelector(View view) {
        Intent intent = new Intent(this, complexitySelectorActivity.class);

        // figure out name of user
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String userName = nameField.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, userName);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}