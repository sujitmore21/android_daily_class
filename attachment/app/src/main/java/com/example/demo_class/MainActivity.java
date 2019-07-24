package com.example.demo_class;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button bt;
    TextView tx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.etUsNm);
        ed2 = (EditText)findViewById(R.id.etPass);
        bt = (Button)findViewById(R.id.btLgn);

        tx = (TextView)findViewById(R.id.txSt);
        tx.setVisibility(View.GONE);

        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (ed1.getText().toString().equals("android") &&
                        ed2.getText().toString().equals("codekul")) {
                    Toast.makeText(getApplicationContext(), "Login succesfully", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Login unsuccesfully", Toast.LENGTH_SHORT).show();

                    tx.setVisibility(View.VISIBLE);
                    tx.setBackgroundColor(Color.RED);

                }
            }
        });



        }
    }


