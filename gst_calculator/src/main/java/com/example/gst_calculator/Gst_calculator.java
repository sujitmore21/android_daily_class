package com.example.gst_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gst_calculator extends AppCompatActivity {

    TextView text_total, text_percentage, total_amount, gst_amount;
    EditText edit_total, edit_percentage;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst_calculator);

        text_total = findViewById(R.id.text_total);
        text_percentage = findViewById(R.id.text_percentage);

        total_amount = findViewById(R.id.total_amount);
        gst_amount = findViewById(R.id.gst_amount);

        edit_total = findViewById(R.id.edit_total);
        edit_percentage = findViewById(R.id.edit_percentage);

        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = Integer.parseInt(edit_total.getText().toString());
                int percentage = Integer.parseInt(edit_percentage.getText().toString());

                int amount = Math.round((total * 100)/(100 + percentage));
                total_amount.setText("Net Amount is "+Integer.toString(amount));

                int gst = total - amount;
                gst_amount.setText("GST Amount is "+Integer.toString(gst));
            }
        });
    }
}
