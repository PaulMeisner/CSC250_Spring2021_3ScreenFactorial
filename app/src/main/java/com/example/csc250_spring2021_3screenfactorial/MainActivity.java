package com.example.csc250_spring2021_3screenfactorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputET;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputET = this.findViewById(R.id.inputET);

    }

    public void onFactorialButtonClicked(View v)
    {

        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        i.putExtra("num", this.inputET.getText().toString());
        this.startActivity(i);

    }






}