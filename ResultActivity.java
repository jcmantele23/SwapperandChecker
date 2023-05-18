package com.example.myapplication23;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView resultTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.resultTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String text1 = extras.getString("text1");
            String text2 = extras.getString("text2");

            if (text1.equals(text2)) {
                resultTextView.setText("SAME");
            } else {
                resultTextView.setText("NOT THE SAME");
            }
        }
    }
}