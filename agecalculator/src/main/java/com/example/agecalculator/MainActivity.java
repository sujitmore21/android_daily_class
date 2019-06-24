package com.example.agecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etDOB);
        button = (Button) findViewById(R.id.btGetAge);
        textView = (TextView) findViewById(R.id.tvShowAge);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year;
                int age;

                year = Integer.parseInt(textView.getText().toString());
                age = (2019 - year);

                textView.setText(String.valueOf(age));

            }
        });
    }
}