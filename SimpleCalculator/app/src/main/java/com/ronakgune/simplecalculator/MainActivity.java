package com.ronakgune.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText firstNumber;
    EditText secondNumber;
    TextView result;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button clear;

    double num1,num2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText) findViewById(R.id.editText);
        secondNumber = (EditText) findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.textView);
        add = (Button)findViewById(R.id.button1);
        sub= (Button)findViewById(R.id.button2);
        mul = (Button)findViewById(R.id.button3);
        div = (Button)findViewById(R.id.button4);
        clear = (Button)findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.length() <1 || secondNumber.length() < 1)
                {
                    result.setText("");
                    Toast.makeText(getApplicationContext(), "Enter both numbers!",Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    res = num1 + num2;
                    result.setText(Double.toString(res));
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.length() <1 || secondNumber.length() < 1)
                {
                    result.setText("");
                    Toast.makeText(getApplicationContext(), "Enter both numbers!",Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    res = num1 - num2;
                    result.setText(Double.toString(res));
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.length() <1 || secondNumber.length() < 1)
                {
                    result.setText("");
                    Toast.makeText(getApplicationContext(), "Enter both numbers!",Toast.LENGTH_SHORT).show();
                }
                else {
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    res = num1 * num2;
                    result.setText(Double.toString(res));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNumber.length() <1 || secondNumber.length() < 1)
                {
                    result.setText("");
                    Toast.makeText(getApplicationContext(), "Enter both numbers!",Toast.LENGTH_SHORT).show();
                }
                else {
                        num1 = Double.parseDouble(firstNumber.getText().toString());
                        num2 = Double.parseDouble(secondNumber.getText().toString());
                    if(num2 == 0){
                        Toast.makeText(getApplicationContext(), "Second number cannot be zero!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        res = num1 / num2;
                        result.setText(Double.toString(res));
                    }
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
            }
        });


    }
}
