package com.example.sutiwar.currencyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText nepaliAmount;

    public void convert(View v) {
        nepaliAmount =  (EditText) findViewById(R.id.editText);
        nepaliAmount.setText(String.format("%.2f",nepaliAmount));
        Double amount = Double.parseDouble(nepaliAmount.getText().toString());
        Double dollar = amount * 0.0090;
        TextView converted;
        converted = (TextView) findViewById(R.id.tv_converted);
        converted.setText(String.format("%.2f", dollar));
    }

    public void divert(View v) {
        nepaliAmount =  (EditText) findViewById(R.id.editText);
        Double amount = Double.parseDouble(nepaliAmount.getText().toString());
        Double inr;
        inr = Double.parseDouble(nepaliAmount.getText().toString());
        inr = amount * 0.62;
        TextView divert;
        divert = (TextView) findViewById(R.id.tv_converted);
        divert.setText(String.format("%.2f", inr));



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
