package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView display;
    String operation;
    double num1,num2;
    String result;
    MaterialButton btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_p,btn_m,btn_mu,btn_d,btn_clear,btn_e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        assignId(btn_0,R.id.btn_0);
        assignId(btn_1,R.id.btn_1);
        assignId(btn_2,R.id.btn_2);
        assignId(btn_3,R.id.btn_3);
        assignId(btn_4,R.id.btn_4);
        assignId(btn_5,R.id.btn_5);
        assignId(btn_6,R.id.btn_6);
        assignId(btn_7,R.id.btn_7);
        assignId(btn_8,R.id.btn_8);
        assignId(btn_9,R.id.btn_9);
        assignId(btn_p,R.id.btn_p);
        assignId(btn_m,R.id.btn_m);
        assignId(btn_mu,R.id.btn_mu);
        assignId(btn_d,R.id.btn_d);
        assignId(btn_clear,R.id.btn_clear);
        assignId(btn_e,R.id.btn_e);

    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String displayText = display.getText().toString();

        if (buttonText.equals("C")){
            display.setText("0");
            num1 = 0;
            num2 = 0;
            return;
        }
        if (buttonText.equals("=")){
            num2 = Double.parseDouble(displayText);
            if (operation.equals("plus")){
                result = String.valueOf(num1 + num2);
                display.setText(result);
                num1 = 0;
                num2 = 0;
                return;
            }
            if (operation.equals("minus")){
                result = String.valueOf(num1 - num2);
                display.setText(result);
                num1 = 0;
                num2 = 0;
                return;
            }
            if (operation.equals("mul")){
                result = String.valueOf(num1 * num2);
                display.setText(result);
                num1 = 0;
                num2 = 0;
                return;
            }
            if (operation.equals("div")){
                result = String.valueOf(num1 / num2);
                display.setText(result);
                num1 = 0;
                num2 = 0;
                return;
            }
        }
        if (buttonText.equals("+")){
            operation = "plus";
            num1 = Double.parseDouble(displayText);
            display.setText("0");
        }
        if (buttonText.equals("-")){
            operation = "minus";
            num1 = Double.parseDouble(displayText);
            display.setText("0");
        }
        if (buttonText.equals("*")){
            operation = "mul";
            num1 = Double.parseDouble(displayText);
            display.setText("0");
        }
        if (buttonText.equals("/")){
            operation = "div";
            num1 = Double.parseDouble(displayText);
            display.setText("0");
        }

        display.setText(buttonText);

    }
}