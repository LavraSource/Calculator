package com.example.xmlexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static byte activeButton=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.calcButton);
        final EditText inputA = findViewById(R.id.editTextA);
        final EditText inputB = findViewById(R.id.editTextB);
        final TextView result = findViewById(R.id.result);

        final Button plus = findViewById(R.id.addButton);
        final Button minus = findViewById(R.id.minusButton);
        final Button mult = findViewById(R.id.multButton);
        final Button divis = findViewById(R.id.divButton);
        plus.setBackgroundColor(Color.YELLOW);
        minus.setBackgroundColor(Color.LTGRAY);
        mult.setBackgroundColor(Color.LTGRAY);
        divis.setBackgroundColor(Color.LTGRAY);
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activeButton=0;
                plus.setBackgroundColor(Color.YELLOW);
                minus.setBackgroundColor(Color.LTGRAY);
                mult.setBackgroundColor(Color.LTGRAY);
                divis.setBackgroundColor(Color.LTGRAY);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activeButton=1;
                minus.setBackgroundColor(Color.YELLOW);
                plus.setBackgroundColor(Color.LTGRAY);
                mult.setBackgroundColor(Color.LTGRAY);
                divis.setBackgroundColor(Color.LTGRAY);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activeButton=2;
                mult.setBackgroundColor(Color.YELLOW);
                plus.setBackgroundColor(Color.LTGRAY);
                minus.setBackgroundColor(Color.LTGRAY);
                divis.setBackgroundColor(Color.LTGRAY);
            }
        });
        divis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                activeButton=3;
                divis.setBackgroundColor(Color.YELLOW);
                plus.setBackgroundColor(Color.LTGRAY);
                minus.setBackgroundColor(Color.LTGRAY);
                mult.setBackgroundColor(Color.LTGRAY);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double ans=0;
                double num1=Double.parseDouble(inputA.getText().toString());
                double num2=Double.parseDouble(inputB.getText().toString());
                switch(activeButton){
                    case 0: ans=num1+num2; break;
                    case 1: ans=num1-num2; break;
                    case 2: ans=num1*num2; break;
                    case 3: ans=num1/num2; break;
                }
                result.setText(String.valueOf(ans));
            }
        });
    }
}