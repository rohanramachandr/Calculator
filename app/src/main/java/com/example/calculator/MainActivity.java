package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);

    }


    public void add(View view) {


        EditText myTextField1 = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextSecondNumber);

        if(myTextField1.getText().toString().equals("") || myTextField2.getText().toString().equals("")){
            return;
        }

        int firstNumber = Integer.parseInt(myTextField1.getText().toString());
        int secondNumber = Integer.parseInt(myTextField2.getText().toString());


        goToActivity2(String.valueOf(firstNumber + secondNumber));



    }

    public void subtract(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextSecondNumber);

        if(myTextField1.getText().toString().equals("") || myTextField2.getText().toString().equals("")){
            return;
        }

        int firstNumber = Integer.parseInt(myTextField1.getText().toString());
        int secondNumber = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(String.valueOf(firstNumber - secondNumber));


    }

    public void multiply(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextSecondNumber);

        if(myTextField1.getText().toString().equals("") || myTextField2.getText().toString().equals("")){
            return;
        }

        int firstNumber = Integer.parseInt(myTextField1.getText().toString());
        int secondNumber = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(String.valueOf(firstNumber * secondNumber));

    }

    public void divide(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextSecondNumber);

        if(myTextField1.getText().toString().equals("") || myTextField2.getText().toString().equals("")){
            return;
        }

        int firstNumber = Integer.parseInt(myTextField1.getText().toString());
        int secondNumber = Integer.parseInt(myTextField2.getText().toString());

        if(secondNumber == 0){
            return;
        }

        goToActivity2(String.valueOf(firstNumber / secondNumber));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}