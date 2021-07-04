package com.example.arvindcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue , etSecondvalue ;
    TextView tvAns;
    Button add, subtract,multiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstvalue = findViewById(R.id.etFirstValue);
        etSecondvalue = findViewById(R.id.etSrcondValue);

        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivided);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstvalue + secondvalue ;
                tvAns.setText("Ans is = "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstvalue - secondvalue ;
                tvAns.setText("Ans is = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstvalue * secondvalue ;
                tvAns.setText("Ans is = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstvalue,secondvalue, ans;
                firstvalue = Integer.parseInt(etfirstvalue.getText().toString());
                secondvalue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstvalue / secondvalue ;
                tvAns.setText("Ans is = "+ans);
            }
        });

    }
}