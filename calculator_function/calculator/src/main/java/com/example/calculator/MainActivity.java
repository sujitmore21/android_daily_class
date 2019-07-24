package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button add,sub,mul,divide;
    TextView result;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        editText1 = (EditText)findViewById(R.id.et1);
        editText2 = (EditText)findViewById(R.id.et2);

        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        divide = (Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 =Integer.parseInt(editText1.getText().toString());
                num2 =Integer.parseInt(editText2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 =Integer.parseInt(editText1.getText().toString());
                num2 =Integer.parseInt(editText2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 =Integer.parseInt(editText1.getText().toString());
                num2 =Integer.parseInt(editText2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 =Integer.parseInt(editText1.getText().toString());
                num2 =Integer.parseInt(editText2.getText().toString());
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));
            }
        });

    }


}
