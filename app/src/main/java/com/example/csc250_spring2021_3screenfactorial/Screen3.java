package com.example.csc250_spring2021_3screenfactorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    private String name;
    private TextView answer2TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);

        this.answer2TV = this.findViewById(R.id.answer2TV);
        this.name = this.getIntent().getStringExtra("num");
        String currValue = this.name;
        int num = Integer.parseInt(currValue);

        this.answer2TV.setText(String.valueOf(fact(num)));

    }

    private long fact(long num)
    {

        if(num <= 1)
            return 1;
        else {

            return num * fact(num - 1);
        }

    }
}